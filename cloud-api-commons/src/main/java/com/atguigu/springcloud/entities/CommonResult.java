package com.atguigu.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author yuluyang
 * @date 2021/5/31 上午12:08
 * @since 1.0.0-SNAPSHOT
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {
    private Integer code;
    private String mssage;
    private T data;

    public CommonResult(Integer code, String message) {
        this(code, message, null);
    }
}
