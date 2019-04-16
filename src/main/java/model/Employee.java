package model;


public class Employee {
	private String E_name;
	private int E_id;
	private int E_salary;
	private String E_address;
	public String getE_name() {
		return E_name;
	}
	public void setE_name(String e_name) {
		E_name = e_name;
	}
	public int getE_id() {
		return E_id;
	}
	public void setE_id(int e_id) {
		E_id = e_id;
	}
	public int getE_salary() {
		return E_salary;
	}
	public void setE_salary(int e_salary) {
		E_salary = e_salary;
	}
	public String getE_address() {
		return E_address;
	}
	public void setE_address(String e_address) {
		E_address = e_address;
	}
	public Employee(String e_name, int e_id, int e_salary, String e_address) {
		super();
		E_name = e_name;
		E_id = e_id;
		E_salary = e_salary;
		E_address = e_address;
	}
	

	
}
