package com.tsien.mall.service;

import com.github.pagehelper.PageInfo;
import com.tsien.mall.common.ServerResponse;
import com.tsien.mall.pojo.Product;
import com.tsien.mall.vo.ProductDetailVo;

/**
 * Created with IntelliJ IDEA.
 *
 * @author tsien
 * @version 1.0.0
 * @date 2019/3/16 0016 18:07
 */

public interface IProductService {
    /**
     * 保存或更新产品
     *
     * @param product product实例
     * @return 是否更新成功
     */
    ServerResponse saveOrUpdateProduct(Product product);

    /**
     * 设置产品上下架
     *
     * @param productId 产品ID
     * @param status    上下架状态
     * @return 是否更新成功
     */
    ServerResponse<String> setSaleStatus(Integer productId, Integer status);

    /**
     * 产品详情
     *
     * @param productId 产品ID
     * @return 是否更新成功
     */
    ServerResponse<ProductDetailVo> manageProductDetail(Integer productId);

    /**
     * 查询产品
     *
     * @param pageNum  页数
     * @param pageSize 每页的数
     * @return 分页信息
     */
    ServerResponse<PageInfo> getProductList(int pageNum, int pageSize);

    /**
     * @param productName 产品名称
     * @param productId   产品Id
     * @param pageNum     页数
     * @param pageSize    每页的数量
     * @return 分页信息
     */
    ServerResponse<PageInfo> searchProduct(String productName, Integer productId, int pageNum, int pageSize);
}
