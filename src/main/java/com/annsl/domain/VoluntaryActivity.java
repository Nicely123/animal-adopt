package com.annsl.domain;

public class VoluntaryActivity {
    private Integer id;
    private String adminId;
    private String createTime;
    private String beginTime;
    private String endTime;
    private String content;

    public VoluntaryActivity() {
    }

    public VoluntaryActivity(Integer id, String adminId, String createTime, String beginTime, String endTime, String content) {
        this.id = id;
        this.adminId = adminId;
        this.createTime = createTime;
        this.beginTime = beginTime;
        this.endTime = endTime;
        this.content = content;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAdminId() {
        return adminId;
    }

    public void setAdminId(String adminId) {
        this.adminId = adminId;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(String beginTime) {
        this.beginTime = beginTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "VoluntaryActivity{" +
                "id=" + id +
                ", adminId='" + adminId + '\'' +
                ", createTime='" + createTime + '\'' +
                ", beginTime='" + beginTime + '\'' +
                ", endTime='" + endTime + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
