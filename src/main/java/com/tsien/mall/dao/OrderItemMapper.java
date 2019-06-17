package com.tsien.mall.dao;

import com.tsien.mall.pojo.OrderItem;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @author tsien
 * @version 1.0.0
 * @date 2019/1/31 0031 18:12
 */

public interface OrderItemMapper {

    /**
     * 根据主键删除Order
     *
     * @param id OrderId
     * @return 删除的条数
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * 插入数据
     *
     * @param record Order实体
     * @return 插入的条数
     */
    int insert(OrderItem record);

    /**
     * 有选择的插入
     *
     * @param record Order实体
     * @return 插入的条数
     */
    int insertSelective(OrderItem record);

    /**
     * 根据主键查询
     *
     * @param id 主键
     * @return OrderItem
     */
    OrderItem selectByPrimaryKey(Integer id);

    /**
     * 有选择的更新
     *
     * @param record 实体
     * @return 更新的条数
     */
    int updateByPrimaryKeySelective(OrderItem record);

    /**
     * 根据主键更新
     *
     * @param record 实体
     * @return 更新的条数
     */
    int updateByPrimaryKey(OrderItem record);

    /**
     * 根据用户ID和工单ID查询OrderItem
     *
     * @param userId  用户ID
     * @param orderNo 工单ID
     * @return OrderItem
     */
    List<OrderItem> selectByOrderNoAndUserId(@Param("userId") Integer userId, @Param("orderNo") Long orderNo);

    /**
     * 查询订单详情
     *
     * @param orderNo 订单号
     * @return orderItemList
     */
    List<OrderItem> getByOrderNo(Long orderNo);

    /**
     * 批量插入订单
     *
     * @param orderItemList 订单列表
     */
    void batchInsert(@Param("orderItemList") List<OrderItem> orderItemList);
}