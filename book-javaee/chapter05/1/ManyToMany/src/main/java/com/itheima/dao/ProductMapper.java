package com.itheima.dao;

import com.itheima.pojo.Product;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Auther:bingli
 * ClassName:ProductMapper
 * Package:com.itheima.dao
 * Description:
 *
 * @date:2023/3/14-03-14 5:36
 * @author:2550976002@qq.com
 * @version:1.0
 */
public interface ProductMapper {

    @Select("select * from tb_product where id in (select product_id from tb_ordersitem where orders_id = #{id} )")
    List<Product> selectProductByOrdersId(int orders_id);

}
