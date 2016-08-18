package com.common.Service;

import com.common.model.Login;

import java.util.List;

/**
 * Created by mounika on 09/08/16.
 */
public interface LoginService{
    public List<Login> findByusernameAndPassword(String username,String password);



}
