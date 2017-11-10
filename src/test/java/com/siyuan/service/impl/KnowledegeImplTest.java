package com.siyuan.service.impl;

import com.siyuan.dataobject.DifKnowledege;
import com.siyuan.repository.KnowledegeRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class KnowledegeImplTest {
    @Autowired
    private KnowledegeRepository repository;

    @Test
    public void findByid() throws Exception {
    }

    @Test
    public void saveKnowledgeOne() throws Exception {
        DifKnowledege difKnowledege=new DifKnowledege();
        difKnowledege.setCname("积分");
        difKnowledege.setPid(0);
        difKnowledege.setType(1);
        difKnowledege.setCid(0);
        repository.save(difKnowledege);
    }

    @Test
    public void saveKnowledgeTwo(){
        DifKnowledege difKnowledege=new DifKnowledege();
        difKnowledege.setCname("这是1的儿子");
        difKnowledege.setPid(1);
        difKnowledege.setType(1);
        difKnowledege.setCid(2);
        repository.save(difKnowledege);
    }

}