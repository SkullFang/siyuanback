package com.siyuan.service;

import com.siyuan.dataobject.DifKnowledege;
import jdk.internal.util.xml.impl.Input;

import java.io.InputStream;
import java.util.List;

public interface KnowledegeService {
    /**
     *
     * @param cid
     * @return
     * 根据科目id查找知识点
     */
    List<DifKnowledege> findByid(Integer cid);

    /**
     *
     * @param cid
     * @param knowledegeName
     * 根据科目和名字添加一级知识点
     */
    void saveKnowledgeOne(int cid,String knowledegeName);

    /**
     *
     * @param cid
     * @param pid
     * @param knowledegeName
     *
     */
    void saveKnowledgeTwo(int cid,int pid,String knowledegeName);

    /**
     *
     * @param id
     * @return
     */
    DifKnowledege findKnowledge(int id);

    /**
     *
     * @return
     */
    List<DifKnowledege> findAll();

    /**
     *
     * @param id 知识点ID
     * @param newName 知识点的新名字
     */
    void update(int id,String newName);

    /**
     * 删除知识点
     * @param id 知识点ID
     */
    void delete(int id);

    /**
     * 获取科目的所有一级知识点
     * @param cid
     * @return
     */
    List<DifKnowledege> findOne(int cid);

    /**
     * 找儿子
     * @param pid
     * @return
     */
    List<DifKnowledege> findChild(int pid);

    /**
     * 根据名字找ID
     * @param cname
     * @return
     */
    DifKnowledege findByName(String cname);

    /**
     * 解析excel表格
     * 存入数据库
     */
    void parseAndSave(InputStream inputStream);



}
