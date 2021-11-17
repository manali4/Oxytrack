package me.manalimodi.oxytrack.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import me.manalimodi.oxytrack.entity.Cylinder;

@Repository
public interface CylinderRepository extends JpaRepository<Cylinder, Long> {

	Cylinder findByIdentifier(String identifier);

}
