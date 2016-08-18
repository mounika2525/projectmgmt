package com.common.Controller;

import com.common.Service.UserService;
import com.common.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

/**
 * Created by mounika on 10/08/16.
 */

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
private  UserService userService;
    @ResponseBody
    @ResponseStatus(value = HttpStatus.OK)
    @RequestMapping(value = "/insert/", method = RequestMethod.PUT)
    public  String insertUser(@RequestBody User user)
    {
        return userService.insert(user);
    }


}
