package com.cme.contacts.service;

import java.util.List;
import com.cme.contacts.pojo.Contact;

public interface ContactService {
    Contact getContactById(String id);
    void saveContact(Contact contact);
    List<Contact> getContacts();
}