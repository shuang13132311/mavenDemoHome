package com.aim.user.mapper;

import com.aim.entity.User;

public interface UserMapper {
    public User selectUserById(int id);



    public int addUser(User user);

    public User login(User user);



}
