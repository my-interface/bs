package com.bs.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.bs.pojo.BusUser;
import com.bs.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {

	private static Logger log = Logger.getLogger(UserController.class); 
	@Autowired
	private UserService userService;
	/***
	 * 登录方法
	 * @return
	 */
	@RequestMapping("/login")
	public void login(HttpServletRequest request, HttpServletResponse response) {
		try {
			 String user = request.getParameter("user");
			//String user = "{loginName:\"admin\",password:\"123456\"}";
			JSONObject jsonObject = new JSONObject();
			JSONObject parseObject = JSON.parseObject(user);
			BusUser busUser = JSON.toJavaObject(parseObject, BusUser.class);
			if (busUser != null && StringUtils.isNotBlank(busUser.getLoginName())
					&& StringUtils.isNotBlank(busUser.getPassword())) {
				//进行校验
				List<BusUser> list = userService.selectFindListBylogin(busUser);
				if(list!=null&&list.size()>0){
					request.getSession().setAttribute("currentUser", list.get(0));
					//登录成功
					jsonObject.put("msg", "登录成功");
					jsonObject.put("status", "200");
					log.info("登录用户名："+busUser.getLoginName()+",密码："+busUser.getPassword()+"登录成功");
				}else{
					//账号密码错误失败	
					jsonObject.put("msg", "账号或密码错误");
					jsonObject.put("status", "500");
				}
				
			} else {
				//账号密码为空失败	
				jsonObject.put("msg", "账号或密码不能为空");
				jsonObject.put("status", "500");
			}
			response.getWriter().write(jsonObject.toJSONString());
			System.out.println(busUser);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	@RequestMapping("/test")
	public void test(HttpServletRequest request,HttpServletResponse response) throws IOException{
		JSONObject jsonObject = new JSONObject();
		response.setContentType("text/html;charset=utf-8");
		response.setCharacterEncoding("utf-8");
		jsonObject.put("1", "sabilipeng");
		response.getWriter().write(jsonObject.toJSONString());
	}
	
	@RequestMapping("/get")
	public void get(HttpServletRequest request,HttpServletResponse response) throws IOException{
		request.setCharacterEncoding("utf-8");
		String parameter = request.getParameter("1");
		System.out.println(parameter);
	}
}
