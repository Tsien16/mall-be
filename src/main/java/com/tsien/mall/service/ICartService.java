package com.tsien.mall.service;

import com.tsien.mall.common.ServerResponse;
import com.tsien.mall.vo.CartVo;

/**
 * Created with IntelliJ IDEA.
 *
 * @author tsien
 * @version 1.0.0
 * @date 2019/4/21 0021 15:15
 */

public interface ICartService {

    /**
     * 查询购物车列表
     *
     * @param userId 用户ID
     * @return CartVo
     */
    ServerResponse<CartVo> list(Integer userId);

    /**
     * 购物车增加商品
     *
     * @param userId    用户ID
     * @param productId 产品ID
     * @param count     数量
     * @return CartVo
     */
    ServerResponse<CartVo> add(Integer userId, Integer productId, Integer count);

    /**
     * 更新购物车
     *
     * @param userId    用户ID
     * @param productId 产品ID
     * @param count     数量
     * @return CartVo
     */
    ServerResponse<CartVo> update(Integer userId, Integer productId, Integer count);

    /**
     * 删除产品
     *
     * @param userId     用户ID
     * @param productIds 产品ID列表
     * @return CartVo
     */
    ServerResponse<CartVo> deleteProduct(Integer userId, String productIds);

    /**
     * 全选或者全不选
     *
     * @param userId    用户ID
     * @param productId 产品ID
     * @param checked   选择还是不选
     * @return CartVo
     */
    ServerResponse<CartVo> selectOrUnSelect(Integer userId, Integer productId, Integer checked);

    /**
     * 查询用户购物车产品总数
     *
     * @param userId 用户ID
     * @return 总数
     */
    ServerResponse<Integer> getCartProductCount(Integer userId);
}
