package com.bs.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.bs.pojo.BusTypeFund;

public interface BusTypeFundMapper {
    int deleteByPrimaryKey(String id);

    int insert(BusTypeFund record);

    int insertSelective(BusTypeFund record);

    BusTypeFund selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(BusTypeFund record);

    int updateByPrimaryKey(BusTypeFund record);
    
    
    /**
     * 同时插入多条数据
     * @param list
     * @return
     */
    int insertLarge (@Param("list") List<BusTypeFund> list);

    /**
     * 同时删除多条数据
     * @param list
     * @return
     */
	int deleteLarge(List<BusTypeFund> list);
}