package com.itheima.pojo.com.itheima.pojo;

/**
 * Auther:bingli
 * ClassName:IdCard
 * Package:com.itheima.pojo
 * Description:
 *
 * @date:2023/3/5-03-05 14:39
 * @author:2550976002@qq.com
 * @version:1.0
 */
public class IdCard {

    private Integer id;                 //主键id
    private String code;                //身份证号码

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "IdCard{" +
                "id=" + id +
                ", code='" + code + '\'' +
                '}';
    }
}
