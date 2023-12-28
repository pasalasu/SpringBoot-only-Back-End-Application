package com.swiggy.user.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.swiggy.user.entity.SwiggyUsers;
import com.swiggy.user.repository.UserRepository;
import com.swiggy.user.request.UserRegisterRequest;
import com.swiggy.user.response.UserRegisterResponse;

@Service
public class UserService {

	@Autowired
	UserRepository repository;

	public String registerUserDetails(UserRegisterRequest registerRequest) {
		// Mapping data to Entity Object
		SwiggyUsers user = new SwiggyUsers();
		user.setVarname(registerRequest.getVarname());
		user.setIpport(registerRequest.getIpport());
		user.setSlaveid(registerRequest.getSlaveid());
		user.setFuncode(registerRequest.getFuncode());
		user.setDataT(registerRequest.getDataT());
		user.setStartaddress(registerRequest.getStartaddress());
		user.setCount(registerRequest.getCount());
		user.setMulti(registerRequest.getMulti());
		user.setOffset(registerRequest.getOffset());
		user.setEdit(registerRequest.getEdit());
		user.setDelete(registerRequest.getDelete());
		
		repository.save(user);
		return "User Registered Successfully";
	}

	public UserRegisterResponse getUserDetails(String email) {
		SwiggyUsers user = repository.findById(email).get();
		UserRegisterResponse response = new UserRegisterResponse();
		response.setVarname(user.getVarname());
		response.setIpport(user.getIpport());
		response.setSlaveid(user.getSlaveid());
		response.setFuncode(user.getFuncode());
		response.setDataT(user.getDataT());
		response.setStartaddress(user.getStartaddress());
		response.setCount(user.getCount());
		response.setMulti(user.getMulti());
		response.setOffset(user.getOffset());
		response.setEdit(user.getEdit());
		response.setDelete(user.getDelete());
		
		return response;
	}

	public List<SwiggyUsers>  getAllUserDetails() {
		return  repository.findAll();
	}
}