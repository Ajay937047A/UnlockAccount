package com.ashokit.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ashokit.binding.UnlockUserBinding;
import com.ashokit.serivice.UnlockService;

@RestController
public class UnlockRestController {
	
	@Autowired
	private UnlockService unlockService;
	
	
	@PostMapping("/unlockAcc")
	public String unlockUserAcc(@RequestBody UnlockUserBinding unlockUserBinding) {
		
		return unlockService.unlockAccService(unlockUserBinding);
		
		
	}
	

}
