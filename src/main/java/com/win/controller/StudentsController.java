package com.win.controller;

import com.win.dao.UserDao;
import com.win.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by pocan on 2017/6/9.
 */
@Controller
@RequestMapping("/students")
public class StudentsController {

    @Autowired
    private UserDao userDao;

    @RequestMapping(value = "/list")
    public String index(Model model) {
        List<User> users= userDao.selectAllUsers();
        model.addAttribute("users", users);
        model.addAttribute("emp", "emp");
        return "tiles/students";
    }

    @RequestMapping(value = "list/delete/{id}")
    public String delete(@PathVariable(value = "id", required = false) Integer id, Model model) {
        userDao.deleteUser(id);
        model.addAttribute("msg", "删除成功！");
        return "redirect:/students/list";
    }

    @RequestMapping(value = "/list/insert/user")
    public String insert(@Valid User user, Model model) {
        int result = userDao.insertUser(user);
        System.out.println("result:" + result);
        model.addAttribute("msg", "插入成功！");
        return "redirect:/students/list";
    }

    @RequestMapping(value = "/list/empty/user")
    public String empty(Model model) {
        System.out.println("In empty function");
        userDao.emptyUser();
        model.addAttribute("msg", "清空成功！");
        return "redirect:/students/list";
    }

    @RequestMapping(value = "list/search")
    public String search(@RequestParam("userName") String userName, Model model) {
        System.out.println("In search function");
        System.out.println("username" + userName);
        List<User> users = userDao.selectUserByName(userName);
        model.addAttribute("users", users);
        return "students.page";
    }
}
