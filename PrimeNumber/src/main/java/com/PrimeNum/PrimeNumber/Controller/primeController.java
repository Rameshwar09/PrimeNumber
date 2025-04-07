package com.PrimeNum.PrimeNumber.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class primeController {

	@GetMapping("/{number}")
	public boolean Primenum(@PathVariable int number)
	{
		if(number<=1)
		{
			return false;
		}
		
		for(int i=2;i<=Math.sqrt(number);i++)
		{
			if(number%i==0)
			{
				return false;
			}
		}
		
		return true;
	}
}
