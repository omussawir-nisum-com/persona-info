package com.nisum.personainfo.service;

import com.nisum.personainfo.BaseTest;
import com.nisum.personainfo.exception.PersonaInfoNotFoundException;
import com.nisum.personainfo.model.PersonaInfo;
import com.nisum.personainfo.repository.PersonaInfoRepository;
import com.nisum.personainfo.service.impl.PersonaInfoServiceImpl;
import com.nisum.personainfo.util.PersonaInfoUtil;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.util.Optional;

public class PersonaInfoServiceImplTest extends BaseTest {

    @Mock
    PersonaInfoRepository personaInfoRepository;

    @Mock
    PersonaInfoUtil personaInfoUtil;

    @InjectMocks
    PersonaInfoServiceImpl personaInfoService;

    /**
     * return PersonaInfo object against given id
     */
    @Test
    public void getPersonaInfoByIdTest()  {

        Optional<PersonaInfo> personaInfoOptional = this.getPersonaInfo();
        Mockito.when(personaInfoRepository.findById(Mockito.anyInt())).thenReturn(personaInfoOptional);
        PersonaInfo personaInfo = personaInfoService.getPersonaInfoById(Mockito.anyInt());

        Assert.assertEquals(personaInfo.getId() , personaInfoOptional.get().getId());

    }

    /**
     * throws exception when user not found againt given id
     */
    @Test(expected = PersonaInfoNotFoundException.class)
    public void getPersonaInfoByIdNotFoundTest()  {

        Optional<PersonaInfo> personaInfoOptional = Optional.ofNullable(null);
        Mockito.when(personaInfoRepository.findById(Mockito.anyInt())).thenReturn(personaInfoOptional);
        PersonaInfo personaInfo = personaInfoService.getPersonaInfoById(Mockito.anyInt());

    }
    private Optional<PersonaInfo> getPersonaInfo() {

        PersonaInfo personaInfo = new PersonaInfo();
        personaInfo.setAddress("abc");
        personaInfo.setHairColour("black");
        personaInfo.setId(11);
        personaInfo.setName("osama");
        personaInfo.setLastName("mussawir");

        return Optional.ofNullable(personaInfo);
    }
}

