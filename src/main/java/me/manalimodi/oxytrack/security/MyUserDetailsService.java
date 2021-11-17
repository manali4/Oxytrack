package me.manalimodi.oxytrack.security;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import me.manalimodi.oxytrack.entity.Volunteer;
import me.manalimodi.oxytrack.service.VolunteerService;

@Service
public class MyUserDetailsService implements UserDetailsService {

	@Autowired
	private VolunteerService volunteerService;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Volunteer volunteer = volunteerService.readVolunteer(username);
		User user = new User(username, volunteer.getPassword(), new ArrayList<>());
		return user;
	}

}
