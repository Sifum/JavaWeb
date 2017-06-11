package com.win;

/**
 * Created by pocan on 2017/6/1.
 */
import com.win.model.User;
import com.win.service.UserService;
import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)		//表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})

public class MybatisTest {
    private static Logger logger = Logger.getLogger(MybatisTest.class);
    //	private ApplicationContext ac = null;
    @Resource
    private UserService userService = null;

//	@Before
//	public void before() {
//		ac = new ClassPathXmlApplicationContext("applicationContext.xml");
//		userService = (IUserService) ac.getBean("userService");
//	}

    @Test
    public void test1() {
        User user = userService.selectUser(1);
        // System.out.println(user.getUserName());
        // logger.info("值："+user.getUserName());
        logger.info(user);
    }
}