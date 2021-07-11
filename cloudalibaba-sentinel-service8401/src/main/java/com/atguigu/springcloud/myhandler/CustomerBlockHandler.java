package com.atguigu.springcloud.myhandler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.atguigu.springcloud.entities.CommonResult;

/**
 * @author yuluyang
 * @date 2021/7/11 下午2:43
 * @since 1.0.0-SNAPSHOT
 */
public class CustomerBlockHandler {

    public static CommonResult handlerException(BlockException exception) {
        return new CommonResult(4444, "客户自定义限流测试, global handlerException---1");
    }

    public static CommonResult handlerException2(BlockException exception) {
        return new CommonResult(4444, "客户自定义限流测试, global handlerException---2");
    }
}
