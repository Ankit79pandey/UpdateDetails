package com.simplilearn.HandlingUserAuthentication;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
class AuthenticationTest {

	private UserAuthentication user;
	@BeforeEach
	public void BeforeEach() {
		user =new UserAuthentication();
		System.out.println("UserAuthentication Initiated");
	}
	@AfterEach
	public void tearDown() {
		user=null;
		System.out.println("UserAuthentication stopped");
	}@Test
	public void Authenticate() {
		assertTrue(user.authentication("Ankit@gmail.com","Ankit@1998"));
		assertFalse(user.authentication("rttfyg", "jhbkj"));
		assertNotEquals(user.authentication("Ankit","Ankit"), user.authentication("Ankit@gmail.com", "Ankit@1998"));
		assertEquals(user.authentication("Ankit@gmail.com","Ankit@1998"), user.authentication("Ankit@gmail.com", "Ankit@1998"));
	}
	@Test
    public void Authenticate1() {
				assertFalse(user.authentication("",""));
		}
	}
