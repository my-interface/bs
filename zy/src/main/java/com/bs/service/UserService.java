package com.bs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bs.mapper.BusUserMapper;
import com.bs.pojo.BusUser;

@Service
public class UserService {

	@Autowired
	private BusUserMapper busUserMapper;
	
	/**
     * 判断账号密码
     * @param user
     * @return
     */
    public List<BusUser> selectFindListBylogin(BusUser user){
    	return busUserMapper.selectFindListBylogin(user);
    }
}
