package cn.xn.api;

import cn.xn.common.dto.ApiResult;
import cn.xn.dto.Order;
import cn.xn.dto.OrderCreateInput;
import cn.xn.dto.OrderUpdateInput;
import cn.xn.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @author XiaoNing
 * @date 2021/8/8
 */
@Controller
@RequestMapping("/api/v1/order")
public class OrderApi {


    @Autowired
    private OrderService orderService;


    @ResponseBody
    @RequestMapping("/hello")
    public String hello() {
        return "Hello!";
    }

    @ResponseBody
    @RequestMapping("/id/{id}")
    public ApiResult<Order> query(@PathVariable Integer id) {
        return ApiResult.success(orderService.query(id));
    }

    @ResponseBody
    @RequestMapping(value = "/_create", method = RequestMethod.POST)
    public ApiResult<Object> query(@RequestBody OrderCreateInput input) {
        orderService.createOrder(input);
        return ApiResult.success();
    }


    @ResponseBody
    @RequestMapping(value = "/_update", method = RequestMethod.POST)
    public ApiResult<Object> update(@RequestBody OrderUpdateInput input) {
        orderService.updateOrder(input);
        return ApiResult.success();
    }


}
