package com.service.resources;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.service.bo.UserRegistrationInfoBO;
import com.service.impl.LibraryServiceException;
import com.service.impl.LibraryServiceImpl;
import com.service.impl.LibraryServiceImplService;
import com.service.po.UserRegistrationPO;

@Path("/registerUser")
public class UserRegistrationResource {

	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response registerUser(UserRegistrationPO registrationInfo) throws LibraryServiceException{
		
		LibraryServiceImplService service = new LibraryServiceImplService();
		LibraryServiceImpl serviceImpl = service.getLibraryServiceImpl();
		
		
		UserRegistrationInfoBO user = new UserRegistrationInfoBO();
		user.setId(registrationInfo.getId());
		user.setFirstname(registrationInfo.getFirstname());
		user.setLastname(registrationInfo.getLastname());
		user.setDepartment(registrationInfo.getDepartment());
		user.setRole(registrationInfo.getRole());
		user.setUsername(registrationInfo.getUsername());
		user.setPassword(registrationInfo.getPassword());
		
		String registrationStatus = serviceImpl.registerUser(user);
		
		return Response.ok(registrationStatus).build();
	}
}
