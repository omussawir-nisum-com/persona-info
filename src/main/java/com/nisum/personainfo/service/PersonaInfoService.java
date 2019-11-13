package com.nisum.personainfo.service;

import com.nisum.personainfo.model.PersonaInfo;

import java.util.Optional;

public interface PersonaInfoService {

    Optional<PersonaInfo> getPersonaInfoById(Integer id);
}
