package com.siyuan.VO;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.siyuan.dataobject.DifKnowledege;
import lombok.Data;

import java.util.List;

@Data
public class KnowledgeOneVO {

    @JsonProperty("ctype")
    private Integer cType;


    @JsonProperty("cname")
    private String cName;


    @JsonProperty("child")
    private List<DifKnowledege> list;
}
