package com.bs.mapper;

import java.util.List;

import com.bs.pojo.BusDepartment;
import com.bs.pojo.FloorBean;

public interface BusDepartmentMapper {
    int deleteByPrimaryKey(String id);

    int insert(BusDepartment record);

    int insertSelective(BusDepartment record);

    BusDepartment selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(BusDepartment record);

    int updateByPrimaryKey(BusDepartment record);
    
    /**
     * 查询所有的部门
     * @return
     */
    List<BusDepartment> selectAllList();
    
    List<FloorBean> selectAllList2();
    
}