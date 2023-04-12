package org.example.application;

import org.example.domaine.Contact;
import org.example.repository.IContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactServiceImpl implements IContactService {

    @Autowired
    IContactRepository repo;
    @Override
    public List<Contact> findByLastName(String name) {
        return repo.findByLastName(name);
    }

    @Override
    public List<Contact> findByFirstName(String firstname) {

        return repo.findByFirstName(firstname);
    }

    @Override
    public List<Contact> findByPhoneNumber(String phoneNumber) {

        return repo.findByPhoneNumber(phoneNumber);
    }
}
