package com.example.yinma.mvcdemo;

import static com.example.yinma.mvcdemo.R.id.userId;

/**
 * Created by yinma on 8/28/2017.
 */

public class StudentModel {
    private int userId1;
    private String userName1;

    public StudentModel(String userName,int userId) {
        this.userId1 = userId;
        this.userName1 = userName;
    }

    public int getUserId() {
        return userId1;
    }

    public String getUserName() {
        return userName1;
    }

    public void setUserId1(int userId)
    {
        this.userId1 = userId;
    }
    public void setUserName(String userName)
    {
        this.userName1 = userName;
    }
}
