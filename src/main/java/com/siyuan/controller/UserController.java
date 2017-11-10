package com.siyuan.controller;


import com.siyuan.dataobject.DifAdminUsers;
import com.siyuan.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @CrossOrigin
    @GetMapping("/getUserInfo/{id}")
    DifAdminUsers findby(@PathVariable("id") Integer id){

        return userService.findbyid(id);
    }
}
