package com.ashokit.serivice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ashokit.binding.UnlockUserBinding;
import com.ashokit.constant.AppContstant;
import com.ashokit.entity.UserEntity;
import com.ashokit.repository.UserRepository;

@Service
public class UnloackServiceImpl implements UnlockService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public String unlockAccService(UnlockUserBinding unlockUserBinding) {
		UserEntity user = userRepository.findByUserEmailAndUserPWD(unlockUserBinding.getUserEmail(), unlockUserBinding.getTempPass());
		
		if(user!=null) {
			user.setUserPWD(unlockUserBinding.getNewPass());
			user.setUserAccStatus(AppContstant.UNLOCK);
			userRepository.save(user);
			return AppContstant.ACCOUNT_UNLOCK_SUCCESS;
			
		}
		
		return AppContstant.INVALID_TEMP_PASS;
	}

	

}
