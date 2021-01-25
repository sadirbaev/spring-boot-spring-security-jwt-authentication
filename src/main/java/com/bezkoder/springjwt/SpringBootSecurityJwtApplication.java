package com.bezkoder.springjwt;

import com.bezkoder.springjwt.models.Factory;
import com.bezkoder.springjwt.models.Line;
import com.bezkoder.springjwt.models.Role;
import com.bezkoder.springjwt.models.User;
import com.bezkoder.springjwt.repository.FactoryRepository;
import com.bezkoder.springjwt.repository.LineRepository;
import com.bezkoder.springjwt.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.Set;

@SpringBootApplication
public class SpringBootSecurityJwtApplication implements CommandLineRunner {
	@Autowired
	UserRepository userRepository;
	@Autowired
	LineRepository lineRepository;
	@Autowired
	FactoryRepository factoryRepository;
	public static void main(String[] args) {
		SpringApplication.run(SpringBootSecurityJwtApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		List<User> userList = userRepository.findAll();
		Set<Role> roleSet = userList.get(0).getRoles();
		List<Line> lineList = lineRepository.findAll();
		List<Factory> factoryList = factoryRepository.findAll();
		System.out.println(userRepository.findAll());
	}
}
