package com.common.Service;

import com.common.Repository.LoginRepository;
import com.common.model.Login;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by mounika on 09/08/16.
 */
@Service
public class LoginServiceImpl implements LoginService {
    @Autowired
    private LoginRepository loginRepository;


    @Override
    public List<Login> findByusernameAndPassword(String username, String password) {
        return loginRepository.findByusernameAndPassword(username, password);
    }
}
