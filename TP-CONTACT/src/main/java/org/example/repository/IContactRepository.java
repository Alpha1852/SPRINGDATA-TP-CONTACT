package org.example.repository;

import org.example.domaine.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IContactRepository extends JpaRepository<Contact,Long> {

     List<Contact> findByLastName(String name);

     List<Contact> findByFirstName(String firstname);

     List<Contact> findByPhoneNumber(String phoneNumber);

}
