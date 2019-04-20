package com.tsien.mall.service;

import com.tsien.mall.common.ServerResponse;
import com.tsien.mall.pojo.Category;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @author tsien
 * @version 1.0.0
 * @date 2019/2/13 0013 19:12
 */

public interface ICategoryService {

    /**
     * 添加品类
     *
     * @param categoryName 品类名称
     * @param parentId     上级品类ID
     * @return 添加是否成功的消息
     */
    ServerResponse addCategory(String categoryName, Integer parentId);

    /**
     * 更新品类名称
     *
     * @param categoryId   品类ID
     * @param categoryName 品类名称
     * @return 更新结果
     */
    ServerResponse updateCategoryName(Integer categoryId, String categoryName);

    /**
     * 查询所有子分类
     *
     * @param categoryId 品类ID
     * @return 结果
     */
    ServerResponse<List<Category>> getChildrenParallelCategory(Integer categoryId);

    /**
     * 递归查询节点ID
     *
     * @param categoryId 品类ID
     * @return ID集合
     */
    ServerResponse<List<Integer>> selectCategoryAndDeepChildrenCategoryById(Integer categoryId);
}
