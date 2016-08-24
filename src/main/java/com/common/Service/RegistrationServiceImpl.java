package com.common.Service;

import com.common.Repository.RegistrationRepository;
import com.common.model.Registration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * Created by mounika on 22/08/16.
 */
@Service
public class RegistrationServiceImpl implements RegistrationService {
    @Autowired
    private RegistrationRepository registrationRepository;


    public String insert(Registration registration) {

        try {
            Registration registration1=new Registration();
            registration1.setEmail(registration.getEmail());
            registration1.setPassword(registration.getPassword());
            registrationRepository.save(registration1);


        } catch (Exception ex) {
            return "Error creating the user....: " + ex.toString();
        }
        return "User succesfully created!";


    }
}
