package com.siyuan.service;

import com.siyuan.dataobject.DifSubjects;

import java.util.List;

public interface SubjectService {
    List<DifSubjects> findAll();
    void save(DifSubjects difSubjects);
    DifSubjects update(int id,String newName);
    DifSubjects findById(int id);
    void delete(int id);
}
