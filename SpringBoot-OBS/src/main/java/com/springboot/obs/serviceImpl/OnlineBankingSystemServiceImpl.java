package com.springboot.obs.serviceImpl;

import org.springframework.http.HttpStatusCode;

import com.springboot.obs.entity.OnlineBankinSystem;
import com.springboot.obs.repository.OnlineBankingSystemRepo;
import com.springboot.obs.service.OnlineBankingSystemService;

public class OnlineBankingSystemServiceImpl implements OnlineBankingSystemService {
	
	private OnlineBankingSystemRepo bankingSystemRepo;
	
	@Override
	public void saveUser(String acNum, String usName, String pas) {
		// TODO Auto-generated method stub
		OnlineBankinSystem bankinSystem = new OnlineBankinSystem();
		bankinSystem.setAccountNumber(acNum);
		bankinSystem.setUserName(usName);
		bankinSystem.setPassword(pas);
		bankingSystemRepo.save(bankinSystem);
	}

	@Override
	public HttpStatusCode saveUser(OnlineBankinSystem bankinSystem) {
		// TODO Auto-generated method stub
		return null;
	}

}
