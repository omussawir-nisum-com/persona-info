package com.nisum.personainfo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.io.Serializable;

@Entity
public class PersonaInfo implements Serializable {

    @Id
    private Integer id;

    @NotEmpty(message = "Name is required")
    @Pattern(regexp="^[A-Za-z]*$" , message = "Name is invalid")
    private String name;

    @Pattern(regexp="^[A-Za-z]*$" , message = " Last name is invalid")
    private String lastName;

    @NotEmpty(message = "address is required")
    @Pattern(regexp="^[A-Za-z0-9 ]*$" , message = " address is invalid")
    private String address;

    @NotNull(message = "Phone number is required")
    private Integer simplePhoneNumber;

    @NotEmpty(message = "Hair colour is required")
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
