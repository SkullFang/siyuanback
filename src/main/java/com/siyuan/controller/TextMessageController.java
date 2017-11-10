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
@RequestMapping("/test")
public class TextMessageController {

    @Autowired
    private TextMessageService textMessageService;
    @CrossOrigin
    @GetMapping("/list/{subjectid}")
    List<TextMessage> findAll(@PathVariable("subjectid") String subjectId){
//        response.setHeader("Access-Control-Allow-Origin", "*");
        return textMessageService.findAllBySubjectKind(subjectId);


    }

    @GetMapping("/listById/{examid}")
    List<TextMessage> finaAllByExamId(@PathVariable("examid") Integer examid){

        return textMessageService.findAllByExamId(examid);

    }

    /**
     * 选择题
     * @param subjectId
     * @param textMessage
     * @return
     */

    @PostMapping("/saveChoice/{subjectid}")
    TextMessage save(@PathVariable("subjectid") String subjectId,
                     TextMessage textMessage){
        textMessage.setSubjectkind(subjectId);
        textMessage.setExamid(textMessage.getExamid());
        textMessage.setType(1);
        textMessage.setIsshow(textMessage.getIsshow());
        textMessage.setHardlevel(textMessage.getHardlevel());
        textMessage.setTitlebody(textMessage.getTitlebody());
        textMessage.setA(textMessage.getA());
        textMessage.setB(textMessage.getB());
        textMessage.setC(textMessage.getC());
        textMessage.setD(textMessage.getD());
        textMessage.setAnswer(textMessage.getAnswer());
        textMessage.setAnalysis(textMessage.getAnalysis());

        return textMessageService.save(textMessage);

    }

}
