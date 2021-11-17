package me.manalimodi.oxytrack.service;

import me.manalimodi.oxytrack.entity.Patient;

public interface PatientService {

	public Patient createPatient(Patient patient);

	public Patient readPatient(String nickname);

	public Patient updatePatient(Patient patient);

	public Boolean deletePatient(String nickname);

}
