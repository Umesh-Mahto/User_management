package com.geekster.User.Management.System.service;

import com.geekster.User.Management.System.model.User;
import com.geekster.User.Management.System.repository.IUserRepo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {
    @Autowired
    IUserRepo userRepo;

    public String addUsers(User user)
    {
        userRepo.save(user) ;
        return "user added";
    }

    public Iterable<User> getAllUser() {
        return userRepo.findAll();
    }

    public Optional<User> getUserById(Long userId) {
        return userRepo.findById(userId);
    }

    @Transactional
    public String updateUser(User user) {
        userRepo.updateUser(user.getUserId(),user.getName(),user.getUserName(),user.getAddress(),user.getPhoneNumber());
  return "user updated ";
    }

    public String deleteById(Long userId) {
        userRepo.deleteById(userId);
        return "userId deleted";
    }
}
