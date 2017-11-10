package com.siyuan.service.impl;

import com.siyuan.dataobject.DifAdminUsers;
import com.siyuan.repository.UserRepository;
import com.siyuan.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserImpl implements UserService {

    @Autowired
    private UserRepository repository;

    @Override
    public DifAdminUsers findbyid(int id) {
        return repository.findOne(id);
    }
}
