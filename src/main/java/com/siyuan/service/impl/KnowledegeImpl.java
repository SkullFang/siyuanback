package com.siyuan.service.impl;

import com.siyuan.dataobject.DifKnowledege;
import com.siyuan.dataobject.ExcelItem;
import com.siyuan.dataobject.TextMessage;
import com.siyuan.repository.KnowledegeRepository;
import com.siyuan.service.KnowledegeService;
import com.siyuan.service.TextMessageService;
import com.siyuan.utils.ExcelParse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

@Service
public class KnowledegeImpl implements KnowledegeService {
    @Autowired
    KnowledegeRepository repository;

    @Autowired
    TextMessageService textMessageService;

    @Override
    public List<DifKnowledege> findByid(Integer cid) {


        return repository.findAllByCid(cid);
    }

    @Override
    public void saveKnowledgeOne(int cid,String knowledegeName) {
        DifKnowledege difKnowledege=new DifKnowledege();
        difKnowledege.setCname(knowledegeName);
        difKnowledege.setPid(0);
        difKnowledege.setType(1);
        difKnowledege.setCid(cid);
        repository.save(difKnowledege);

    }

    @Override
    public void saveKnowledgeTwo(int cid, int pid, String knowledegeName) {
        DifKnowledege difKnowledege=new DifKnowledege();
        difKnowledege.setCname(knowledegeName);
        difKnowledege.setPid(pid);
        difKnowledege.setType(1);
        difKnowledege.setCid(cid);
        repository.save(difKnowledege);
    }

    @Override
    public DifKnowledege findKnowledge(int id) {
       return repository.findOne(id);
    }

    @Override
    public List<DifKnowledege> findAll() {
        return repository.findAll();
    }

    /**
     *
     * @param id 知识点ID
     * @param newName 知识点的新名字
     */

    @Override
    public void update(int id, String newName) {
        DifKnowledege difKnowledege=repository.findOne(id);
        difKnowledege.setCname(newName);
        repository.save(difKnowledege);
    }

    /**
     *
     * @param id 知识点ID
     */
    @Override
    public void delete(int id) {
        repository.delete(id);
    }

    /**
     *
     * @param cid
     * @return
     */
    @Override
    public List<DifKnowledege> findOne(int cid) {
        List<DifKnowledege> resultTemp=repository.findAllByCid(cid);
        List<DifKnowledege> result=new ArrayList<>();
        for(DifKnowledege difKnowledege:resultTemp){
            if(difKnowledege.getPid()==0 && difKnowledege.getType()==1){
                result.add(difKnowledege);
            }
        }

        return result;
    }

    /**
     * 根据PID找自己的儿子
     * @param pid
     * @return
     */

    @Override
    public List<DifKnowledege> findChild(int pid) {
        return repository.findAllByPid(pid);
    }

    /**
     * 根据名字找ID
     * @param cname
     * @return
     */
    @Override
    public DifKnowledege findByName(String cname) {
        return repository.findByCname(cname);
    }

    @Override
    public void parseAndSave(InputStream inputStream){
//        ArrayList<ExcelItem> items = ExcelParse.parseTest("excelPath");
        ArrayList<ExcelItem> items = ExcelParse.parseExcelStream(inputStream);
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
        }
    }
}
