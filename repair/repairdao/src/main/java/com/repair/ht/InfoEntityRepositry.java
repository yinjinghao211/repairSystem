package com.repair.ht;

import com.repair.entity.ht.InfoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * auther   kangwang
 */
@Repository
public interface InfoEntityRepositry extends JpaRepository<InfoEntity,String> {
    InfoEntity findInfoEntitiesByUsernameAndPassword(String username,String password);

}
