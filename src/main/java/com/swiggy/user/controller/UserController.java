package com.swiggy.user.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.swiggy.user.entity.SwiggyUsers;
import com.swiggy.user.request.UserRegisterRequest;
import com.swiggy.user.response.UserRegisterResponse;
import com.swiggy.user.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	UserService userService;

	@PostMapping("/register")
	public String registerUserDetails(@RequestBody UserRegisterRequest request) {
		// Controller -> Service and From Service receiving Result
		String response = userService.registerUserDetails(request);
		return response;
	}

	// Fetch user Details of one Person by email ID
	@GetMapping("/fetch")
	public UserRegisterResponse getUserDetails() {
		String  varname= "pas";
		UserRegisterResponse response = userService.getUserDetails(varname);
		return response;
	}

	// Loading all User Details
	@GetMapping("/fetch/all")
	public List<SwiggyUsers> getAllUserDetails() {
		return userService.getAllUserDetails();
	}

	// Path VAribales
	@RequestMapping(value = "/get/{emailId}", method = RequestMethod.GET)
	public UserRegisterResponse getUserByEmailId(@PathVariable("emailId") String email) {
		return userService.getUserDetails(email);
	}

	// list of users : city is Hyd

	 //localhost:8080/swiggy/user/get?city=Hyderabad
	@GetMapping("/get")
	public String getUsersByCity(@RequestParam("city") String city) {
		
		
			//Can you pass to Service layer
		//TODO: pass to Service and from service 

		return "User are from City :"+city+" : are : 1000";
	}
	
	@GetMapping("/get/city/gender")
	public String getUsersByCityAndGender(
				@RequestParam(name="city") String city, 
			    @RequestParam(name = "gender", required = false) String gender) {
		
		String response = null;
		
		if(city != null) {
			response = "From City : 10000 "+city;
		}else if(gender != null){
			response = "From Gender : 3343434 "+gender;
		}else{
			response = "Over all India is : 288383838";
		}
		
			//Can you pass to Service layer
		//TODO: pass to Service and from service 

		return response;
	}


}