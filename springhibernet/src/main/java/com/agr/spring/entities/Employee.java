package com.agr.spring.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity // Used to create the class fields as database columns
@Table(name = "employee") // We use this when the table name is different from the database schema name
public class Employee {
    @Id // Represents the Unique primary values
    private Long id;
    @Column(name = "ename")// If the column name are different on database or class fields we use this @Annotations
    private String ename;
    private String address;
    private Long contact;
    private Long exp;

    public Employee() {

    }

    public Employee(Long id, String ename, String address, Long contact, Long exp) {
        this.id = id;
        this.ename = ename;
        this.address = address;
        this.contact = contact;
        this.exp = exp;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Long getContact() {
        return contact;
    }

    public void setContact(Long contact) {
        this.contact = contact;
    }

    public Long getExp() {
        return exp;
    }

    public void setExp(Long exp) {
        this.exp = exp;
    }
}
