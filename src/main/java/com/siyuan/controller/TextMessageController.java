package com.siyuan.controller;


import com.siyuan.dataobject.TextMessage;
import com.siyuan.repository.TextMessageRepository;
import com.siyuan.service.TextMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/textmessage")
public class TextMessageController {

    @Autowired
    private TextMessageService textMessageService;
    @CrossOrigin
    @GetMapping("/getAllBy/{subjectid}")
    List<TextMessage> findAll(@PathVariable("subjectid") String subjectId){
//        response.setHeader("Access-Control-Allow-Origin", "*");


        return textMessageService.findAllBySubjectKind(subjectId);
    }

}
