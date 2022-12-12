package com.annsl.domain;

public class TakeApartActivity {
    private Integer id;
    private String userId;
    private String activityId;
    private String applyTime;
    private String state;

    public TakeApartActivity() {
    }

    public TakeApartActivity(Integer id, String userId, String activityId, String applyTime, String state) {
        this.id = id;
        this.userId = userId;
        this.activityId = activityId;
        this.applyTime = applyTime;
        this.state = state;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getActivityId() {
        return activityId;
    }

    public void setActivityId(String activityId) {
        this.activityId = activityId;
    }

    public String getApplyTime() {
        return applyTime;
    }

    public void setApplyTime(String applyTime) {
        this.applyTime = applyTime;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "TakeApartActivity{" +
                "id=" + id +
                ", userId='" + userId + '\'' +
                ", activityId='" + activityId + '\'' +
                ", applyTime='" + applyTime + '\'' +
                ", state='" + state + '\'' +
                '}';
    }
}
