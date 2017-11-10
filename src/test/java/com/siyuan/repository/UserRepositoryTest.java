package com.siyuan.repository;

import com.siyuan.dataobject.DifAdminUsers;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserRepositoryTest {

    @Autowired
    private UserRepository repository;

    @Test
    public void SaveTest(){
        DifAdminUsers difAdminUsers=new DifAdminUsers();
        difAdminUsers.setUsername("孙菲菲");
        difAdminUsers.setRealname("菲菲");
        difAdminUsers.setAuthKey("教师");
        difAdminUsers.setPasswordHash("sunfeifei");
        difAdminUsers.setEmail("xxxx@ecnu.com");
        difAdminUsers.setStatus(1);
        difAdminUsers.setAvatar("什么鬼");
        difAdminUsers.setSchool("华东示范大学");
        difAdminUsers.setBirthday("2017-1-1");
        repository.save(difAdminUsers);

    }

    @Test
    public void findone(){
        String name=repository.findOne(2).getRealname();
        int id=repository.findOne(2).getId();

    }
}