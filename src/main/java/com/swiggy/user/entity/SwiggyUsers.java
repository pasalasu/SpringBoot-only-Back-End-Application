package com.swiggy.user.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "modbus")
public class SwiggyUsers {

	@Id
	@Column
	private int varname;
	@Column
	private String Ipport;
	@Column
	private String slaveid;
	@Column
	private String funcode;
	@Column
	private String dataT;
	@Column
	private String startaddress;
	@Column
	private String count;
	@Column
	private String Multi;
	@Column
	private String Offset;
	@Column
	private String Edit;

	public int getVarname() {
		return varname;
	}

	public void setVarname(int varname) {
		this.varname = varname;
	}

	public String getIpport() {
		return Ipport;
	}

	public void setIpport(String ipport) {
		Ipport = ipport;
	}

	public String getSlaveid() {
		return slaveid;
	}

	public void setSlaveid(String slaveid) {
		this.slaveid = slaveid;
	}

	public String getFuncode() {
		return funcode;
	}

	public void setFuncode(String funcode) {
		this.funcode = funcode;
	}

	public String getDataT() {
		return dataT;
	}

	public void setDataT(String dataT) {
		this.dataT = dataT;
	}

	public String getStartaddress() {
		return startaddress;
	}

	public void setStartaddress(String startaddress) {
		this.startaddress = startaddress;
	}

	public String getCount() {
		return count;
	}

	public void setCount(String count) {
		this.count = count;
	}

	public String getMulti() {
		return Multi;
	}

	public void setMulti(String multi) {
		Multi = multi;
	}

	public String getOffset() {
		return Offset;
	}

	public void setOffset(String offset) {
		Offset = offset;
	}

	public String getEdit() {
		return Edit;
	}

	public void setEdit(String edit) {
		Edit = edit;
	}

	public String getDelete() {
		return Delete;
	}

	public void setDelete(String delete) {
		Delete = delete;
	}
	@Column
	private String Delete;

}
