package driver;

import model.Department;
import model.Employee;
import service.CredentialService;

import java.util.Scanner;


public class DriverClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee= new Employee("Gowtham","Subramanian");
		System.out.println("Hello "+employee.getfName()+" Enter Department Name");
		System.out.println("1.Technical\n2.Admin\n3.HR\n4.Legal");
		Scanner in=new Scanner(System.in);
		int depChoice = in.nextInt();
		Department department = new Department();
		CredentialService cr = new CredentialService();
		switch(depChoice) {
		case 1:
			department.setDeptName("technical");
			String email = cr.generateEmail(employee, department);
			String password = cr.generatePassword();
			cr.showCredentials(email, password);
			break;
		case 2:
			department.setDeptName("admin");
			email = cr.generateEmail(employee, department);
			password = cr.generatePassword();
			cr.showCredentials(email, password);
			break;

		case 3:
			department.setDeptName("hr");
			email = cr.generateEmail(employee, department);
			password = cr.generatePassword();
			cr.showCredentials(email, password);
			break;

		case 4:
			department.setDeptName("legal");
			email = cr.generateEmail(employee, department);
			password = cr.generatePassword();
			cr.showCredentials(email, password);
			break;

		default:
			System.out.println("Invalid");
		}
	}
}
