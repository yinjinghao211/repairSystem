package com.repair.dao.ht;

import com.repair.entity.ht.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * auther   kangwang
 */
@Repository
public interface UserEntityRepositry extends JpaRepository<UserEntity,String> {
    UserEntity findUserEntityByNameAndPassword(String username,String password);
}
