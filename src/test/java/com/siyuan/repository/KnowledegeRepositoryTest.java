package com.siyuan.repository;

import com.siyuan.dataobject.DifKnowledege;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;


@RunWith(SpringRunner.class)
@SpringBootTest
public class KnowledegeRepositoryTest {

    @Autowired
    private KnowledegeRepository repository;

    @Test
    public void testsave(){
        DifKnowledege difKnowledege=new DifKnowledege();
        difKnowledege.setId(51);
        difKnowledege.setCname("积分");
        difKnowledege.setCid(2);
        difKnowledege.setType(1);
        difKnowledege.setPid(0);
        repository.save(difKnowledege);
    }

    @Test
    public void findByCid(){
        List<DifKnowledege> result=repository.findAllByCid(2);

        Assert.assertNotEquals(0,result);

    }

    @Test
    public void findByPid(){
        List<DifKnowledege> result=repository.findAllByPid(32);
        Assert.assertNotEquals(0,result.size());
    }

    @Test
    public void findByCname(){
        DifKnowledege difKnowledege=repository.findByCname("集合");
        int m=difKnowledege.getId();
        Assert.assertEquals(1,m);



    }



}