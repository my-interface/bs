package com.bs.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.alibaba.dubbo.common.utils.IOUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.bs.pojo.BusDepartment;
import com.bs.pojo.BusTypeFund;
import com.bs.pojo.FloorBean;
import com.bs.service.BusDepartmentService;
import com.bs.service.BusTypeFundService;

@Controller
@RequestMapping("/system")
public class SystemDataController {

	@Autowired
	private BusDepartmentService busDepartmentService;
	
	@Autowired
	private BusTypeFundService busTypeFundService;
	
	/***
	 * 获取系统的数据，比如单位和那些物品
	 */
	@RequestMapping("getData")
	public void getData(HttpServletRequest request, HttpServletResponse response) {
			try {
				HashMap<Object, Object> hashMap = new HashMap<>();
				hashMap.put("msg", "获取成功");
				hashMap.put("status", 200);
				List<FloorBean> selectAllList2 = busDepartmentService.selectAllList2();
				hashMap.put("data", selectAllList2);
				Object json = JSON.toJSON(hashMap);
				response.getWriter().write(json.toString());
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	
	/**
	 * 将数据转化为流
	 * @param request
	 * @param response
	 * @return
	 */
	public String getAllCp(HttpServletRequest request, HttpServletResponse response) {
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(request.getInputStream()));
			String body = IOUtils.read(reader);
			return body;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	
	
	/**
	 * 添加系统数据
	 * @param request
	 * @param response
	 * @throws IOException 
	 */
	@RequestMapping(value="addSystemData",method=RequestMethod.POST)
	public void addSystemData(HttpServletRequest request, HttpServletResponse response) throws IOException {
		try {
			String arrays =	getAllCp(request, response);
			ArrayList<String> strList = new ArrayList<>();
			//String arrays = request.getParameter("map");
			List<BusTypeFund> list = JSON.parseArray(arrays, BusTypeFund.class);
			for (BusTypeFund busTypeFund : list) {
				busTypeFund.setDelFlag("0");
				String uid = UUID.randomUUID().toString().replace("-", "");
				busTypeFund.setId(uid);
				strList.add(uid);
			}
			int count = busTypeFundService.insertLarge(list);
			HashMap<Object, Object> hashMap = new HashMap<>();
			hashMap.put("msg", "添加成功");
			hashMap.put("status", 200);
			hashMap.put("count", count);
			hashMap.put("ids", strList);
			response.getWriter().write(JSON.toJSONString(hashMap));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 删除系统数据
	 * @param request
	 * @param response
	 * @throws IOException 
	 */
	@RequestMapping(value="deleteSystemData",method=RequestMethod.POST)
	public void deleteSystemData(HttpServletRequest request, HttpServletResponse response) throws IOException {
		try {
			String arrays =	getAllCp(request, response);
			//String arrays = request.getParameter("map");
			List<BusTypeFund> list = JSON.parseArray(arrays, BusTypeFund.class);
			int count = busTypeFundService.deleteLarge(list);
			HashMap<Object, Object> hashMap = new HashMap<>();
			hashMap.put("msg", "删除成功");
			hashMap.put("status", 200);
			hashMap.put("count", count);
			response.getWriter().write(JSON.toJSONString(hashMap));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	 
}
