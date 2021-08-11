package cn.xn.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

/**
 * @author XiaoNing
 * @date 2021/8/8
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderCreateInput {

    private String orderNo = UUID.randomUUID().toString();

    private String goodsName;

}
