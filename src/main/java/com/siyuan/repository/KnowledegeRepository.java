package com.siyuan.repository;

import com.siyuan.dataobject.DifKnowledege;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface KnowledegeRepository extends JpaRepository<DifKnowledege,Integer> {
    public List<DifKnowledege> findAllByCid(Integer id);
    public List<DifKnowledege> findAllByPid(Integer pid);
    public DifKnowledege findByCname(String cname);
}
