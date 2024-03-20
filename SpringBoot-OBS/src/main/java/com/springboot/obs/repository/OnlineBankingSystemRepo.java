package com.springboot.obs.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.obs.entity.OnlineBankinSystem;

public interface OnlineBankingSystemRepo extends JpaRepository<OnlineBankinSystem, String> {

}
