package dips.patientmanagement.service;

import dips.patientmanagement.model.Patient;

public interface PatientService {
    Patient findByName(String name);
     Patient findById(int PatientId);

}
