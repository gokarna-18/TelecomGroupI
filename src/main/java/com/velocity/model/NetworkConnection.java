package com.velocity.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="NetworkConnection")
public class NetworkConnection {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String connection_Name;
	private String Connection_Type;
	private String connection_Status;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getConnection_Name() {
		return connection_Name;
	}
	public void setConnection_Name(String connection_Name) {
		this.connection_Name = connection_Name;
	}
	public String getConnection_Type() {
		return Connection_Type;
	}
	public void setConnection_Type(String connection_Type) {
		Connection_Type = connection_Type;
	}
	public String getConnection_Status() {
		return connection_Status;
	}
	public void setConnection_Status(String connection_Status) {
		this.connection_Status = connection_Status;
	}
	@Override
	public String toString() {
		return "NetworkConnection [id=" + id + ", connection_Name=" + connection_Name + ", Connection_Type="
				+ Connection_Type + ", connection_Status=" + connection_Status + "]";
	}
	
	
	

}
