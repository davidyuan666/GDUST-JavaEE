package org.gust.mapper;

import org.gust.pojo.Product;

public interface ProductMapper {
    // 根据id查询商品信息
    Product findProductById(Integer id);
}
