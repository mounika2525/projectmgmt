package com.common.Controller;

import com.common.Repository.LoginRepository;
import com.common.Service.LoginService;
import com.common.model.Login;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/**
 * Created by mounika on 09/08/16.
 */

@RestController
@RequestMapping("/project_mgmt")
public class LoginController {
    @Autowired
    private LoginRepository loginRepository;

    @CrossOrigin(origins = "*")
    @RequestMapping(value = "/login/", method = RequestMethod.GET)
    public List<Login> find() {

        return loginRepository.findAll();

    }


}







