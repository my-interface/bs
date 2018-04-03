package com.bs.pojo;

/**
 * 
 * 
 * @author zhangyao
 * 
 * @date 2018-04-03
 */
public class BusDepartment {
    private String id;

    /**
     * 部门名字
     */
    private String departmentName;

    /**
     * 删除标记
     */
    private String delFlag;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName == null ? null : departmentName.trim();
    }

    public String getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag == null ? null : delFlag.trim();
    }
}