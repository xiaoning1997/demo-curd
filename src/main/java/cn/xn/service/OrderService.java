package cn.xn.service;

import cn.xn.dto.CreateOrderOutput;
import cn.xn.dto.Order;
import cn.xn.dto.OrderCreateInput;
import cn.xn.dto.OrderUpdateInput;

/**
 * @author XiaoNing
 */
public interface OrderService {
    Order query(Integer id);

    void createOrder(OrderCreateInput order);

    void updateOrder(OrderUpdateInput input);


}
