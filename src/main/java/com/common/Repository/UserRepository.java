package com.common.Repository;


import com.common.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by mounika on 10/08/16.
 */
@Repository
public interface UserRepository extends JpaRepository<User,Long>
{

   // public String insert (@RequestBody User user);

}
