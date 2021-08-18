package dips.patientmanagement.service;

import dips.patientmanagement.model.Patient;
import dips.patientmanagement.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PatientServiceImpl implements PatientService {

    @Autowired
    PatientRepository patientRepository;

    @Override
    public Patient findByName(String name) {
        return patientRepository.findByName(name);
    }

    @Override
    public Patient findById(int patientId) {
      Optional<Patient> optionalPatient =patientRepository.findById(patientId);
      if(!optionalPatient.isPresent()){
          System.out.println("patient is not available");
      }
      return optionalPatient.get();
    }

    public void save(Patient patient) {
        patientRepository.save(patient);
    }
}
