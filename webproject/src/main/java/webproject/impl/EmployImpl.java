package webproject.impl;

import webproject.services.EmployRegister;

public class EmployImpl implements EmployRegister {

	@Override
	public void empRegister(String firstname, String lastname, String email, String password) {
		// TODO Auto-generated method stub
		System.out.println("empservelt---"+firstname+""+lastname+""+email+""+password);
		try {
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally {
			
		}
	}

	
}
