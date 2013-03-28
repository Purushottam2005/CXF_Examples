package com.angc.poc.ws.service;

import javax.jws.WebService;

import com.angc.poc.ws.pojo.User;

@WebService
public interface GreeterService {
	 String sayHello(String name);
	 User getUserDetails(int id);

}
