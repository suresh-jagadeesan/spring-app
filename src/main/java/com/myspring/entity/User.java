/**
 * 
 */
package com.myspring.entity;

/**
 * @author jagadsu
 *
 */

public class User {

	private Integer id;
	private String name;
	private String group;
	public User() {

	}
	/**
	 * @param id
	 * @param name
	 * @param group
	 */
	public User(Integer id, String name, String group) {
		super();
		this.id = id;
		this.name = name;
		this.group = group;
	}
	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the group
	 */
	public String getGroup() {
		return group;
	}
	/**
	 * @param group the group to set
	 */
	public void setGroup(String group) {
		this.group = group;
	}

}
