package com.bs.pojo;

import java.util.ArrayList;
import java.util.List;

public class FloorBean {

	private String id;
	
	/**
	 * 部门
	 */
	private String name;
	
	
	private List<RoomBean> list=new ArrayList<RoomBean>();


	
	
	
	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public List<RoomBean> getList() {
		return list;
	}


	public void setList(List<RoomBean> list) {
		this.list = list;
	}
	
	
	
	
}
