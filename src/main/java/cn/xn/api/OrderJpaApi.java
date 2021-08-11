package cn.xn.api;

import cn.xn.common.dto.ApiResult;
import cn.xn.dto.Order;
import cn.xn.repo.OrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author XiaoNing
 * @date 2021/8/8
 */
@RestController("/api/v2/order")
public class OrderJpaApi {



    @RequestMapping("/id/{id}")
    public ApiResult<Order> query(@PathVariable Integer id) {

        return null;
//        return ApiResult.success(orderRepo.findById(id));
    }

}
