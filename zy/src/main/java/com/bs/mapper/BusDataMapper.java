package com.bs.mapper;

import java.util.List;

import com.bs.pojo.BusData;
import com.bs.pojo.FloorBean;

public interface BusDataMapper {
    int deleteByPrimaryKey(String id);

    int insert(BusData record);

    int insertSelective(BusData record);

    BusData selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(BusData record);

    int updateByPrimaryKey(BusData record);

    /***
     * 批量插入普通数据
     * @param list
     * @return
     */
	int insertLarge(List<BusData> list);
	
	/**
	 * 查询所有的数据
	 * @return
	 */
	List<FloorBean> findList();

	/**
	 * 修改为已配送
	 * @param list
	 * @return
	 */
	int updateCommonData(List<BusData> list);
	
	/**
	 * 删除普通数据
	 * @param list
	 * @return
	 */
	
	int deleteCommonData(List<BusData> list);
	
}