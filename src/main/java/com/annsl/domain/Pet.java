package com.annsl.domain;

public class Pet {
    private Integer id;
    private String name;
    private String type;
    private String sex;
    private String pic;
    private String age;
    private String remark;

    public Pet() {
    }

    public Pet(Integer id, String name, String type, String sex, String pic, String age, String remark) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.sex = sex;
        this.pic = pic;
        this.age = age;
        this.remark = remark;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", sex='" + sex + '\'' +
                ", pic='" + pic + '\'' +
                ", age='" + age + '\'' +
                ", remark='" + remark + '\'' +
                '}';
    }
}
