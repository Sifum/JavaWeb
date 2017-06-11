package com.win.controller;

import com.win.dao.UserDao;
import com.win.model.User;
import com.win.service.UserService;
import com.win.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;


/**
 * Created by pocan on 2017/6/1.
 */
@Controller
public class IndexController {

    @Autowired
    private UserDao userDao;

    @RequestMapping(value = "/index")
    public String index(Model model, ModelMap map) {
        map.put("name", "kimi");
        return "index.page";
    }

}
