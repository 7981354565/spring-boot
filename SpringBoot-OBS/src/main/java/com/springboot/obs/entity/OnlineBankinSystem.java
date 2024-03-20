package com.springboot.obs.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Obs")

public class OnlineBankinSystem {
	@Id
	private String accountNumber;
	private String userName;
	private String password;
	private float debit;
	private float credit;
	private float balance;
}
