package com.siyuan.dataobject;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
@DynamicUpdate
@Data
public class DifSubjects {

    @Id
    @GeneratedValue
    private Integer Id;

    private String subjectName;

    private Integer subjectStatus=1; //1默认为可用

    private Date createdAt;


}
