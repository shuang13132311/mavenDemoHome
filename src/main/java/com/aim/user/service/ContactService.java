package com.aim.user.service;

import com.aim.entity.Contact;

import java.util.List;

public interface ContactService {
    public List<Contact> seleceAllContactByUserId(Integer userId);
}
