package com.example.demo.service;

import com.example.demo.dao.UserRepository;
import com.example.demo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public List<User> findAll(){
        return userRepository.findAll();
    }
    public User save(User user){
        return userRepository.save(user);
    }
    public User findOne(long id ){
        return userRepository.findById(id).get();
    }
    public void delete(long id){
        userRepository.deleteById(id);
    }
    public void update(User user){
        userRepository.saveAndFlush(user);
    }
}
