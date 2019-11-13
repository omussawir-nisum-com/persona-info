package com.nisum.personainfo.controller;

import com.nisum.personainfo.model.PersonaInfo;
import com.nisum.personainfo.service.PersonaInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/persona")
public class PersonaInfoController {

    @Autowired
    PersonaInfoService personaInfoService;

    @GetMapping("/{id}")
    public ResponseEntity<Optional<PersonaInfo>> getEventsByActorId(@PathVariable("id") Integer personaInfoId) {

        Optional<PersonaInfo> personaInfo = personaInfoService.getPersonaInfoById(personaInfoId);


        return ResponseEntity.ok().body(personaInfo);
    }


}
