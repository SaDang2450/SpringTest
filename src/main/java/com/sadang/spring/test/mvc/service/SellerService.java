package com.sadang.spring.test.mvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sadang.spring.test.mvc.domain.Seller;
import com.sadang.spring.test.mvc.repository.SellerRepository;

@Service
public class SellerService {

	@Autowired
	private SellerRepository sellerRepository;

	public int addSeller(Seller seller) {

		int addResult = sellerRepository.insertSeller(seller);

		return addResult;
	}
}
