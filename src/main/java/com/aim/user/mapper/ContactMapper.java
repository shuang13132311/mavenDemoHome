package com.aim.user.mapper;

import com.aim.entity.Contact;

import java.util.List;

public interface ContactMapper {
    public List<Contact> selectAllContactByUserId(Integer userId);

}
