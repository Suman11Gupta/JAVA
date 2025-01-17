package model;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Data {
	public static void main(String[] args) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("JpaPro");
		EntityManager manage=factory.createEntityManager();

		//---------------Insert Record-----------------------
		// manage.getTransaction().begin();
		// Employee ob=new Employee();
		// ob.setDeptno(10);
		// ob.setEmpno(456);
		// ob.setName("Suvi");
		// ob.setSalary(450000);
		// manage.persist(ob);
		// manage.getTransaction().commit();
		// System.out.println("Record save!!!!!!!!!!!");

		//------------------Display All Records------------------
		
//		transaction.begin();
//		List<Employee> all=manage.createQuery("Select e From Employee e").getResultList();
//		System.out.println("All Employee");
//		System.out.println("Deptno\tEmpno\tName\tSalary");
//		System.out.println("-------------------------------");
//		for(Employee Ev:all) {
//			System.out.print(Ev.getDeptno()+"   ");
//			System.out.print(Ev.getEmpno()+"  ");
//			System.out.print(Ev.getName()+"  ");
//			System.out.println(Ev.getSalary());
//		}
//		transaction.commit();
		
		//--------------------Update Record-----------------------
		
//	transaction.begin();
//	Employee updateob=manage.find(Employee.class, 89);
//	updateob.setName("Vineeta");
//	transaction.commit();
//	System.out.println("Record Updated");
	
	//-------------------Delete Record-----------------------------
	
	transaction.begin();
	Employee delob=manage.find(Employee.class, 102);
	manage.remove(delob);
	transaction.commit();
	System.out.println("Record deleted");
		
	}
}
