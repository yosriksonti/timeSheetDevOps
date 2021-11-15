package com.tp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.tp.services.UserServiceImpl;

@SpringBootTest
class TimeSheetApplicationTests {

	@Autowired
	UserServiceImpl userService;
	
	@Test
	void contextLoads() {
		Assertions.assertNotNull(userService);
	}

}
