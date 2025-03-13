package org.gust.pojo;

public class Person {
        private Integer id;             // 主键id
        private String name;         // 姓名
        private Integer age;          // 年龄
        private String sex;            // 性别
        private IdCard card;  	   // 人员关联的证件

        @Override
        public String toString() {
            return "Person [id=" + id + ", name=" + name + ", age=" + age + ", sex=" + sex + ", card=" + card + "]";
        }
}
