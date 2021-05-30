package com.spingboot.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spingboot.model.Webinar;
import com.spingboot.repository.InstructorRepositories;

@Service
public class InstructorService {
	
	@Autowired
	private InstructorRepositories webinarRepository;
	
	public void addWebinar(Webinar webinar) {
		webinarRepository.save(webinar);
		
	}
	public List<Webinar> getAllWebinar()
	{
		List<Webinar> webinarlist=new ArrayList<Webinar>();
		
		webinarRepository.findAll().forEach(webinarlist::add);
		
		return webinarlist;
	}

}
