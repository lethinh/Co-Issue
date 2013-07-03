package com.capmkts.msrprocess.data;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "[CoIssue_Test].[dbo].[CMC_Agency_CommitNumber]")
public class CMCAgencyCommitmentNumber implements Serializable{
	
	@Id
	@GeneratedValue
	private int tableID;

	@Column(name = "CMC_Commit_Number")
	private Integer cmcCommitNumber;
	
	@Column(name = "Agency_Commit_Number")
	private String agencyCommitNumber;

	@Column(name = "CMC_Commit_Status")
	private String cmcCommitStatus;

	public int getTableID() {
		return tableID;
	}

	public void setTableID(int tableID) {
		this.tableID = tableID;
	}

	public Integer getCmcCommitNumber() {
		return cmcCommitNumber;
	}

	public void setCmcCommitNumber(Integer cmcCommitNumber) {
		this.cmcCommitNumber = cmcCommitNumber;
	}

	public String getAgencyCommitNumber() {
		return agencyCommitNumber;
	}

	public void setAgencyCommitNumber(String agencyCommitNumber) {
		this.agencyCommitNumber = agencyCommitNumber;
	}

	public String getCmcCommitStatus() {
		return cmcCommitStatus;
	}

	public void setCmcCommitStatus(String cmcCommitStatus) {
		this.cmcCommitStatus = cmcCommitStatus;
	}

	

}
