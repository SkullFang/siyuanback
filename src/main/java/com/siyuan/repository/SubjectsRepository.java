package com.siyuan.repository;

import com.siyuan.dataobject.DifSubjects;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubjectsRepository extends JpaRepository<DifSubjects,Integer> {
}
