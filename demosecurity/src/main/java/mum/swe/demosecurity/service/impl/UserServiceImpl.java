package mum.swe.demosecurity.service.impl;

import java.util.HashSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import mum.swe.demosecurity.model.Role;
import mum.swe.demosecurity.model.User;
import mum.swe.demosecurity.repository.RoleRepository;
import mum.swe.demosecurity.repository.UserRepository;
import mum.swe.demosecurity.service.UserService;

@Service("userService")
public class UserServiceImpl  implements UserService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private RoleRepository roleRepository;
    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    public User save(User user) {    	
		user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        user.setRoles(new HashSet<Role>(roleRepository.findAll()));
		user = userRepository.save(user);
		return user;		
    }

    @Override
    public User findByUsername(String username) {
        return userRepository.findByUsername(username);
    }
}
