package com.bs.mapper;

import com.bs.pojo.BusDepartment;

public interface BusDepartmentMapper {
    int deleteByPrimaryKey(String id);

    int insert(BusDepartment record);

    int insertSelective(BusDepartment record);

    BusDepartment selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(BusDepartment record);

    int updateByPrimaryKey(BusDepartment record);
}