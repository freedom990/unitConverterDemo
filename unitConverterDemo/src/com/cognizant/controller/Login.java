package com.cognizant.controller;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cognizant.models.ActionDao;
import com.cognizant.models.User;

@Controller
@RequestMapping(value = "/login.do")
public class Login {
	@RequestMapping(method = RequestMethod.POST)
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String username = req.getParameter("username");
	//	String contactNumber = req.getParameter("contactNumber");
		String password = req.getParameter("password");
		Boolean isLoginSuccessful = false;
		List<User> userList = (List) ActionDao.retriverUsers("users");
		User userIt;
		User userFinal = null;

		Iterator<User> userIterator = userList.iterator();
		while (userIterator.hasNext()) {
			userIt = userIterator.next();

			// System.out.println("User Input Username ... "+username+" Password "+password+
			// " .. Contact # ... "+contactNumber) ;
			// System.out.println("DB entries for the USER ... "+userIt.geteMail()+"
			// Password "+userIt.getPassword()+ " .. Contact # ... "+userIt.getmNum()) ;

			if (userIt.getName().equals(username) && userIt.getPassword().equals(password)) {
				userFinal = userIt;
				isLoginSuccessful = true;

			}
		}

		if (isLoginSuccessful) {
			req.getSession().setAttribute("isUserLoggedIn", isLoginSuccessful);

			req.getSession().setAttribute("FullName", userFinal.getName());
			System.out.println("userIt.getName() " + userFinal.getName());
			/*if(userFinal.getUserType().equals("admin")) {
				req.getRequestDispatcher("/Admin.jsp").forward(req, resp);
			}
			else*/
			req.getRequestDispatcher("/SuccessPage.jsp").forward(req, resp);

		} else {
			req.getRequestDispatcher("/failedToLogin.jsp").forward(req, resp);
		}
	}
}
