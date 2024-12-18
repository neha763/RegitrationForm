package com.example.demo.service;




import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.UserService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    public void saveUser(User user) {
        System.out.println("Address1 value: " + user.getAddress1());
        if (user.getAddress1() == null || user.getAddress1().isEmpty()) {
            throw new IllegalArgumentException("Address1 cannot be null or empty");
        }
        userRepository.save(user);
    }



	@Override
	public List<User> getAllUsers() {
		List<User> users = userRepository.findAll();
        System.out.println(users); 
        return users;
	}
}
