package org.example.application;

import org.example.domaine.Contact;

import java.util.List;

public interface IContactService {

    List<Contact> findByLastName(String name);

    List<Contact> findByFirstName(String firstname);

    List<Contact> findByPhoneNumber(String phoneNumber);
}
