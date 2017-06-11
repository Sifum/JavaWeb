package com.win.dao;

import com.win.model.User;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by pocan on 2017/5/31.
 */
@Repository
public interface UserDao {
    /**
     * 插入用户
     * @param user
     * @return
     */
    public int insertUser(User user);

//    public void updateUser(User user);

    /**
     * 删除指定id用户
     * @param id
     */
    public void deleteUser(Integer id);

    /**
     * 选择指定id的用户
     * @param id
     * @return
     */
    public User selectUser(Integer id);

    /**
     * 通过用户名搜索用户
     */
    public List<User> selectUserByName(String userName);

    /**
     * 选取所有用户
     * @return
     */
    public List<User> selectAllUsers();

    /**
     * 清空所以用户
     */
    public void emptyUser();


}
