package com.springboot.obs.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.obs.entity.OnlineBankinSystem;
import com.springboot.obs.service.OnlineBankingSystemService;

@RestController
@RequestMapping("/obs")
public class OnlineBankingSystemController {
	
	private OnlineBankingSystemService bankingSystemService;
	
	@PostMapping("/saveuser")
	public ResponseEntity<OnlineBankinSystem> saveUser(@RequestBody OnlineBankinSystem bankinSystem)
	{
		return new ResponseEntity<OnlineBankinSystem>(bankingSystemService.saveUser(bankinSystem));
	}
}
