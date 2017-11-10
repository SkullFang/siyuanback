package com.siyuan.service;

import com.siyuan.dataobject.TextMessage;

import java.util.List;

public interface TextMessageService {
    List<TextMessage> findAllBySubjectKind(String SubjetId);

    /**
     * 根据知识点找题目
     * @param id
     * @return
     */
    List<TextMessage> findAllByExamId(int id);
    TextMessage save(TextMessage textMessage);
}











