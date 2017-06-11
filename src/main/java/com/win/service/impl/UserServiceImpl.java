package com.win.service.impl;

import com.win.dao.UserDao;
import com.win.model.User;
import com.win.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.inject.Inject;
import java.util.List;

/**
 * Created by pocan on 2017/6/1
 */
@Service
public class UserServiceImpl implements UserService {

    private UserDao userDao;

    public UserDao getUserDao() {
        return userDao;
    }


    public void setUserDao(UserDao userDao){
        this.userDao = userDao;
    }

    /**
     * 插入指定用户
     */
    public int insertUser(User user) {
        return userDao.insertUser(user);
    }

    /**
     * 选择指定id的用户
     * @param id
     * @return
     */
    public User selectUser(int id) {
        return userDao.selectUser(id);
    }

    /**
     * 选择所有用户
     * @return
     */
    public List<User> selectAllUsers(){
        return userDao.selectAllUsers();
    }

    /**
     * 删除用户
     */
    public void deleteUser(int id) {
         this.userDao.deleteUser(id);
    }

    /**
     * 通过用户名选择用户
     */
    public List<User> selectUserByName(String userName) {
        return userDao.selectUserByName(userName);
    }

    /**
     * 清空用户
     */
    public void emptyUser() {
        this.userDao.emptyUser();
    }

}
