package com.bs.mapper;

import com.bs.pojo.BusData;

public interface BusDataMapper {
    int deleteByPrimaryKey(String id);

    int insert(BusData record);

    int insertSelective(BusData record);

    BusData selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(BusData record);

    int updateByPrimaryKey(BusData record);
}