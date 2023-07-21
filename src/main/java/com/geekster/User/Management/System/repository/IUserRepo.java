package com.geekster.User.Management.System.repository;

import com.geekster.User.Management.System.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepo extends JpaRepository<User,Long> {

    @Modifying
    @Query(value = "update user set name=:name,user_name = :userName,address = :address,phone_number = :phoneNumber where user_id=:userId",nativeQuery = true)
    void updateUser(Long userId,String name, String userName, String address, String phoneNumber);
}
