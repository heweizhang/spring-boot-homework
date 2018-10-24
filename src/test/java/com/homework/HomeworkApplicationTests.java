package com.homework;

import com.homework.entity.User;
import com.homework.mapper.UserMapper;
import com.homework.utils.RedisUtil;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HomeworkApplicationTests {

    @Test
    public void contextLoads() {
    }

    @Resource
    private UserMapper userMapper;

    @Test
    public void testSelect() {
        System.out.println("----- selectAll method test ------");
        List<User> userList = userMapper.selectList(null);
        Assert.assertEquals(1, userList.size());
        userList.forEach(System.out::println);

    }


    @Autowired
    RedisUtil redisUtil;

    @Test
    public void redisTest(){
        redisUtil.set("1234234werwersdf","werwer");
        String age = "age";
        redisUtil.set(age,"100");
        System.out.println("redisUtil :::" + redisUtil.get(age));
        System.out.println("redisUtil :::" + redisUtil.get("1234234werwersdf"));
    }

}
