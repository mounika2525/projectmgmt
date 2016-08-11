package com.iic.Service;

import com.iic.model.User;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

/**
 * Created by mounika on 10/08/16.
 */
public interface UserService {

    public String insert ( User user);

}
