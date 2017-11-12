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

    public TextMessage() {
    }

    public TextMessage(String a, String b, String c, String d) {
        A = a;
        B = b;
        C = c;
        D = d;
    }

    public TextMessage(Integer examid, String subjectkind, String titlebody, String answer, Integer hardlevel, String a, String b, String c, String d, String image, String analysis, Integer isshow, Integer type) {
        this.examid = examid;
        this.subjectkind = subjectkind;
        this.titlebody = titlebody;
        this.answer = answer;
        this.hardlevel = hardlevel;
        A = a;
        B = b;
        C = c;
        D = d;
        this.image = image;
        this.analysis = analysis;
        this.isshow = isshow;
        this.type = type;
    }

    @Override
    public String toString() {
        return "TextMessage{" +
                "titleid=" + titleid +
                ", examid=" + examid +
                ", subjectkind='" + subjectkind + '\'' +
                ", titlebody='" + titlebody + '\'' +
                ", answer='" + answer + '\'' +
                ", hardlevel=" + hardlevel +
                ", A='" + A + '\'' +
                ", B='" + B + '\'' +
                ", C='" + C + '\'' +
                ", D='" + D + '\'' +
                ", image='" + image + '\'' +
                ", analysis='" + analysis + '\'' +
                ", isshow=" + isshow +
                ", type=" + type +
                '}';
    }

    public Integer getTitleid() {
        return titleid;
    }

    public void setTitleid(Integer titleid) {
        this.titleid = titleid;
    }

    public Integer getExamid() {
        return examid;
    }

    public void setExamid(Integer examid) {
        this.examid = examid;
    }

    public String getSubjectkind() {
        return subjectkind;
    }

    public void setSubjectkind(String subjectkind) {
        this.subjectkind = subjectkind;
    }

    public String getTitlebody() {
        return titlebody;
    }

    public void setTitlebody(String titlebody) {
        this.titlebody = titlebody;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public Integer getHardlevel() {
        return hardlevel;
    }

    public void setHardlevel(Integer hardlevel) {
        this.hardlevel = hardlevel;
    }

    public String getA() {
        return A;
    }

    public void setA(String a) {
        A = a;
    }

    public String getB() {
        return B;
    }

    public void setB(String b) {
        B = b;
    }

    public String getC() {
        return C;
    }

    public void setC(String c) {
        C = c;
    }

    public String getD() {
        return D;
    }

    public void setD(String d) {
        D = d;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getAnalysis() {
        return analysis;
    }

    public void setAnalysis(String analysis) {
        this.analysis = analysis;
    }

    public Integer getIsshow() {
        return isshow;
    }

    public void setIsshow(Integer isshow) {
        this.isshow = isshow;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }
}
