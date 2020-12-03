package com.aim.user.service;

import com.aim.entity.User;

public interface UserService {
    public User selectUserById(int id);


    public int addUser(User user);

    public User login(User user);
}
