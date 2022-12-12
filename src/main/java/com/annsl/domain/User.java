package com.annsl.domain;

public class User {
    private Integer id;
    private String name;
    private String account;
    private String password;
    private String nickname;
    private String sex;
    private String age;
    private String telephone;
    private String email;
    private String park;
    private String pic;
    private String state;

    public User() {
    }

    public User(Integer id, String name, String account, String password, String nickname, String sex, String age, String telephone, String email, String park, String pic, String state) {
        this.id = id;
        this.name = name;
        this.account = account;
        this.password = password;
        this.nickname = nickname;
        this.sex = sex;
        this.age = age;
        this.telephone = telephone;
        this.email = email;
        this.park = park;
        this.pic = pic;
        this.state = state;
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

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPark() {
        return park;
    }

    public void setPark(String park) {
        this.park = park;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", account='" + account + '\'' +
                ", password='" + password + '\'' +
                ", nickname='" + nickname + '\'' +
                ", sex='" + sex + '\'' +
                ", age='" + age + '\'' +
                ", telephone='" + telephone + '\'' +
                ", email='" + email + '\'' +
                ", park='" + park + '\'' +
                ", pic='" + pic + '\'' +
                ", state='" + state + '\'' +
                '}';
    }
}
