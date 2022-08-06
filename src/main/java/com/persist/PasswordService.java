package com.persist;

import java.util.Base64;
import java.util.Base64.Encoder;

public class PasswordService 
{

	public String encode(String str)
	{
		Encoder encoder=Base64.getEncoder();
		String encpass=encoder.encodeToString(str.getBytes());
		
		
		
		return encpass;
	}
}
