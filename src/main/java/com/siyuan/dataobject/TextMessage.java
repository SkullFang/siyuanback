package com.siyuan.dataobject;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class TextMessage {

    @Id
    @GeneratedValue
    private Integer titleid;
    private Integer examid;

//    @Column(name = "subjectKind",nullable = false)
//    private String subjectKind;
    private String subjectkind;

    private String titlebody;
    private String answer;
    private Integer hardlevel;
    private String A;
    private String B;
    private String C;
    private String D;
    private String image;
    private String analysis;
    private Integer isshow;
    private Integer type;

}
