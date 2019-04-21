package com.tsien.mall.dao;

import com.tsien.mall.pojo.Shipping;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @author tsien
 * @version 1.0.0
 * @date 2019/1/31 0031 18:12
 */

public interface ShippingMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Shipping record);

    int insertSelective(Shipping record);

    Shipping selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Shipping record);

    int updateByPrimaryKey(Shipping record);

    /**
     * 根据用户ID和地址ID删除地址
     *
     * @param userId     用户ID
     * @param shippingId 地址ID
     * @return 删除的条数
     */
    int deleteByShippingIdUserId(@Param("userId") Integer userId, @Param("shippingId") Integer shippingId);

    /**
     * 更新
     *
     * @param record shipping记录
     * @return 更新的条数
     */
    int updateByShipping(Shipping record);

    /**
     * 查询地址信息
     *
     * @param userId     用户ID
     * @param shippingId 地址ID
     * @return 地址信息
     */
    Shipping selectByShippingIdUserId(@Param("userId") Integer userId, @Param("shippingId") Integer shippingId);

    /**
     * 查询地址
     *
     * @param userId 用户ID
     * @return shippingList
     */
    List<Shipping> selectByUserId(@Param("userId") Integer userId);
}