package com.service.resources;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.service.bo.LoginInfoBO;
import com.service.impl.LibraryServiceException;
import com.service.impl.LibraryServiceImpl;
import com.service.impl.LibraryServiceImplService;
import com.service.po.LoginInfoPO;

@Path("/home")
public class HomeResource {

	@Path("/login")
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response validateUser(LoginInfoPO loginInfo) throws LibraryServiceException{
		
		LibraryServiceImplService service = new LibraryServiceImplService();
		LibraryServiceImpl serviceImpl = service.getLibraryServiceImpl();
		LoginInfoBO loginInfoBO = new LoginInfoBO();
		loginInfoBO.setUsername(loginInfo.getUsername());
		loginInfoBO.setPassword(loginInfo.getPassword());
		
		boolean isValidUser = serviceImpl.isValidUser(loginInfoBO);
		
		return Response.ok(isValidUser).build();
	}
	
}
