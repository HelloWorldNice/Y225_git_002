package cn.bdqn;

import java.util.Date;

public class User {

    private Integer id;

    private String name;

    private Integer age;

    private Double weight;

    private Date birthday;

    public User(Date birthday) {
        this.birthday = birthday;
    }

    public User(Integer id, String name, Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public User(Integer id, String name, Double weight) {
        this.id = id;
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", birthday=" + birthday +
                '}';
    }
}
