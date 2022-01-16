package com.example.business;

import com.example.base.DriverBase;
import com.example.operation.loginPageHandle;

/**
 * @author 池恩
 * @date 2022/1/16 14:39
 * @project_name
 */

public class loginBuss {
    private loginPageHandle loginPgeHandle;

    /**
     * 构造方法 实例化loginPageHandle
     * */
    public loginBuss(DriverBase driver){
        loginPgeHandle = new loginPageHandle(driver);
    }

    /**
     * 执行操作业务
     * */
    public void bussLogin(String username,String password){
        loginPgeHandle.findLoginButtion();
        loginPgeHandle.countLogin();
        loginPgeHandle.userLogin(username);
        loginPgeHandle.passwordLogin(password);
        loginPgeHandle.loginAction();
    }
}
