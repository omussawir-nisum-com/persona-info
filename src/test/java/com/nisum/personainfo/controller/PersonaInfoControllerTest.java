package com.nisum.personainfo.controller;

import com.nisum.personainfo.BaseTest;
import com.nisum.personainfo.model.PersonaInfo;
import com.nisum.personainfo.service.PersonaInfoService;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.http.ResponseEntity;

public class PersonaInfoControllerTest extends BaseTest {

    @InjectMocks
    PersonaInfoController personaInfoController;

    @Mock
    PersonaInfoService personaInfoService;

    /**
     * return PersonaInfo Object againt given id
     */
    @Test
    public void getPersonaInfoByIdTest() {

        PersonaInfo personaInfo = this.getPersonaInfo();
        Mockito.when(personaInfoService.getPersonaInfoById(Mockito.anyInt())).thenReturn(personaInfo);

        ResponseEntity<PersonaInfo> responseEntity = personaInfoController.getPersonaInfoById(Mockito.anyInt());
        Assert.assertEquals(personaInfo.getId() , responseEntity.getBody().getId());

    }

    private PersonaInfo getPersonaInfo() {

        PersonaInfo personaInfo = new PersonaInfo();
        personaInfo.setAddress("abc");
        personaInfo.setHairColour("black");
        personaInfo.setId(11);
        personaInfo.setName("osama");
        personaInfo.setLastName("mussawir");

        return personaInfo;
    }
}
