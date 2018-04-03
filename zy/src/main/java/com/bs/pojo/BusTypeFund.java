package com.bs.pojo;

/**
 * 
 * 
 * @author zhangyao
 * 
 * @date 2018-04-03
 */
public class BusTypeFund {
    private String id;

    /**
     * 名字
     */
    private String name;

    /**
     * 单位
     */
    private String unit;

    /**
     * 删除标记
     */
    private String delFlag;

    /**
     * 科室id
     */
    private String typeId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit == null ? null : unit.trim();
    }

    public String getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag == null ? null : delFlag.trim();
    }

    public String getTypeId() {
        return typeId;
    }

    public void setTypeId(String typeId) {
        this.typeId = typeId == null ? null : typeId.trim();
    }
}