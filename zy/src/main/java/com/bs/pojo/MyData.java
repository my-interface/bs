package com.bs.pojo;

import java.util.ArrayList;
import java.util.List;

public class MyData {

	private String keshiName;//科室名字
	
	private String typeId;//检查手套/副  的  id   系统数据
	
	private List<BusData> data=new ArrayList<>();//存储data集合

	public String getKeshiName() {
		return keshiName;
	}

	public void setKeshiName(String keshiName) {
		this.keshiName = keshiName;
	}

	public String getTypeId() {
		return typeId;
	}

	public void setTypeId(String typeId) {
		this.typeId = typeId;
	}

	public List<BusData> getData() {
		return data;
	}

	public void setData(List<BusData> data) {
		this.data = data;
	}

	
	
	
	
	
}
