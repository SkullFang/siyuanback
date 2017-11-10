package com.siyuan.repository;

import com.siyuan.dataobject.DifSubjects;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;


@RunWith(SpringRunner.class)
@SpringBootTest
public class SubjectsRepositoryTest{

    @Autowired
    private SubjectsRepository repository;

    @Test
    public void saveTest(){
        DifSubjects difSubjects=new DifSubjects();
        difSubjects.setId(13);
        difSubjects.setSubjectName("化学");
        difSubjects.setSubjectStatus(1);
        repository.save(difSubjects);

    }

    @Test
    public void updateTest(){
        DifSubjects difSubjects=repository.findOne(15);
        difSubjects.setSubjectName("高等数学");
        repository.save(difSubjects);

    }
}