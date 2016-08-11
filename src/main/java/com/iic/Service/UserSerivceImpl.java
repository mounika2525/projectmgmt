package com.iic.Service;

import com.iic.Repository.UserRepository;
import com.iic.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

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
            User obj = new User();
            obj.setUsername(user.getUsername());
            obj.setPassword(user.getPassword());
            userRepository.save(obj);


        } catch (Exception ex) {
            return "Error creating the user....: " + ex.toString();
        }
        return "User succesfully created! (id = " + user.getId() + ")";


    }
}









