package com.example.BusReservation.dto;

public class UserDto {

    private Long userId;
    private String userName;
    private String userMail;
    private String userPwd;
    private String userPayMode;

    public UserDto() {
    }

    public UserDto(Long userId, String userName, String userMail, String userPwd, String userPayMode) {
        this.userId = userId;
        this.userName = userName;
        this.userMail = userMail;
        this.userPwd = userPwd;
        this.userPayMode = userPayMode;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserMail() {
        return userMail;
    }

    public void setUserMail(String userMail) {
        this.userMail = userMail;
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }

    public String getUserPayMode() {
        return userPayMode;
    }

    public void setUserPayMode(String userPayMode) {
        this.userPayMode = userPayMode;
    }
}
