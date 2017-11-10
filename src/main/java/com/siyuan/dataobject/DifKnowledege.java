package com.siyuan.dataobject;


import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@DynamicUpdate
@Data
public class DifKnowledege {

    @Id
    @GeneratedValue
    private Integer Id;

    private String cname;

    private Integer cid;

    private Integer type;

    private Integer pid;

}
