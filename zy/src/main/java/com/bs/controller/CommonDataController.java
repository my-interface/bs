package com.bs.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.alibaba.fastjson.JSON;
import com.bs.pojo.BusData;
import com.bs.pojo.BusUser;
import com.bs.service.BusDataService;

@Controller
@RequestMapping("/common")
public class CommonDataController {

	@Autowired
	private BusDataService busDataService;

	/***
	 * 批量增加普通数据
	 */
	@RequestMapping(value="addCommonData",method=RequestMethod.POST)
	public void addCommonData(HttpServletRequest request, HttpServletResponse response) {
			try {
				ArrayList<String> strList = new ArrayList<>();
				String arrays = request.getParameter("map");
				List<BusData> list = JSON.parseArray(arrays, BusData.class);
				for (BusData busData : list) {
					String uid = UUID.randomUUID().toString().replace("-", "");
					strList.add(uid);
					busData.setId(uid);
					BusUser user = (BusUser)request.getSession().getAttribute("currentUser");
					busData.setUserId(user.getId());
					busData.setDistributionFlag("0");
					busData.setDelFlag("0");
					busData.setCreateDate(new Date());
				}
				int count = busDataService.insertLarge(list);
				HashMap<Object, Object> hashMap = new HashMap<>();
				hashMap.put("msg", "添加成功");
				hashMap.put("status", 200);
				hashMap.put("ids", strList);
				response.getWriter().write(JSON.toJSONString(hashMap));
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	
	/**
	 * 查询 所有的普通数据量
	 */
	@RequestMapping(value="getCommonData",method=RequestMethod.POST)
	public void getCommonData(HttpServletRequest request, HttpServletResponse response) {
			try {
				List<BusData> list = busDataService.findList();			
				HashMap<Object, Object> hashMap = new HashMap<>();
				hashMap.put("msg", "查询成功");
				hashMap.put("status", 200);
				hashMap.put("data", list);
				response.getWriter().write(JSON.toJSONString(hashMap));
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

	/***
	 * 将数据改为已配送
	 */
	@RequestMapping(value="updateCommonData",method=RequestMethod.POST)
	public void updateCommonData(HttpServletRequest request, HttpServletResponse response) throws IOException {
		try {
			String arrays = request.getParameter("map");
			List<BusData> list = JSON.parseArray(arrays, BusData.class);
			int count = busDataService.updateCommonData(list);
			
			HashMap<Object, Object> hashMap = new HashMap<>();
			hashMap.put("msg", "配送成功");
			hashMap.put("status", 200);
			hashMap.put("count", count);
			response.getWriter().write(JSON.toJSONString(hashMap));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/***
	 * 删除数据
	 */
	@RequestMapping(value="deleteCommonData",method=RequestMethod.POST)
	public void deleteCommonData(HttpServletRequest request, HttpServletResponse response) throws IOException {
		try {
			String arrays = request.getParameter("map");
			List<BusData> list = JSON.parseArray(arrays, BusData.class);
			int count = busDataService.deleteCommonData(list);
			
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
