package com.common.Service;

import com.common.Repository.UserRepository;
import com.common.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by mounika on 10/08/16.
 */
@Service
public class UserSerivceImpl implements  UserService {
    @Autowired
    private UserRepository userRepository;


    @Override
    public String insert(User user) {
        try {
            User user1 = new User();
            user1.setUsername(user.getUsername());
            user1.setPassword(user.getPassword());
            userRepository.save(user1);


        } catch (Exception ex) {
            return "Error creating the user....: " + ex.toString();
        }
        return "User succesfully created! (id = " + user.getId() + ")";


    }
}









