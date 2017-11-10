package com.siyuan.repository;


import com.siyuan.dataobject.DifAdminUsers;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<DifAdminUsers,Integer> {
    DifAdminUsers findById(Integer id);
}
