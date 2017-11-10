package com.siyuan.repository;

import com.siyuan.dataobject.TextMessage;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TextMessageRepository extends JpaRepository<TextMessage,Integer> {
    List<TextMessage> findAllBySubjectkind(String subjectId);

}
