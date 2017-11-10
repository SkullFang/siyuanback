package com.siyuan.service.impl;

import com.siyuan.dataobject.DifKnowledege;
import com.siyuan.repository.KnowledegeRepository;
import com.siyuan.service.KnowledegeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KnowledegeImpl implements KnowledegeService {
    @Autowired
    KnowledegeRepository repository;

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


}
