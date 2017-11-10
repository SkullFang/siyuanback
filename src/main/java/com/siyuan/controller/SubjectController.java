package com.siyuan.controller;

import com.siyuan.dataobject.DifSubjects;
import com.siyuan.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;
@CrossOrigin
@RestController
@RequestMapping("/subject")
public class SubjectController {
    @Autowired
    private SubjectService subjectService;
    @CrossOrigin
    @GetMapping("/getAll")
    public List<DifSubjects> getAll(){

        return subjectService.findAll();
    }

    /*
    更新
     */
    @PutMapping("/update/{id}")

    public DifSubjects update(@PathVariable("id") Integer id,
                              @PathParam("newName") String newName){
        return subjectService.update(id,newName);
    }
    /*
    添加科目
     */

    @PutMapping("/save")
    public void save(@PathParam("subjectName") String subjectName){
        DifSubjects difSubjects=new DifSubjects();
        difSubjects.setSubjectName(subjectName);
        difSubjects.setSubjectStatus(1);
        subjectService.save(difSubjects);
    }

    /*
    查看一条信息
     */
    /*
    删除一个科目
     */
    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable("id") Integer id){
        subjectService.delete(id);
    }




}
