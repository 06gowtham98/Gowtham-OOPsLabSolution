package service;
import model.Employee;	
import model.Department;	
import java.util.*;
public class CredentialService {


	public String generateEmail(Employee employee, Department department) {
		String email = employee.getfName().toLowerCase()+employee.getlName().toLowerCase()+"@"+department.getDeptName()+".company.com";
		return email;
	}

	public String generatePassword() {
		String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallLetters = "abcdefghijklmnopqrstuvwxyz";
		String numbers = "0123456789";
		String specialCharacters = "!@#$%^&*_=+-/.?<>)";
		String values = capitalLetters + smallLetters + numbers + specialCharacters;
		Random obj = new Random();
		char[] password=new char[8];
		for(int i=0;i<8;i++) {
			password[i]=values.charAt(obj.nextInt(values.length()));
		}
		return new String(password);
	}

	public void showCredentials(String email, String password) {
		System.out.println("Generated Email: "+email);
		System.out.println("Generated Password:"+password);
	}
}
