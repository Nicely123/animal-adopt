package com.annsl.domain;

public class Admin {
    private Integer id;
    private String name;
    private String account;
    private String nickname;
    private String password;
    private String sex;     //默认为女
    private String birthday;
    private String email;
    private String telephone;
    private String pic;
    private String remark;

    public Admin() {
    }

    public Admin(Integer id, String name, String account, String nickname, String password, String sex, String birthday, String email, String telephone, String pic, String remark) {
        this.id = id;
        this.name = name;
        this.account = account;
        this.nickname = nickname;
        this.password = password;
        this.sex = sex;
        this.birthday = birthday;
        this.email = email;
        this.telephone = telephone;
        this.pic = pic;
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", account='" + account + '\'' +
                ", nickname='" + nickname + '\'' +
                ", password='" + password + '\'' +
                ", sex='" + sex + '\'' +
                ", birthday='" + birthday + '\'' +
                ", email='" + email + '\'' +
                ", telephone='" + telephone + '\'' +
                ", pic='" + pic + '\'' +
                ", remark='" + remark + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAccount() {
        return account;
    }

    public String getNickname() {
        return nickname;
    }

    public String getPassword() {
        return password;
    }

    public String getSex() {
        return sex;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getEmail() {
        return email;
    }

    public String getTelephone() {
        return telephone;
    }

    public String getPic() {
        return pic;
    }

    public String getRemark() {
        return remark;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
