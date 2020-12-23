package com.aim.user.service.impl;

import com.aim.entity.Contact;
import com.aim.user.mapper.ContactMapper;
import com.aim.user.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactServiceImpl implements ContactService {
    @Autowired
    private ContactMapper contactMapper;

    @Override
    public List<Contact> seleceAllContactByUserId(Integer userId) {
        return contactMapper.selectAllContactByUserId(userId);
    }
}
