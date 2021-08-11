package cn.xn.mapper;

import cn.xn.dto.Order;
import cn.xn.dto.OrderCreateInput;
import cn.xn.dto.OrderUpdateInput;

/**
 * @author XiaoNing
 */
public interface OrderMapper {

    Order findById(Integer id);

    void saveOne(OrderCreateInput input);

    void updateOne(OrderUpdateInput input);
}
