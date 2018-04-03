package com.bs.pojo;

/**
 * 
 * 
 * @author zhangyao
 * 
 * @date 2018-04-03
 */
public class BusType {
    private String id;

    /**
     * 科室名字
     */
    private String typeName;

    /**
     * 删除标记
     */
    private String delFlag;

    /**
     * 部门id
     */
    private String departmentId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName == null ? null : typeName.trim();
    }

    public String getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag == null ? null : delFlag.trim();
    }

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId == null ? null : departmentId.trim();
    }
}