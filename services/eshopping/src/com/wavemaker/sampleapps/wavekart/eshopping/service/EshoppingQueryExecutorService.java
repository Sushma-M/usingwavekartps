/*Copyright (c) 2015-2016 wavemaker-com All Rights Reserved.
 This software is the confidential and proprietary information of wavemaker-com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with wavemaker-com*/


package com.wavemaker.sampleapps.wavekart.eshopping.service;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/

import java.util.Map;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.wavemaker.runtime.data.model.CustomQuery;
import com.wavemaker.runtime.data.exception.QueryParameterMismatchException;

public interface EshoppingQueryExecutorService {
	int executeOrdered(  java.lang.String data,  java.lang.String data2) throws QueryParameterMismatchException;
    Page<Object> execute_Total_Price(Pageable pageable, java.lang.String data) throws QueryParameterMismatchException;
	int executeCancelled(  java.lang.String data,  java.lang.Integer data1) throws QueryParameterMismatchException;
    Page<Object> execute_Total_InCart(Pageable pageable) throws QueryParameterMismatchException;
    Page<Object> execute_OrderedLists(Pageable pageable, java.lang.Integer LoggedinUserID) throws QueryParameterMismatchException;

	
	Page<Object> executeWMCustomQuerySelect(CustomQuery query, Pageable pageable) ;

	int executeWMCustomQueryUpdate(CustomQuery query) ;
}

