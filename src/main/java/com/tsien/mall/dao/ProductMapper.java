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

    /**
     * 有选择的插入数据
     *
     * @param record 实体
     * @return 插入的数据量
     */
    int insertSelective(Product record);

    /**
     * 根据主键查询
     *
     * @param id 主键
     * @return 实体
     */
    Product selectByPrimaryKey(Integer id);

    /**
     * 有选择的更新
     *
     * @param record 实体
     * @return 更新的条数
     */
    int updateByPrimaryKeySelective(Product record);

    /**
     * 根据主键更新
     *
     * @param record 实体
     * @return 更新的条数
     */
    int updateByPrimaryKey(Product record);

    /**
     * 查询全量产品
     *
     * @return productList
     */
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


    /**
     * 产品列表
     *
     * @param productName    产品名称
     * @param categoryIdList 类别列表
     * @return
     */
    List<Product> selectByNameAndCategoryIds(@Param("productName") String productName,
                                             @Param("categoryIdList") List<Integer> categoryIdList);
}