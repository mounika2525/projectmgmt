package com.common.Repository;

import com.common.model.Login;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by mounika on 09/08/16.
 */
@Repository
public interface LoginRepository extends JpaRepository<Login,Long> {

    @Query("select l from Login l where l.email = ?1 and l.password = ?2")
    public  List<Login> findByemailAndPassword(String email,String password);


}
