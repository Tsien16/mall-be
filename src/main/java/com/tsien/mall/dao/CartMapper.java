package com.tsien.mall.dao;

import com.tsien.mall.pojo.Cart;

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
}