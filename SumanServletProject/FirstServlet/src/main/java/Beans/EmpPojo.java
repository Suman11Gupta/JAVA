package Beans;

import java.io.Serializable;

public class EmpPojo implements Serializable {
int empno;
String ename;
public EmpPojo() {

}

public EmpPojo(int empno, String ename) {
	super();
	this.empno = empno;
	this.ename = ename;
}

public int getEmpno() {
	return empno;
}
public void setEmpno(int empno) {
	this.empno = empno;
}
public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}

}
