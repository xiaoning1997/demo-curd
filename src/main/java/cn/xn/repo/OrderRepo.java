package cn.xn.repo;


import cn.xn.dto.Order;


/**
 * @author XiaoNing
 */

public interface OrderRepo  {


    Order findById(Integer id);
}
