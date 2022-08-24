package com.gestion_pointage.Pointage.repository;

import com.gestion_pointage.Pointage.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Person,Integer> {

}
