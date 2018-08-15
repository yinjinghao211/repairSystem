package com.repair.dao.pt;

import com.repair.entity.pt.EngineerSkillauthenticationEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * auther   kangwang
 */
@Repository
public interface EngineerSkillauthenticationEntityRepositry extends JpaRepository<EngineerSkillauthenticationEntity,String> {
}
