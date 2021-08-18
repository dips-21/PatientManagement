package dips.patientmanagement.repository;

import dips.patientmanagement.model.Patient;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.lang.annotation.Annotation;

@Repository
public interface PatientRepository extends CrudRepository<Patient, Integer> {
    Patient findByName(String name);


// @Query("SELECT PatientName  FROM Patient WHERE name=" ")
 //Foo retrieveByName(@Param("name") String name);


}
