package com.bs.controller;

import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.bs.pojo.BusDepartment;
import com.bs.pojo.FloorBean;
import com.bs.service.BusDepartmentService;

@Controller
@RequestMapping("/system")
public class SystemDataController {

	@Autowired
	private BusDepartmentService busDepartmentService;
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
	
}
