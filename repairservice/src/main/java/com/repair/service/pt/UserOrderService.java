package com.repair.service.pt;

import com.repair.model.request.pt.UserAddOrdrerRequest;
import com.repair.model.response.ReturnValue;

/**
 * auther   kangwang
 *
 * 用户订单
 */
public interface UserOrderService {
    public ReturnValue AddOrder(UserAddOrdrerRequest userAddOrdrerRequest);

}
