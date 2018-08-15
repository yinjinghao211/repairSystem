package com.repair.dao.pt;

import com.repair.entity.pt.EngineerRealnameauthenticationEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * auther   kangwang
 */
@Repository
public interface EngineerRealnameauthenticationEntityRepositry extends JpaRepository<EngineerRealnameauthenticationEntity,String> {

}
