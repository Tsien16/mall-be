package com.tsien.mall.service;

import com.github.pagehelper.PageInfo;
import com.tsien.mall.common.ServerResponse;
import com.tsien.mall.vo.OrderVo;

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
     * 创建订单
     *
     * @param userId     用户ID
     * @param shippingId 地址ID
     * @return 订单
     */
    ServerResponse createOrder(Integer userId, Integer shippingId);

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

    /**
     * 取消订单
     *
     * @param userId  用户ID
     * @param orderNo 订单号
     * @return 取消结果
     */
    ServerResponse<String> cancel(Integer userId, Long orderNo);

    /**
     * 查询产品
     *
     * @param userId 用户ID
     * @return 产品
     */
    ServerResponse getOrderCartProduct(Integer userId);

    /**
     * 查询订单详情
     *
     * @param userId  用户ID
     * @param orderNo 订单号
     * @return 查询订单详情
     */
    ServerResponse<OrderVo> getOrderDetail(Integer userId, Long orderNo);

    /**
     * 查询订单
     *
     * @param userId   userId
     * @param pageNum  pageNum
     * @param pageSize pageSize
     * @return 订单列表
     */
    ServerResponse<PageInfo> getOrderList(Integer userId, int pageNum, int pageSize);

    /**
     * 管理列表查询
     *
     * @param pageNum  pageNum
     * @param pageSize pageSize
     * @return 列表
     */
    ServerResponse<PageInfo> manageList(int pageNum, int pageSize);

    /**
     * 查询订单详情
     *
     * @param orderNo orderNo
     * @return 详情
     */
    ServerResponse<OrderVo> manageDetail(Long orderNo);

    /**
     * 搜索
     *
     * @param orderNo  orderNo
     * @param pageNum  pageNum
     * @param pageSize pageSize
     * @return 搜索
     */
    ServerResponse<PageInfo> manageSearch(Long orderNo, int pageNum, int pageSize);

    /**
     * 发货
     *
     * @param orderNo orderNo
     * @return 发货
     */
    ServerResponse<String> manageSendGoods(Long orderNo);
}
