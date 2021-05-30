package com.spingboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.spingboot.model.Webinar;
import com.spingboot.service.InstructorService;

@RestController
@RequestMapping("/api/instructor/v1/student")
public class StudentController {
	
	@Autowired
	InstructorService instructorService;
	
	@RequestMapping(method = RequestMethod.POST, value = "/student")
	public void addWebinar(@RequestBody Webinar webinar)
	{
		instructorService.addWebinar(webinar);
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/student")
	public List<Webinar> getAllWebinar()
	{
		return instructorService.getAllWebinar();
	}
	

}
