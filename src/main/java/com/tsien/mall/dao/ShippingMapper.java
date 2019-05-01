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

    /**
     * 根据主键删除
     *
     * @param id 主键
     * @return 删除的条数
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * 插入数据
     *
     * @param record 实体
     * @return 插入的数据量
     */
    int insert(Shipping record);

    /**
     * 有选择的插入数据
     *
     * @param record 实体
     * @return 插入的数据量
     */
    int insertSelective(Shipping record);

    /**
     * 根据主键查询
     *
     * @param id 主键
     * @return 实体
     */
    Shipping selectByPrimaryKey(Integer id);

    /**
     * 有选择的更新
     *
     * @param record 实体
     * @return 更新的条数
     */
    int updateByPrimaryKeySelective(Shipping record);

    /**
     * 根据主键更新
     *
     * @param record 实体
     * @return 更新的条数
     */
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