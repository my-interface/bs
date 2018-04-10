package com.bs.filter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bs.pojo.BusUser;

public class MyEncodFilter implements Filter{

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain filter)
			throws IOException, ServletException {
		req.setCharacterEncoding("UTF-8");  
        res.setCharacterEncoding("UTF-8");  
        res.setContentType("text/html;charset=UTF-8");
        
        HttpServletRequest httpServletRequest=(HttpServletRequest) req;
        HttpServletResponse httpServletResponse=(HttpServletResponse) res;
        
        //得到用户请求路径
        String servletPath=httpServletRequest.getServletPath();
       List<String> list = new ArrayList<>();
       list.add("/user/login");
        if(list.contains(servletPath)){
            filter.doFilter(httpServletRequest, httpServletResponse);
            return;
        }
        
        //从session中获取用户并判断用户是否登录过，如果没有登录过则重定向到登录界面
        BusUser user = (BusUser)httpServletRequest.getSession().getAttribute("currentUser");
		if (user == null) {
			httpServletResponse.sendRedirect(httpServletRequest.getContextPath() + "/user/login");
			return;
		}
        
        //放行
        filter.doFilter(httpServletRequest, httpServletResponse);
        
        
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}

}
