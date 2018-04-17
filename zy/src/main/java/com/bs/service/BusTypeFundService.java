package com.bs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bs.mapper.BusTypeFundMapper;
import com.bs.pojo.BusTypeFund;

@Service
public class BusTypeFundService {

	@Autowired
	private BusTypeFundMapper busTypeFundMapper;
	
	/**
     * 同时插入多条数据
     * @param list
     * @return
     */
	
	public int insertLarge(List<BusTypeFund> list){
		return busTypeFundMapper.insertLarge(list);
	}
	
	/**
	 * 批量删除多条数据
	 * @param list
	 * @return
	 */
	public int deleteLarge(List<BusTypeFund> list){
		return busTypeFundMapper.deleteLarge(list);
	}
	
}
