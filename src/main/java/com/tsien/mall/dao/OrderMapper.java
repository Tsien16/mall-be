package com.tsien.mall.dao;

import com.tsien.mall.pojo.Order;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @author tsien
 * @version 1.0.0
 * @date 2019/1/31 0031 18:12
 */

public interface OrderMapper {

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
    int insert(Order record);

    /**
     * 有选择的插入数据
     *
     * @param record 实体
     * @return 插入的数据量
     */
    int insertSelective(Order record);

    /**
     * 根据主键查询
     *
     * @param id 主键
     * @return 实体
     */
    Order selectByPrimaryKey(Integer id);

    /**
     * 有选择的更新
     *
     * @param record 实体
     * @return 更新的条数
     */
    int updateByPrimaryKeySelective(Order record);

    /**
     * 根据主键更新
     *
     * @param record 实体
     * @return 更新的条数
     */
    int updateByPrimaryKey(Order record);

    /**
     * 根据用户ID和订单ID查询
     *
     * @param userId  用户ID
     * @param orderNo 订单号
     * @return 订单实体
     */
    Order selectByUserIdAndOrderNo(@Param("userId") Integer userId, @Param("orderNo") Long orderNo);

    /**
     * 根据订单号查询订单
     *
     * @param orderNo 订单号
     * @return 订单
     */
    Order selectByOrderNo(Long orderNo);

    /**
     * 通过用户ID查询订单
     *
     * @param userId 用户ID
     * @return orderList
     */
    List<Order> selectByUserId(Integer userId);


    /**
     * 查询所有订单
     *
     * @return orderList
     */
    List<Order> selectAllOrder();


}