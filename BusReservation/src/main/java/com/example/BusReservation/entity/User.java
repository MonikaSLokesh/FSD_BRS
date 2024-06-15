package com.example.BusReservation.entity;

import jakarta.persistence.*;



@Entity
@Table(name = "User")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    @Column
    private String userName;

    @Column
    private String userMail;

    @Column
    private String userPwd;

    @Column
    private String userPayMode;

    public User() {
    }

    public User(Long userId, String userName, String userMail) {
        this.userId = userId;
        this.userName = userName;
        this.userMail = userMail;
    }

    public User(Long userId, String userPwd) {
        this.userId = userId;
        this.userPwd = userPwd;
    }




    public User(Long userId, String userName, String userMail, String userPwd, String userPayMode) {
        this.userId = userId;
        this.userName = userName;
        this.userMail = userMail;
        this.userPwd = userPwd;
        this.userPayMode = userPayMode;
    }

    public User(Long userId) {
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
