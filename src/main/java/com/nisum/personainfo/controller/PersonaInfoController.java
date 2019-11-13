package com.nisum.personainfo.controller;

import com.nisum.personainfo.model.PersonaInfo;
import com.nisum.personainfo.service.PersonaInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

import static org.springframework.http.HttpStatus.CREATED;
import static org.springframework.http.HttpStatus.OK;

@RestController
@RequestMapping("/persona")
public class PersonaInfoController {

    @Autowired
    PersonaInfoService personaInfoService;

    /**
     * returns PersonaInfo Object againt given ID
     *
     * @param personaInfoId
     * @return
     */
    @GetMapping("/{id}")
    public ResponseEntity<PersonaInfo> getPersonaInfoById(@PathVariable("id") Integer personaInfoId) {

        PersonaInfo personaInfo = personaInfoService.getPersonaInfoById(personaInfoId);
        return ResponseEntity.ok().body(personaInfo);
    }

    /**
     * return list of all the PersonaInfo Objects
     *
     * @return
     */
    @GetMapping()
    public ResponseEntity<List<PersonaInfo>> getAllPersonaInfos() {

        List<PersonaInfo> personaInfo = personaInfoService.getAllPersonaInfos();
        return ResponseEntity.ok().body(personaInfo);
    }

    /**
     * persist the given PersonaInfo object into database after validating the given json
     *
     * @param personaInfo
     * @return
     */
    @PostMapping()
    public ResponseEntity<Void> savePersonaInfo(@Valid @RequestBody PersonaInfo personaInfo) {

        personaInfoService.savePersonaInfo(personaInfo);
        return ResponseEntity.status(CREATED).build();
    }

    /**
     * update the given PersonaInfo object into database after validating the given json
     *
     * @param personaInfo
     * @return
     */
    @PutMapping()
    public ResponseEntity<Void> updatePersonaInfo(@Valid @RequestBody PersonaInfo personaInfo) {

        personaInfoService.updatePersonaInfo(personaInfo);
        return ResponseEntity.status(OK).build();
    }

    /**
     * delete the PersonaInfo object againt given id
     *
     * @param personaInfoId
     * @return
     */
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePersonaInfoById(@PathVariable("id") Integer personaInfoId) {

        personaInfoService.deletePersonaInfoById(personaInfoId);
        return ResponseEntity.status(OK).build();
    }

    /**
     * delete all the PersonaInfo objects from database
     *
     * @return
     */
    @DeleteMapping()
    public ResponseEntity<Void> deleteAllPersonaInfo() {

        personaInfoService.deleteAllPersonaInfo();
        return ResponseEntity.status(OK).build();
    }
}
