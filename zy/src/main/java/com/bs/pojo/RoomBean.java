package com.bs.pojo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RoomBean {

	private String id;
	
	
	//科室名字
	private String name;
	
	/**
	 * 需要的内容和单位
	 */
	private List<Map<String, String>> neeadBean=new ArrayList<Map<String, String>>();


	
	
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

	public List<Map<String, String>> getNeeadBean() {
		return neeadBean;
	}

	public void setNeeadBean(List<Map<String, String>> neeadBean) {
		this.neeadBean = neeadBean;
	}}
