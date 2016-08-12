package com.iic.Controller;

import com.iic.Service.LoginService;
import com.iic.model.Login;
import com.iic.model.Status;
import com.sun.xml.internal.ws.handler.HandlerException;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/**
 * Created by mounika on 09/08/16.
 */

@RestController
@RequestMapping("/login")
public class LoginController {
@Autowired
    private LoginService loginservice;


    //    @ResponseBody
//    @ResponseStatus(value= HttpStatus.OK)
//    @RequestMapping(value="/mona/" ,method = RequestMethod.POST)
//    public String getByUseNameAndPassword(@RequestParam String username, @RequestParam String password){
//        Login login=loginservice.findByusernameAndPassword(username,password);
//        if(login.getUsername().equals(username) && login.getPassword().equals(password))
//            return  "success";
//        else throw new HandlerException("no such user",new RuntimeException());
//    }

    @RequestMapping(value = "/credentials/", method = RequestMethod.PUT,consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public  Status getByUseNameAndPassword(@RequestBody Login login)
    {
        try
        {

            String user=login.getUsername();
            String pass=login.getPassword();
            Login loginser=loginservice.findByusernameAndPassword(user, pass);
            if(loginser.getUsername().equals(user) && loginser.getPassword().equals(pass))
                return  new Status(200,"success");
            else
                return new Status(500,"fail");

        }
        catch (Exception e)
        {
            return  new Status(500,"fail");
        }

    }

}
