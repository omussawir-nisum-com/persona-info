package com.nisum.personainfo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class PersonaInfo implements Serializable {

    @Id
    private Integer id;

    private String name;

    private String lastName;

    private String address;

    private Integer simplePhoneNumber;

    private String hairColour;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getSimplePhoneNumber() {
        return simplePhoneNumber;
    }

    public void setSimplePhoneNumber(Integer simplePhoneNumber) {
        this.simplePhoneNumber = simplePhoneNumber;
    }

    public String getHairColour() {
        return hairColour;
    }

    public void setHairColour(String hairColour) {
        this.hairColour = hairColour;
    }
}
