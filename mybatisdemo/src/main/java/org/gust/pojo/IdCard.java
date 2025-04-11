package org.gust.pojo;


public class IdCard {
	private Integer id;                 // 主键id
	private String code;              // 身份证号码
	// 省略getter/setter方法
	@Override
	public String toString() {
		return "IdCard [id=" + id + ", code=" + code + "]";
	}
}
