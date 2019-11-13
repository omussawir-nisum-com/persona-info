package com.nisum.personainfo.service;

import com.nisum.personainfo.model.PersonaInfo;

import java.util.List;
import java.util.Optional;

public interface PersonaInfoService {

    PersonaInfo getPersonaInfoById(Integer id);

    List<PersonaInfo> getAllPersonaInfos();

    void savePersonaInfo(PersonaInfo personaInfo);

    Optional<PersonaInfo> updatePersonaInfo(PersonaInfo personaInfo);

    void deletePersonaInfoById(Integer id);

    void deleteAllPersonaInfo();
}
