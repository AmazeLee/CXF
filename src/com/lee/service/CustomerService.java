package com.lee.service;

import java.util.List;

import javax.jws.WebService;

import com.lee.domain.Customer;
@WebService
public interface CustomerService {
	public List<Customer> findAll();
}