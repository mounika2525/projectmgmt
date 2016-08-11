package com.iic.Repository;

import com.iic.model.Login;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by mounika on 09/08/16.
 */
@Repository
public interface LoginRepository extends JpaRepository<Login,Long> {


    Login findByusernameAndPassword(String username,String password);
}
