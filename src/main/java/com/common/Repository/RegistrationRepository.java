package com.common.Repository;

import com.common.model.Registration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by mounika on 22/08/16.
 */
@Repository
public interface RegistrationRepository extends JpaRepository<Registration,Long> {

}
