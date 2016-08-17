package com.iic.Controller;

import com.iic.Service.LoginService;
import com.iic.model.Login;
import com.iic.model.Status;
import com.sun.xml.internal.ws.handler.HandlerException;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by mounika on 09/08/16.
 */

@RestController
@RequestMapping("/login")
public class LoginController {
@Autowired
    private LoginService loginservice;


    @ResponseBody
    @ResponseStatus(value= HttpStatus.OK)
//    @RequestMapping(value="/mona/" ,method = RequestMethod.POST)
//    public String getByUseNameAndPassword(@RequestParam String username, @RequestParam String password){
//        Login login=loginservice.findByusernameAndPassword(username,password);
//        if(login.getUsername().equals(username) && login.getPassword().equals(password))
//            return  "success";
//        else throw new HandlerException("no such user",new RuntimeException());
//    }

    @RequestMapping(value = "/credentials/", method = RequestMethod.PUT)
    public  List<Login> getByUseNameAndPassword(@RequestBody Login login)
    {
        try {

            String user = login.getUsername();
            String pass = login.getPassword();
//            List<Login> loginser = new ArrayList<Login>();
//            loginser.add(login);
            List<Login> obj1 = loginservice.findByusernameAndPassword(user, pass);
            for (Login obj2 : obj1) {
                if (obj2.getUsername().equals(user) && obj2.getPassword().equals(pass))
                    return obj1;
                else
                    return null;
            }
        }
        catch (Exception e)
        {
            return  null;
        }
return null;
    }

}
