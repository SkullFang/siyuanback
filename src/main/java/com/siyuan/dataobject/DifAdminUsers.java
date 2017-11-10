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
public class DifAdminUsers {

    @Id
    @GeneratedValue
    private Integer id;
    private String username;
    private String realname;
    private String AuthKey;
    private String PasswordHash;
    private String PasswordResetToken;
    private String email;
    private Integer status;
    private Date CreatedAt;
    private Date UpdatedAt;
    private String avatar;
    private String school;
    private String birthday;
}
