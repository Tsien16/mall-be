package com.tsien.mall.dao;

import com.tsien.mall.pojo.Category;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @author tsien
 * @version 1.0.0
 * @date 2019/1/31 0031 18:12
 */

public interface CategoryMapper {

    /**
     * 根据主键删除数据
     *
     * @param id 品类ID
     * @return 删除数据量
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * 插入品类
     *
     * @param record 品类实体
     * @return 插入的数据量
     */
    int insert(Category record);

    /**
     * 有选择性的插入数据
     *
     * @param record 品类实体
     * @return 插入的数据量
     */
    int insertSelective(Category record);

    /**
     * 根据主键进行查询
     *
     * @param id 品类ID
     * @return 用户品类
     */
    Category selectByPrimaryKey(Integer id);

    /**
     * 根据主键有选择性的更新品类
     *
     * @param record 品类实体
     * @return 更新的条数据
     */
    int updateByPrimaryKeySelective(Category record);

    /**
     * 根据主键更新数据
     *
     * @param record 品类实体
     * @return 更新的条数
     */
    int updateByPrimaryKey(Category record);

    /**
     * 递归查询
     *
     * @param parentId 父级品类ID
     * @return 品类列表
     */
    List<Category> selectCategoryChildrenByParentId(Integer parentId);
}