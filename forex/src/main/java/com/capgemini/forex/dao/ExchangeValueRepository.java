package com.capgemini.forex.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.forex.entity.ExchangeValue;

@Repository
public interface ExchangeValueRepository extends JpaRepository<ExchangeValue,Long>{
	
	ExchangeValue findByFromAndTo(String from ,String to);

}
