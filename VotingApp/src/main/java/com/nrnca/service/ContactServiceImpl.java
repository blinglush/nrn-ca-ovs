package com.nrnca.service;

import com.nrnca.dao.ContactDao;
import com.nrnca.model.Contact;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;


/**
 * Created by shrestar on 2015-07-21.
 */
@Service("contactService")
@Transactional
public class ContactServiceImpl implements ContactService {

    @Autowired
    private ContactDao contactDao;

    @Override
    public void saveContact(Contact contact) {
        contactDao.addContact(contact);

    }
}
