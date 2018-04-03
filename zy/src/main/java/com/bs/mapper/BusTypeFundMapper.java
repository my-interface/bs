package com.bs.mapper;

import com.bs.pojo.BusTypeFund;

public interface BusTypeFundMapper {
    int deleteByPrimaryKey(String id);

    int insert(BusTypeFund record);

    int insertSelective(BusTypeFund record);

    BusTypeFund selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(BusTypeFund record);

    int updateByPrimaryKey(BusTypeFund record);
}