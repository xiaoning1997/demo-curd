package cn.xn.common.dto;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;

/**
 * 所有的rest接口统一使用这个对象返回结果，统一格式
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ApiResult<T> {

    private final static Integer SUCCESS = 0;

    private Integer code;
    private String message;
    private T data;

    public static <T> ApiResult<T> success(T data) {
        ApiResult<T> apiResult = new ApiResult<>();
        apiResult.setCode(SUCCESS);
        apiResult.setMessage("SUCCESS");
        apiResult.setData(data);
        return apiResult;
    }

    public static <T> ApiResult<T> success() {
        ApiResult<T> apiResult = new ApiResult<>();
        apiResult.setCode(SUCCESS);
        apiResult.setMessage("SUCCESS");
        return apiResult;
    }

    public static <T> ApiResult<T> failure(Integer code, String message) {
        ApiResult<T> apiResult = new ApiResult<>();
        apiResult.setCode(code);
        apiResult.setMessage(message);
        return apiResult;
    }

    public static <T> ApiResult<T> failure(Integer code, String message, T data) {
        ApiResult<T> apiResult = failure(code, message);
        apiResult.setData(data);
        return apiResult;
    }

    @JSONField(serialize = false)
    public boolean isSuccess() {
        return Objects.equals(code, SUCCESS);
    }

    public String toJson() {
        return JSON.toJSONString(this);
    }
}
