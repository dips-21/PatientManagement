package dips.patientmanagement.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Patient {
    String name;
    @Id
    int patientId;
    String gender;
    int prescriptionId;
    String location;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getPrescriptionId() {
        return prescriptionId;
    }

    public void setPrescriptionId(int prescriptionId) {
        this.prescriptionId = prescriptionId;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "name='" + name + '\'' +
                ", patientId=" + patientId +
                ", gender='" + gender + '\'' +
                ", prescriptionId=" + prescriptionId +
                ", location='" + location + '\'' +
                '}';
    }
    }

