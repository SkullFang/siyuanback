package com.siyuan.service.impl;

import com.siyuan.dataobject.DifKnowledege;
import com.siyuan.dataobject.ExcelItem;
import com.siyuan.dataobject.TextMessage;
import com.siyuan.repository.KnowledegeRepository;
import com.siyuan.service.TextMessageService;
import com.siyuan.utils.ExcelParse;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class KnowledegeImplTest {
    @Autowired
    TextMessageService textMessageService;
    @Test
    public void parseAndSave() throws Exception {
        ArrayList<ExcelItem> items = ExcelParse.parseTest("excelPath");
        DifKnowledege knowledege = null;
        TextMessage textMessage = null;
        for(ExcelItem item : items){
            String itemName = item.getItemName();
            knowledege = repository.findByCname(itemName);
//            int examid = -1;
//            如果在数据库中没有找到examid，那么这条数据不插入数据库中
            if(knowledege != null){
                textMessage = new TextMessage(knowledege.getId(),"1",item.getItemQues(), item.getItemAns(), item.getItemLevel(),
                        item.getItemAnsA(), item.getItemAnsB(), item.getItemAnsC(), item.getItemAnsD(),
                        "", item.getItemAnaly(), item.getItemShow(),item.getItemType());
                textMessageService.save(textMessage);
            }

            // TODO: 2017/11/12 zhao
        }
    }

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