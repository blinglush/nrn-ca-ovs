package com.nrnca.dao;

import com.nrnca.model.Contact;
import org.springframework.stereotype.Repository;

/**
 * Created by shrestar on 2015-07-21.
 */
@Repository("contactDao")
public class ContactDaoImpl extends AbstractDao implements ContactDao {

    @Override
    public void addContact(Contact contact) {
        persist(contact);

    }
}
