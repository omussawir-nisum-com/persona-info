package com.nisum.personainfo.service.impl;

import com.nisum.personainfo.exception.PersonaInfoCustomValidationException;
import com.nisum.personainfo.exception.PersonaInfoNotFoundException;
import com.nisum.personainfo.exception.PersonaInfoRecordAlredyExistException;
import com.nisum.personainfo.model.PersonaInfo;
import com.nisum.personainfo.repository.PersonaInfoRepository;
import com.nisum.personainfo.service.PersonaInfoService;
import com.nisum.personainfo.util.PersonaInfoUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonaInfoServiceImpl implements PersonaInfoService {

    @Autowired
    PersonaInfoRepository personaInfoRepository;

    @Autowired
    PersonaInfoUtil personaInfoUtil;

    @Override
    public PersonaInfo getPersonaInfoById(Integer id) {

            Optional<PersonaInfo> personaInfo = personaInfoRepository.findById(id);

            if (personaInfo.isPresent()) {
                return personaInfo.get();
            } else {
                throw new PersonaInfoNotFoundException("User not found");
            }
    }

    @Override
    public List<PersonaInfo> getAllPersonaInfos() {

        List<PersonaInfo> personaInfos = personaInfoRepository.findAll();
        return personaInfos;
    }

    @Override
    public void savePersonaInfo(PersonaInfo personaInfo) {

            if (personaInfoUtil.checkHairColour(personaInfo.getHairColour())) {

                Optional<PersonaInfo> personaInfoObj = personaInfoRepository.findById(personaInfo.getId());

                if(personaInfoObj.isPresent()) {
                    throw new PersonaInfoRecordAlredyExistException("Record already exist");
                }

                personaInfoRepository.save(personaInfo);
            } else {
                throw new PersonaInfoCustomValidationException("Hair Colour is invalid");
            }
        }


    @Override
    public Optional<PersonaInfo> updatePersonaInfo(PersonaInfo personaInfo) {

            Optional<PersonaInfo> personaInfoObj = personaInfoRepository.findById(personaInfo.getId());
            if (personaInfoObj.isPresent()) {

                return Optional.ofNullable(personaInfoRepository.save(personaInfo));

            } else {
                throw new PersonaInfoNotFoundException("no record to update");
            }

    }

    @Override
    public void deletePersonaInfoById(Integer id) {

        Optional<PersonaInfo> personaInfo = personaInfoRepository.findById(id);

        if(personaInfo.isPresent()) {
            personaInfoRepository.deleteById(id);
        } else {
            throw new PersonaInfoNotFoundException("User not found");
        }
    }

    @Override
    public void deleteAllPersonaInfo() {

        personaInfoRepository.deleteAll();

    }

}
