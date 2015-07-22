package com.nrnca.model;

import com.sun.org.apache.xml.internal.utils.SerializableLocatorImpl;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by shrestar on 2015-07-17.
 */
@Entity
@Table(name = "CANDIDATE")
public class Candidate implements Serializable {

    @Id
    @Column(name = "CANDIDATE_ID")
    @TableGenerator(name = "candidate_gen",table = "SEQ_ID_POOL",pkColumnName = "POOL_ID", pkColumnValue = "2",valueColumnName = "SEQ_ID", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "candidate_gen")
    private int id;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CONTACT_ID",nullable = false)
    private Contact contact;

    @Column(name = "ZONE", length = 45)
    private String zone;

    public Candidate() {

    }


    public Candidate(Contact contact, String zone) {
        this.contact = contact;
        this.zone = zone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }
}