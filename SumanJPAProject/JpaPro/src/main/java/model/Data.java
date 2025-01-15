package model;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Data {
	public static void main(String[] args) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("JpaPro");
		EntityManager manage=factory.createEntityManager();
		
		manage.getTransaction().begin();
		Employee ob=new Employee();
		ob.setDeptno(10);
		ob.setEmpno(456);
		ob.setName("Suvi");
		ob.setSalary(450000);
		manage.persist(ob);
		manage.getTransaction().commit();
		System.out.println("Record save!!!!!!!!!!!");
	}
}
