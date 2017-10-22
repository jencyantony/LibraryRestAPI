package com.service.resources;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.service.bo.UserInfoBO;
import com.service.dao.BookDAO;
import com.service.impl.LibraryServiceException;
import com.service.impl.LibraryServiceImpl;
import com.service.impl.LibraryServiceImplService;
import com.service.po.BookPO;
import com.service.po.UserInfoPO;

@Path("/userHome")
public class UserInformationResource {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getUserDetails(@QueryParam(value = "userId") int userId) throws LibraryServiceException{
		
		LibraryServiceImplService service = new LibraryServiceImplService();
		LibraryServiceImpl serviceImpl = service.getLibraryServiceImpl();
		
		UserInfoBO userInfo = serviceImpl.getUserDetails(userId);
		
		UserInfoPO userInfoPO = new UserInfoPO();
		userInfoPO.setId(userInfo.getId());
		userInfoPO.setFirstname(userInfo.getFirstname());
		userInfoPO.setLastname(userInfo.getLastname());
		userInfoPO.setRole(userInfo.getRole());
		userInfoPO.setDepartment(userInfo.getDepartment());
		if(userInfo.getBooksBorrowed()!=null && userInfo.getBooksBorrowed().getItem()!=null){
			List<BookDAO> books = userInfo.getBooksBorrowed().getItem();
			List<BookPO> booksBorrowed = new ArrayList<BookPO>();
			for(BookDAO book: books){
				BookPO bookPO = new BookPO();
				bookPO.setId(book.getId());
				bookPO.setAuthor(book.getAuthor());
				bookPO.setTitle(book.getTitle());
				booksBorrowed.add(bookPO);
			}
			userInfoPO.setBooksBorrowed(booksBorrowed);
		}
		return Response.ok(userInfoPO).build();
	}
}
