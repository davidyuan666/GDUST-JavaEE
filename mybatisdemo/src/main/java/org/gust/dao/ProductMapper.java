package org.gust.dao;

import org.apache.ibatis.annotations.Select;
import java.util.List;
import org.gust.pojo.Product;

public interface ProductMapper {
    @Select("select * from products where id in (select product_id from ordersitem where orders_id = #{id})")
    List<Product> selectProductByOrdersId(int orders_id);
}