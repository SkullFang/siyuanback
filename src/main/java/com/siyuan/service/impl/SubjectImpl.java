package com.siyuan.service.impl;

import com.siyuan.dataobject.DifSubjects;
import com.siyuan.repository.SubjectsRepository;
import com.siyuan.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
 class SubjectImpl implements SubjectService {

    @Autowired
    private SubjectsRepository repository;

    @Override
    public List<DifSubjects> findAll() {
        return repository.findAll();
    }

    @Override
    public void save(DifSubjects difSubjects) {
        repository.save(difSubjects);
    }


    /*
    更新
     */
    @Override
    public DifSubjects update(int id,String newName) {
        DifSubjects difSubjects=repository.findOne(id);
        difSubjects.setSubjectName(newName);
        return repository.save(difSubjects);

    }

    @Override
    public DifSubjects findById(int id) {
        return repository.findOne(id);
    }

    @Override
    public void delete(int id) {
        repository.delete(id);
    }


}
