package com.siyuan.service.impl;

import com.siyuan.service.SubjectService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SubjectImplTest {

    @Autowired
    private SubjectService service;

    @Test
    public void findAll() throws Exception {
    }

    @Test
    public void save() throws Exception {
    }

    @Test
    public void update(){
        service.update(16,"计算机");
    }

}