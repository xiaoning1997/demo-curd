package cn.xn.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * @author XiaoNing
 * @date 2021/8/8
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {

    private Integer id;

    private String orderNo;

    private String goodsName;

    private LocalDateTime createdTime;

}
