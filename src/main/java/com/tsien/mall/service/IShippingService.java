package com.tsien.mall.service;

import com.github.pagehelper.PageInfo;
import com.tsien.mall.common.ServerResponse;
import com.tsien.mall.pojo.Shipping;

/**
 * Created with IntelliJ IDEA.
 *
 * @author tsien
 * @version 1.0.0
 * @date 2019/4/21 0021 21:15
 */

public interface IShippingService {

    /**
     * 增加地址
     *
     * @param userId   用户ID
     * @param shipping 地址
     * @return 信息
     */
    ServerResponse add(Integer userId, Shipping shipping);

    /**
     * 根据用户ID和地址ID删除地址
     *
     * @param userId     用户ID
     * @param shippingId 地址ID
     * @return 删除的结果
     */
    ServerResponse<String> del(Integer userId, Integer shippingId);

    /**
     * 更新用户地址
     *
     * @param userId   用户ID
     * @param shipping 地址
     * @return 更新是否成功
     */
    ServerResponse update(Integer userId, Shipping shipping);

    /**
     * 查询地址详细信息
     *
     * @param userId     用户ID
     * @param shippingId shippingId
     * @return 地址信息
     */
    ServerResponse<Shipping> select(Integer userId, Integer shippingId);

    /**
     * 查询地址
     *
     * @param userId   用户ID
     * @param pageNum  页数
     * @param pageSize 每页数量
     * @return PageInfo
     */
    ServerResponse<PageInfo> list(Integer userId, int pageNum, int pageSize);


}
