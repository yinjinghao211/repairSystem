package com.repair.dao.pt;

import com.repair.entity.pt.EngineerExperienceEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * auther   kangwang
 */
@Repository
public interface EngineerExperienceEntityRepositry extends JpaRepository<EngineerExperienceEntity,String> {

}
