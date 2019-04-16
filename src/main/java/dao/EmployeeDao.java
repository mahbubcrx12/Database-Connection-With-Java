package dao;



import model.Employee;

public interface EmployeeDao {
	  
	   public int create(Employee e);
	   public int read(int a);
	   public int update(Employee e, int c,String a,String b);
	   public int delete(Employee e);
	  
	}