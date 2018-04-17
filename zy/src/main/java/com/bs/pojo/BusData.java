package com.bs.pojo;

import java.util.Date;

/**
 * 
 * 
 * @author zhangyao
 * 
 * @date 2018-04-03
 */
public class BusData {
    private String id;

    /**
     * 创建者
     */
    private String userId;

    private BusUser user;
    
    /**
     * 创建时间
     */
    private Date createDate;

    /**
     * 数量
     */
    private String fundNum;

    /**
     * 单位
     */
    private String typeId;
    
    private BusTypeFund typeName;
    

    /**
     * 配送标记，0未配送，1配送
     */
    private String distributionFlag;

    
    /**
     * 删除标记
     */
    private String delFlag;

    
    
    public BusUser getUser() {
		return user;
	}

	public void setUser(BusUser user) {
		this.user = user;
	}

	public BusTypeFund getTypeName() {
		return typeName;
	}

	public void setTypeName(BusTypeFund typeName) {
		this.typeName = typeName;
	}

	public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getFundNum() {
        return fundNum;
    }

    public void setFundNum(String fundNum) {
        this.fundNum = fundNum == null ? null : fundNum.trim();
    }

    public String getTypeId() {
        return typeId;
    }

    public void setTypeId(String typeId) {
        this.typeId = typeId == null ? null : typeId.trim();
    }

    public String getDistributionFlag() {
        return distributionFlag;
    }

    public void setDistributionFlag(String distributionFlag) {
        this.distributionFlag = distributionFlag == null ? null : distributionFlag.trim();
    }

    public String getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag == null ? null : delFlag.trim();
    }
}