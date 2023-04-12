package org.example.exposition;

import org.example.application.IContactService;
import org.example.domaine.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/contacts")
public class ContactController {

    @Autowired
    IContactService service;

    @GetMapping("/findbylastname/{name}")
    List<Contact> findByLastName(@PathVariable("name") String name){
        return service.findByLastName(name);
    }

    @GetMapping("/findbyfirstname/{name}")
    List<Contact> findByFirstName(@PathVariable("name") String firstname){
       return service.findByFirstName(firstname);
    }

    @GetMapping("/findbyphonenumber/{phone}")
    List<Contact> findByPhoneNumber(@PathVariable("phone") String phoneNumber){
        return service.findByPhoneNumber(phoneNumber);
    }
}
