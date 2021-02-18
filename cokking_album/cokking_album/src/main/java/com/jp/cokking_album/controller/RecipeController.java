package com.jp.cokking_album.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * レシピ管理用
 * @author msm41
 *
 */
@Controller
@RequestMapping(value="/")
public class RecipeController {

    /**
     * トップページ（仮実装）.
     * 別Controllerへ実装予定.
     * @param model
     * @return
     */
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String showWelcome(ModelMap model) {
        String message = "ようこそレシピレジストリへ";
        model.put("message", message);
        return "welcome";
    }

    /**
     * レシピ一覧表示
     * 仮実装.
     */
    @RequestMapping(value = "/list-recipes", method = RequestMethod.GET)
    public String showRecipes(ModelMap model) {
        String[] list = {"カレー","ハンバーグ","牛カツ"};
        model.put("recipes", list);
        return "list-recipes";
    }

    /**
     * レシピ登録
     */
    public void addRecipe() {

    }

}
