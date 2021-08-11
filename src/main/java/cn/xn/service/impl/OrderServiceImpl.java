package cn.xn.service.impl;

import cn.xn.dto.Order;
import cn.xn.dto.OrderCreateInput;
import cn.xn.dto.OrderUpdateInput;
import cn.xn.mapper.OrderMapper;
import cn.xn.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author XiaoNing
 * @date 2021/8/8
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderMapper orderMapper;

    @Override
    public Order query(Integer id) {
        return orderMapper.findById(id);
    }


    @Override
    public void createOrder(OrderCreateInput input) {
       orderMapper.saveOne(input);
    }

    @Override
    public void updateOrder(OrderUpdateInput input) {
          orderMapper.updateOne(input);
    }
}
