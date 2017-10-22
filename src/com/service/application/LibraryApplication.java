package com.service.application;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import com.service.resources.HomeResource;
import com.service.resources.UserInformationResource;
import com.service.resources.UserRegistrationResource;

@ApplicationPath("/libraryManagement")
public class LibraryApplication extends Application{

	@Override
	public Set<Class<?>> getClasses() {
		final Set<Class<?>> classes = new HashSet<Class<?>>();
		classes.add(HomeResource.class);
		classes.add(UserRegistrationResource.class);
		classes.add(UserInformationResource.class);
		return classes;
	}
}
