package com.capmkts.msrprocess.data;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class RefPatronCo {

	@Id
	@GeneratedValue
	private Integer tableID;
	
	@Column(name = "LenderNum")
	public String lenderNum = null;
	
	@Column(name = "PatronCoName")
	public String patronCoName = null;
	
	@Column(name = "OriginatorID")
	public int originatorID = 0;

	public Integer getTableID() {
		return tableID;
	}

	public void setTableID(Integer tableID) {
		this.tableID = tableID;
	}

	public String getLenderNum() {
		return lenderNum;
	}

	public void setLenderNum(String lenderNum) {
		this.lenderNum = lenderNum;
	}

	public String getPatronCoName() {
		return patronCoName;
	}

	public void setPatronCoName(String patronCoName) {
		this.patronCoName = patronCoName;
	}

	public int getOriginatorID() {
		return originatorID;
	}

	public void setOriginatorID(int originatorID) {
		this.originatorID = originatorID;
	}

}
