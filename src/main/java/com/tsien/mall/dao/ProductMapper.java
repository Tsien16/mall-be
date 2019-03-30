package com.tsien.mall.dao;

import com.tsien.mall.pojo.Product;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @author tsien
 * @version 1.0.0
 * @date 2019/1/31 0031 18:12
 */

public interface ProductMapper {
    /**
     * 根据主键删除
     *
     * @param id 产品Id
     * @return 删除的数量
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * 插入
     *
     * @param record 实体
     * @return 插入的数据
     */
    int insert(Product record);

    int insertSelective(Product record);

    Product selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Product record);

    int updateByPrimaryKey(Product record);

    List<Product> selectList();

    /**
     * 查询产品
     *
     * @param productName 产品名称
     * @param productId   产品Id
     * @return 产品列表
     */
    List<Product> selectByNameAndProductId(@Param("productName") String productName,
                                           @Param("productId") Integer productId);
}