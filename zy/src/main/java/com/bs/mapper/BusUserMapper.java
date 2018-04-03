package com.bs.mapper;

import com.bs.pojo.BusUser;

public interface BusUserMapper {
    int deleteByPrimaryKey(String id);

    int insert(BusUser record);

    int insertSelective(BusUser record);

    BusUser selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(BusUser record);

    int updateByPrimaryKey(BusUser record);
}