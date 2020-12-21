package com.aim.user.mapper;

import com.aim.entity.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    public User selectUserById(int id);



    public int addUser(User user);

    public User login(@Param("userName") String userName, @Param("userPassword") String userPassword);



}
