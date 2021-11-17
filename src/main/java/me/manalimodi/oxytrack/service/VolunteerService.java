package me.manalimodi.oxytrack.service;

import me.manalimodi.oxytrack.entity.Volunteer;

public interface VolunteerService {

	public Volunteer createVolunteer(Volunteer volunteer);

	public Volunteer readVolunteer(String username);

	public Volunteer updateVolunteer(Long id, Volunteer volunteer);

	public Boolean deleteVolunteer(Long id);

	public Volunteer getVolunteerById(Long id);

}
