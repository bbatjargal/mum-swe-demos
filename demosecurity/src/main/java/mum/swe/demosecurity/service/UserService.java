package mum.swe.demosecurity.service;

import mum.swe.demosecurity.model.User;

public interface UserService {

	User save(User user);
    User findByUsername(String username);
}
