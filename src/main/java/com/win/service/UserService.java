package com.win.service;

import com.win.model.User;

import java.util.List;

/**
 * Created by pocan on 2017/6/1.
 */
public interface UserService {


    /**
     * 插入指定用户
     */
    public int insertUser(User user);

    /**
     *选择一个用户
     * @param id
     * @return
     */
    public User selectUser(int id);

    /**
     * 删除指定id用户
     */
    public void deleteUser(int id);

    /**
     * 通过用户名删除用户
     */
    public List<User> selectUserByName(String userName);


    /**
     * 返回所有用户
     * @return
     */
    public List<User> selectAllUsers();

    /**
     * 清空用户
     */
    public void emptyUser();
}
