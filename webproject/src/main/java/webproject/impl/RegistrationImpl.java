package webproject.impl;

import java.util.ArrayList;

import webproject.services.RegistrationI;

public class RegistrationImpl  implements RegistrationI{

	@Override
public void Registration(String firstname, String lastname, String email, String password) {
		// TODO Auto-generated method stub
		ArrayList list=new ArrayList();
		list.add(firstname);
		list.add(lastname);
		list.add(email);
		list.add(password);
		System.out.println("arraylist=="+list);
				
		
		
		
		
		
		
	}

}
