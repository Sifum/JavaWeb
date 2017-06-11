package com.win.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by pocan on 2017/6/11.
 */
@Controller
public class FreeMarkerController {

    @RequestMapping(value = "/login")
    public String index(HttpServletRequest req, Model model) {
        return "login.page";
    }

    @RequestMapping(value = "/layout")
    public String test(HttpServletRequest req, Model model) {
        return "default.template";
    }
}
