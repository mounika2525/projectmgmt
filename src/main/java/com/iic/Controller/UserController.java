package com.iic.Controller;

import com.iic.Repository.UserRepository;
import com.iic.Service.UserService;
import com.iic.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

/**
 * Created by mounika on 10/08/16.
 */

@RestController
@RequestMapping("/user")
public class UserController {

//
//    @ResponseBody
//    @ResponseStatus(value = HttpStatus.OK)
//    @RequestMapping(value = "/save/", method = RequestMethod.POST)
//    public Student create (@RequestBody Student student) {
//
//        Student student1 = new Student();
//        student1.setName(student.getName());
//        student1.setEmail(student.getEmail());
//
//        studentRepo.save(student1);
//
//        return student1;
//    }





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
