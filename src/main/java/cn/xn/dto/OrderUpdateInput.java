package cn.xn.dto;

import com.sun.istack.internal.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * @author XiaoNing
 * @date 2021/8/8
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderUpdateInput {

    @NotNull
    private Integer id;
    private String goodsName;
}
