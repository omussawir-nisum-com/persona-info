package com.nisum.personainfo.repository;

import com.nisum.personainfo.model.PersonaInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaInfoRepository extends JpaRepository<PersonaInfo, Integer> {


}
