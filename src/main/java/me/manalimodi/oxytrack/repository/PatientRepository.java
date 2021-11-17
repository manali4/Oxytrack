package me.manalimodi.oxytrack.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import me.manalimodi.oxytrack.entity.Patient;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> {

	Patient findByNickname(String nickname);

}
