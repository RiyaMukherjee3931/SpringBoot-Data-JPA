package com.jpafirsttime1.jpafirsttime1;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.jpafirsttime1.jpafirsttime1.dao.UserRepository;
import com.jpafirsttime1.jpafirsttime1.entities.User;

@SpringBootApplication
public class Jpafirsttime1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Jpafirsttime1Application.class, args);
		UserRepository userRepository = context.getBean(UserRepository.class);
		
		User userfir = new User();
		userfir.setName("Riya");
		userfir.setCity("Bengaluru");
		userfir.setStatus("Learning Java SpringBoot");
		//User user1 = userRepository.save(userfir);
		//System.out.println(user1);
		
		User user2 = new User();
		user2.setName("Neelam");		
		user2.setCity("Dhanbad");
		user2.setStatus("Learning now");
		
		
		User user3 = new User();
		user3.setName("Harshit");
		user3.setCity("Lucknow");
		user3.setStatus("Living his dream life");
		
		//User result = userRepository.save(user2);
	    //System.out.println(result);
		
		//User result1 = userRepository.save(user3);
		//System.out.println(result1);
		
		//Add
		//List<User> list = new ArrayList<>();
		//list.add(user3);
		//list.add(user2);
		//list.add(userfir);
		//Iterable<User> result = userRepository.saveAll(list);
		
		//result.forEach(user->{
		//System.out.println(user);
		//});
		
		//Optional<User> optional = userRepository.findById(354);
		//User userf = optional.get();
		//userf.setName("Laila");
		//User resultC = userRepository.save(userf);
		//System.out.println(resultC);
		
		//userRepository.deleteById(354);
		userRepository.deleteAll();
		
		
	}

}
