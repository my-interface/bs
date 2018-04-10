package com.bs.mapper;

import java.util.List;

import com.bs.pojo.BusUser;

public interface BusUserMapper {
    int deleteByPrimaryKey(String id);

    int insert(BusUser record);

    int insertSelective(BusUser record);

    BusUser selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(BusUser record);

    int updateByPrimaryKey(BusUser record);
    
    /**
     * 判断账号密码
     * @param user
     * @return
     */
    List<BusUser> selectFindListBylogin(BusUser user);
    
}