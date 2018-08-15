package com.repair.dao.pt;

import com.repair.entity.pt.UserOrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

/**
 * auther   kangwang
 */
@Service
public interface UserOrderEntityRepositry extends JpaRepository<UserOrderEntity,String> {
}
