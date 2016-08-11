package com.iic.Service;

import com.iic.model.Login;

/**
 * Created by mounika on 09/08/16.
 */
public interface LoginService {
    Login findByusernameAndPassword(String username, String password);
}
