package com.bs.mapper;

import com.bs.pojo.BusType;

public interface BusTypeMapper {
    int deleteByPrimaryKey(String id);

    int insert(BusType record);

    int insertSelective(BusType record);

    BusType selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(BusType record);

    int updateByPrimaryKey(BusType record);
}