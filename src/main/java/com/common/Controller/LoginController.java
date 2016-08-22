package com.common.Controller;

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
@RequestMapping("/login")
public class LoginController {
    @Autowired
    private LoginService loginservice;


//    @ResponseBody
    //   @ResponseStatus(value= HttpStatus.OK)
//    @RequestMapping(value="/mona/" ,method = RequestMethod.POST)
//    public String getByUseNameAndPassword(@RequestParam String username, @RequestParam String password){
//        Login login=loginservice.findByusernameAndPassword(username,password);
//        if(login.getUsername().equals(username) && login.getPassword().equals(password))
//            return  "success";
//        else throw new HandlerException("no such user",new RuntimeException());
//    }

   // @RequestMapping(value = "/credential/", method = RequestMethod.PUT)
//    public List<Login> getByUseNameAndPassword(@RequestBody Login login) {
//        try {
//
//            String user = login.getUsername();
//            String pass = login.getPassword();
////            List<Login> loginser = new ArrayList<Login>();
////            loginser.add(login);
//            List<Login> login1 = loginservice.findByusernameAndPassword(user, pass);
//            for (Login login2 : login1) {
//                if (login2.getUsername().equals(user) && login2.getPassword().equals(pass))
//                    return login1;
//                else
//                    return null;
//            }
//        } catch (Exception e) {
//            return null;
//        }
//        return null;
//    }

    @RequestMapping(value = "/credential/", method = RequestMethod.GET)
//public ResponseEntity<List<Login>> getByUseNameAndPassword(@RequestParam String username,@RequestParam String password)
//    {
//
//
//        List<Login> logins=loginservice.findByusernameAndPassword(username,password);
//        if(logins.isEmpty()) {
//            return new ResponseEntity<List<Login>>(HttpStatus.OK);
//
//        }
//        return new ResponseEntity<List<Login>>(logins, HttpStatus.OK);
//    }


    public Login ogin(@PathVariable Login login)
    {
        if(login.getUsername()!=null && login.getPassword()!=null)
        {
loginservice.findByusernameAndPassword(login.getUsername(),login.getPassword());
            return  login;

        }
        return null;
    }




}








