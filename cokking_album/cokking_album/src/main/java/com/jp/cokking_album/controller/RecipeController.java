package com.jp.cokking_album.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * レシピ管理用
 * @author msm41
 *
 */
@Controller
public class RecipeController {

    /**
     * トップページ（仮実装）.
     * 別Controllerへ実装予定.
     * @param model
     * @return
     */
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String showTop(ModelMap model) {
        model.put("name", "user1");
        return "top";
    }

    /**
     * ログインページ.
     * @param model
     * @return
     */
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String getLogin(ModelMap model) {
        return "login";
    }

//    @RequestMapping(value = "/login", method = RequestMethod.GET)
//    public String getLogout(ModelMap model) {
//        return "redirect:login";
//    }

    /**
     * ウェルカム(仮実装）.
     * 別Controllerへ実装予定.
     * @param model
     * @return
     */
    @RequestMapping(value = "/welcome", method = RequestMethod.GET)
    public String showWelcome(ModelMap model) {
        String message = "ようこそレシピレジストリへ";
        model.put("message", message);
        return "welcome";
    }



    /**
     * レシピ一覧表示.
     * 仮実装.
     */
    @RequestMapping(value = "/list-recipes", method = RequestMethod.GET)
    public String showRecipes(ModelMap model) {
        String[] list = {"カレー","ハンバーグ","牛カツ"};
        model.put("recipes", list);
        return "list-recipes";
    }

    /**
     * ユーザのレシピ一覧表示.
     * 仮実装.
     */
    @RequestMapping(value = "/user/{username}/user-recipes", method = RequestMethod.GET)
    public String showUserRecipes(ModelMap model,@PathVariable("username") String username) {
        String[] list = {"カレー","ハンバーグ","牛カツ", "からあげ"};
        model.put("recipes", list);
        return "user-recipes";
    }

    /**
     * レシピ登録
     */
    public void addRecipe() {

    }

}
