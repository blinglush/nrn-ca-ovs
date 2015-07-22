package com.nrnca.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by shrestar on 2015-06-22.
 */
@Entity
@Table(name="CONTACT")
public class Contact implements Serializable{

    @Id
    @Column(name = "CONTACT_ID")
    @TableGenerator(name = "contact_gen", table = "SEQ_ID_POOL", pkColumnName = "POOL_ID", pkColumnValue = "1", valueColumnName = "SEQ_ID", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "contact_gen")
    private int id;
    @Column(name = "FIRST_NAME",length = 45)
    private String firstName;
    @Column(name = "MIDDLE_NAME",length = 45)
    private String middleName;
    @Column(name="LAST_NAME",length = 45)
    private String lastName;
    @Column(name = "EMAIL", length = 45)
    private String email;
    @Column(name="PHONE",precision = 11)
    private Long phone;
    @Column(name = "POSTAL_CODE", length = 45)
    private String postalCode;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "contact")
    private Set<Candidate> candidates = new HashSet<Candidate>(0);

    public Contact() {

    }

    public Contact(String firstName, String middleName, String lastName, String email, Long phone, String postalCode, Set<Candidate> candidates) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.postalCode = postalCode;
        this.candidates = candidates;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getPhone() {
        return phone;
    }

    public void setPhone(Long phone) {
        this.phone = phone;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public Set<Candidate> getCandidates() {
        return candidates;
    }

    public void setCandidates(Set<Candidate> candidates) {
        this.candidates = candidates;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Contact)) return false;

        Contact contact = (Contact) o;

        if (id != contact.id) return false;
        if (!email.equals(contact.email)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + email.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "CONTACT{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", phone=" + phone +
                ", postalCode='" + postalCode + '\'' +
                '}';
    }
}
