package com.siyuan.repository;

import com.siyuan.dataobject.TextMessage;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.beans.Transient;
import java.util.List;

import static org.junit.Assert.*;



@RunWith(SpringRunner.class)
@SpringBootTest
public class TextMessageRepositoryTest {

    @Autowired
    private TextMessageRepository repository;

    @Test
    @Transient
    public void TestSave(){
        for(int i=0;i<100;i++) {
            TextMessage textMessage = new TextMessage();
            //textMessage.setTitleId(10);
            textMessage.setExamid(41);
            ;
//        textMessage.setSubjectKind("1");
            textMessage.setSubjectkind("1");
            textMessage.setTitlebody("1. 关于集合的元素，下列说法中正确的是（  ）");
            textMessage.setAnswer("C");
            textMessage.setHardlevel(1);
            textMessage.setA(" 集合中的元素是可以重复的");
            textMessage.setB(" 集合中的元素任意换掉一个没有影响");
            textMessage.setC(" 集合中的元素是可以交换顺序的");
            textMessage.setD(" 集合中一定要有至少一个元素");
            textMessage.setAnalysis("一个选择题的解析");
            textMessage.setIsshow(0);
            textMessage.setType(1); //1是选择题
            repository.save(textMessage);
        }


    }

    @Test
    public void findAllBySubjectKind() throws Exception {
        List<TextMessage> result=repository.findAllBySubjectkind("2");
        Assert.assertNotEquals(0,result.size());

    }

    @Test
    public void findALlbyExam(){
        List<TextMessage> result=repository.findAllByExamid(1);
        Assert.assertNotEquals(0,result.size());
    }

}