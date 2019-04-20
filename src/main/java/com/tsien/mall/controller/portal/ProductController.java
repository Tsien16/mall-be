package com.tsien.mall.controller.portal;

import com.tsien.mall.common.ServerResponse;
import com.tsien.mall.service.IProductService;
import com.tsien.mall.vo.ProductDetailVo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 *
 * @author tsien
 * @version 1.0.0
 * @date 2019/3/31 0031 1:40
 */

@RestController
@RequestMapping("/product/")
public class ProductController {

    private final IProductService iProductService;


    public ProductController(IProductService iProductService) {
        this.iProductService = iProductService;
    }


    public ServerResponse<ProductDetailVo> detail(Integer productId) {
        return null;
    }
}
