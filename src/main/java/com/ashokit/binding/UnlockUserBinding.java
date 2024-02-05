package com.ashokit.binding;

import lombok.Data;

@Data
public class UnlockUserBinding {

	private String userEmail;
	
	private Integer tempPass;
	
	private Integer newPass;
	
	private Integer cPass;
	
	
}
