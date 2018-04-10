package com.bs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bs.mapper.BusDepartmentMapper;
import com.bs.pojo.BusDepartment;
import com.bs.pojo.FloorBean;

@Service
public class BusDepartmentService {

	@Autowired
	private BusDepartmentMapper busDepartmentMapper;
	
	/**
	 * 查询所有的部门
	 * @return
	 */
	public List<BusDepartment> selectAllList(){
		 return busDepartmentMapper.selectAllList();
	}
	public List<FloorBean> selectAllList2(){
		return busDepartmentMapper.selectAllList2();
	}
	
	
	
	
}
