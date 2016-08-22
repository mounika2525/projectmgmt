package com.common.Controller;

import com.common.Service.RegistrationService;
import com.common.model.Registration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

/**
 * Created by mounika on 22/08/16.
 */
@RestController
@RequestMapping("/registration")
public class RegistrationController {

@Autowired
    private RegistrationService registrationService;


    @ResponseBody
    @ResponseStatus(value = HttpStatus.OK)
    @RequestMapping(value = "/insert/", method = RequestMethod.PUT)
    public String insertRegistration(@RequestBody Registration registration)
    {
        return registrationService.insert(registration);
    }
}
