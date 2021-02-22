package com.jp.cokking_album.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.Errors;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.jp.cokking_album.dto.Users;
import com.jp.cokking_album.service.UsersService;

@Controller
@RequestMapping("/users")
public class UsersController {

    private UsersService usersService;

    public UsersController(UsersService usersService) {
        this.usersService = usersService;
    }

    @RequestMapping(value = "/regist", method = RequestMethod.POST)
    public String userRegist(@Validated @ModelAttribute("user") Users users, Errors errors, ModelMap model) {

        if(errors.hasErrors()) {
            throw new RuntimeException((Throwable) errors);
        }
        model.put("user_result", usersService.register(users));
        return "user_info";
    }

    @RequestMapping(value = "/user_info", method = RequestMethod.POST)
    public String userInfo(@RequestParam int user_id, ModelMap model) {

        model.put("user_result", usersService.findById(user_id));
        return "user_info";
    }

}
