package model;
// Generated Jul 5, 2018 8:12:02 AM by Hibernate Tools 3.5.0.Final

import java.util.HashSet;
import java.util.Set;

/**
 * Customer generated by hbm2java
 */
public class Customer implements java.io.Serializable {

	private int idcustomer;
	private String name;
	private String address;
	private Set orderses = new HashSet(0);

	public Customer() {
	}

	public Customer(int idcustomer) {
		this.idcustomer = idcustomer;
	}

	public Customer(int idcustomer, String name, String address, Set orderses) {
		this.idcustomer = idcustomer;
		this.name = name;
		this.address = address;
		this.orderses = orderses;
	}

	public int getIdcustomer() {
		return this.idcustomer;
	}

	public void setIdcustomer(int idcustomer) {
		this.idcustomer = idcustomer;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Set getOrderses() {
		return this.orderses;
	}

	public void setOrderses(Set orderses) {
		this.orderses = orderses;
	}

}
