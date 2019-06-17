package com.tsien.mall.dao;

import com.tsien.mall.pojo.Cart;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @author tsien
 * @version 1.0.0
 * @date 2019/1/31 0031 18:12
 */

public interface CartMapper {

    /**
     * 通过组件删除
     *
     * @param id ID
     * @return ID
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * 插入记录
     *
     * @param record Cart对象
     * @return ID
     */
    int insert(Cart record);

    /**
     * 插入
     *
     * @param record record
     * @return int
     */
    int insertSelective(Cart record);

    /**
     * 查询Cart
     *
     * @param id ID
     * @return Cart
     */
    Cart selectByPrimaryKey(Integer id);

    /**
     * 更新
     *
     * @param record record
     * @return int
     */
    int updateByPrimaryKeySelective(Cart record);

    /**
     * 更新
     *
     * @param record record
     * @return int
     */
    int updateByPrimaryKey(Cart record);

    /**
     * 根据用户ID和产品ID，查询购物车
     *
     * @param userId    用户ID
     * @param productId 产品ID
     * @return 购物车
     */
    Cart selectCartByUserIdProductId(@Param("userId") Integer userId, @Param("productId") Integer productId);

    /**
     * 查询购物车
     *
     * @param userId 用户ID
     * @return 购物车列表
     */
    List<Cart> selectCartByUserId(Integer userId);

    /**
     * 检查是否有产品未勾选
     *
     * @param userId 用户ID
     * @return 未勾选的数量
     */
    int selectCartProductCheckedStatusByUserId(Integer userId);

    /**
     * 删除购物车
     *
     * @param userId        用户ID
     * @param productIdList 产品ID列表
     * @return 删除的数量
     */
    int deleteByUserIdProductIds(@Param("userId") Integer userId, @Param("productIdList") List<String> productIdList);

    /**
     * 设置全选或者全不选
     *
     * @param userId    用户ID
     * @param checked   全选还是全不选
     * @param productId 产品ID
     * @return 影响的行数
     */
    int checkedOrUncheckedProduct(@Param("userId") Integer userId,
                                  @Param("productId") Integer productId,
                                  @Param("checked") Integer checked);


    /**
     * 查询用户购物车产品总数
     *
     * @param userId 用户ID
     * @return 购物车产品数量
     */
    int selectCartProductCount(Integer userId);

    /**
     * 根据用户查询购物车
     *
     * @param userId 用户ID
     * @return cartList
     */
    List<Cart> selectCheckedCartByUserId(Integer userId);

}