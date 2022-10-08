package com.ilkiz.webproject.repository;

import com.ilkiz.webproject.repository.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepository extends JpaRepository<User,Long> {

    @Query("select u.gender from User u where u.gender=?1")
    Boolean gender(String gender);

    User findOptionalByUsernameAndPassword(String username, String password);

}
