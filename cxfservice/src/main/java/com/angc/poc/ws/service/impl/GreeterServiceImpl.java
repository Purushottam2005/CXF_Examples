package com.angc.poc.ws.service.impl;

import java.util.Date;

import javax.jws.WebService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.angc.poc.ws.pojo.User;
import com.angc.poc.ws.service.GreeterService;

@WebService(name="greeterService",
			portName="angcPort",
			targetNamespace="http://ws.service.angc.com/GreeterService")

public class GreeterServiceImpl implements GreeterService{

	private static final Logger logger =LoggerFactory.getLogger(GreeterServiceImpl.class);
	
	public String sayHello(String name) {
		// TODO Auto-generated method stub
		return "Hello Mr/Ms "+ name;
	}

	public User getUserDetails(int id) {
		User user = new User();
		if(id==1){
			user.setAddress("Chennai");
			user.setBirthDay(new Date(15121981));
			user.setId(id);
			user.setName("ANGC");
		}
		if(id==2){
			user.setAddress("Bangalore");
			user.setBirthDay(new Date(12121983));
			user.setId(id);
			user.setName("KNK");			
		}
		else{
			user.setAddress("Nellore");
			user.setBirthDay(new Date(13111981));
			user.setId(id);
			user.setName("MISC");

		}
		return user;
	}

}
