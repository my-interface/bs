package com.bs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bs.mapper.BusDataMapper;
import com.bs.pojo.BusData;
import com.bs.pojo.FloorBean;

@Service
public class BusDataService {

	@Autowired
	private BusDataMapper busDataMapper;
	
	/**
	 * 批量插入普通数据
	 * @param list
	 * @return
	 */
	public int insertLarge(List<BusData> list){
		return busDataMapper.insertLarge(list);
	}
	
	/***
	 * 查询所有数据
	 * @return
	 */
	public List<FloorBean> findList(){
		return busDataMapper.findList();
	}

	/**
	 * 修改为已配送
	 * @param list
	 * @return
	 */
	public int updateCommonData(List<BusData> list) {
		// TODO Auto-generated method stub
		return busDataMapper.updateCommonData(list);
	}
	
	/***
	 * 删除普通数据
	 * @param list
	 * @return
	 */
	public int deleteCommonData(List<BusData> list) {
		// TODO Auto-generated method stub
		return busDataMapper.deleteCommonData(list);
	}
	
}
