package com.siyuan.controller;


import com.siyuan.VO.KnowledgeVO;
import com.siyuan.dataobject.DifKnowledege;
import com.siyuan.dataobject.DifSubjects;
import com.siyuan.service.KnowledegeService;
import com.siyuan.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.ArrayList;
import java.util.List;
@CrossOrigin
@RestController
@RequestMapping("/knowledege")
public class KnowledegeController {
    @Autowired
    private KnowledegeService knowledegeService;


    /*
    根据科目获取所有关于这个科目的知识点。有关联版
     */
    @GetMapping("/getAllBy/{cid}")
    public List<KnowledgeVO> getAll(@PathVariable("cid") Integer cid){
        //1 查询科目下所有的知识点
        List<DifKnowledege> result_temp=knowledegeService.findByid(cid);
        List<DifKnowledege> result=new ArrayList<DifKnowledege>();
        List<KnowledgeVO> knowledgeVOList=new ArrayList<>();
        for(DifKnowledege dif:result_temp){
            if(dif.getPid()==0 && dif.getType()==1){
                KnowledgeVO kvo=new KnowledgeVO();
                kvo.setCName(dif.getCname());
                kvo.setCType(dif.getType());
                List<DifKnowledege> child=new ArrayList<>();
                for(DifKnowledege sub_dif:result_temp){
                    if(sub_dif.getPid().equals(dif.getId())){
                        child.add(sub_dif);
                    }
                }
                kvo.setList(child);
                knowledgeVOList.add(kvo);
            }
        }

       return knowledgeVOList;
    }
    /*
    根据科目获取关于这个科目知识点。无关联版
     */
    @GetMapping("/list/{cid}")
    public List<DifKnowledege> list(@PathVariable("cid") Integer cid){
        List<DifKnowledege> findResult=knowledegeService.findByid(cid);
        List<DifKnowledege> result=new ArrayList<>();
        for(DifKnowledege dif:findResult){
            if(dif.getType()==1){
                result.add(dif);
            }
        }
        return result;
    }
    /*
    插入一个一级知识点
     */
    @PutMapping("/saveOne/{cid}")
    public void saveOne(@PathVariable("cid") Integer cid,
                        @PathParam("kName") String kName){

        knowledegeService.saveKnowledgeOne(cid,kName);
    }
    /*
    插入一个二级知识点
     */
    @PutMapping("/saveTwo/{cid}")
    public void saveTWo(@PathVariable("cid") Integer cid,
                        @PathParam("pid") Integer pid,
                        @PathParam("kName") String kName){

        knowledegeService.saveKnowledgeTwo(cid,pid,kName);
    }
    /*
    查看知识点
     */
    @GetMapping("/getOne/{id}")
    public KnowledgeVO getOne(@PathVariable("id") Integer id){
        DifKnowledege difKnowledege=knowledegeService.findKnowledge(id);
        List<DifKnowledege> result_temp=knowledegeService.findAll();
        KnowledgeVO kvo=new KnowledgeVO();
        /*
        一级知识点：返回它和它所有的孩子
         */
        if(difKnowledege.getPid()==0 && difKnowledege.getType()==1){

            kvo.setCType(1);//如果是一级知识点就返回1
            kvo.setCName(difKnowledege.getCname());

            List<DifKnowledege> child=new ArrayList<>();
            for(DifKnowledege sub_dif:result_temp){
                if(sub_dif.getPid().equals(difKnowledege.getId())){
                    child.add(sub_dif);
                }
            }
            kvo.setList(child);
        }
        /*
       二级知识点：返回它的它的父亲
         */
        if(difKnowledege.getPid()!=0 && difKnowledege.getType()==1){
            kvo.setCType(2);//如果是一级知识点就返回1
            kvo.setCName(difKnowledege.getCname());
            DifKnowledege pdif=knowledegeService.findKnowledge(difKnowledege.getPid());
            kvo.setPname(pdif.getCname());
        }

        return kvo;
    }

    /**
     * 修改知识点
     * @param id
     * @param newName
     */
    @PutMapping("/update/{id}")
    public void update(@PathVariable("id") Integer id,
                       @PathParam("newName") String newName){
        knowledegeService.update(id,newName);
    }

    /**
     * 删除知识点
     * @param id
     */

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable("id") Integer id){
        knowledegeService.delete(id);
    }


}
