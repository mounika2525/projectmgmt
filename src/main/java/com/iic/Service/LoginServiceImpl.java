package com.iic.Service;

import com.iic.Repository.LoginRepository;
import com.iic.model.Login;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by mounika on 09/08/16.
 */
@Service
public class LoginServiceImpl implements LoginService {
    @Autowired
    private LoginRepository loginRepository;


    @Override
    public Login findByusernameAndPassword(String username, String password) {
        return loginRepository.findByusernameAndPassword(username, password);
    }


}
