package com.tsien.mall.service;

import com.tsien.mall.common.ServerResponse;

import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 *
 * @author tsien
 * @version 1.0.0
 * @date 2019/5/1 0001 9:41
 */

public interface IOrderService {

    /**
     * 支付
     *
     * @param orderNo 订单号
     * @param userId  用户ID
     * @param path    路径
     * @return 支付结果
     */
    ServerResponse pay(Long orderNo, Integer userId, String path);

    /**
     * 支付宝回调
     *
     * @param params 支付宝传来的信息
     * @return 回调信息
     */
    ServerResponse aliCallback(Map<String, String> params);

    /**
     * 根据用户ID和订单号查询
     *
     * @param userId  用户ID
     * @param orderNo 订单号
     * @return 结果
     */
    ServerResponse queryOrderPayStatus(Integer userId, Long orderNo);
}
