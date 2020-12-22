package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserService userService;
    @GetMapping("/users")
    public List<User> getAll(){
        return userService.findAll();
    }
    @GetMapping("/user/{id}")
    public List<User> getOne(){
        return userService.findAll();
    }
    @PutMapping("/user/")
    public void update(@RequestParam long userid,
                             @RequestParam String userName,
                             @RequestParam Integer age){
        User user = new User();
        user.setUserId(userid);
        user.setUserName(userName);
        user.setAge(age);
        userService.update(user);
    };
    @PostMapping("/user/{id}")
    public void save(@RequestParam long userid,
                       @RequestParam String userName,
                       @RequestParam Integer age){
        User user = new User();
        user.setUserId(userid);
        user.setUserName(userName);
        user.setAge(age);
        userService.update(user);
    };
    @DeleteMapping("/user/{id}")
    public void delete(@PathVariable long userid){
        userService.delete(userid);
    }

}
