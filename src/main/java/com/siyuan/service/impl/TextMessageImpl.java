package com.siyuan.service.impl;

import com.siyuan.dataobject.TextMessage;
import com.siyuan.repository.TextMessageRepository;
import com.siyuan.service.TextMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TextMessageImpl implements TextMessageService{

    @Autowired
    private TextMessageRepository repository;

    @Override
    public List<TextMessage> findAllBySubjectKind(String SubjetId) {

        return repository.findAllBySubjectkind(SubjetId);
    }
}
