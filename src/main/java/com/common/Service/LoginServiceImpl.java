package com.common.Service;

import com.common.Repository.LoginRepository;
import com.common.model.Login;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by mounika on 09/08/16.
 */
@Transactional(readOnly=true)
@Service
public class LoginServiceImpl implements LoginService {
    @Autowired
    private LoginRepository loginRepository;


    @Override
    public List<Login> findByemailAndPassword(String email, String password) {
        return loginRepository.findByemailAndPassword(email, password);
    }
}
