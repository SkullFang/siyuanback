package com.siyuan.service;

import com.siyuan.dataobject.TextMessage;

import java.util.List;

public interface TextMessageService {
    List<TextMessage> findAllBySubjectKind(String SubjetId);
}











