package com.simplilearn.HandlingUserAuthentication;

public class UserAuthentication {
	
	public boolean authentication(String username,String password) {
		
		
		if((username==null)||(password==null)) {
			return false;
		}
	
		if(username.equalsIgnoreCase("Ankit@gmail.com")) {
			if(password.equals("Ankit@1998")) {
				System.out.println("Logged In !!");
				return true;
			}
		}
		
		
		return false;
		
		
	}

}
