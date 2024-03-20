package com.springboot.obs.service;

import org.springframework.http.HttpStatusCode;

import com.springboot.obs.entity.OnlineBankinSystem;

public interface OnlineBankingSystemService {

	
	public void saveUser(String acNum, String usName, String pas);

	public HttpStatusCode saveUser(OnlineBankinSystem bankinSystem);

}
