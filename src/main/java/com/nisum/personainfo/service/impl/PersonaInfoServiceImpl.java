package com.nisum.personainfo.service.impl;

import com.nisum.personainfo.model.PersonaInfo;
import com.nisum.personainfo.repository.PersonaInfoRepository;
import com.nisum.personainfo.service.PersonaInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PersonaInfoServiceImpl implements PersonaInfoService {

    @Autowired
    PersonaInfoRepository personaInfoRepository;

    @Override
    public Optional<PersonaInfo> getPersonaInfoById(Integer id) {
        return personaInfoRepository.findById(id);
    }
}
