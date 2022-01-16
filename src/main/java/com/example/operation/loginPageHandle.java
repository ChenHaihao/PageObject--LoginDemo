package com.example.operation;

/**
 * @author 池恩
 * @date 2022/1/16 14:38
 * @project_name
 */


import com.example.base.DriverBase;
import com.example.element.loginPage;

/**
 * 封装登录页面的操作 操作loginPage下的方法
 * */
public class loginPageHandle {
    private DriverBase driver;
    private loginPage loginpage;

    /**
     * 构造方法
     * */
    public loginPageHandle(DriverBase driver){
        this.driver = driver;
        //loginpage放在这里的目的是使用driver,保证driver的一致性
        loginpage = new loginPage(driver);
    }

    /**
     * 封装寻找登录框按钮的操作
     * */
    public void findLoginButtion(){
        loginpage.click(loginpage.findLoginButtion());
    }

    /**
     * 封装点击账号登录的方法
     * */
    public void countLogin(){
        loginpage.click(loginpage.checkCountLogin());;
    }

    /**
     * 封装登录框的操作
     * */
    public void userLogin(String username){
        loginpage.sendKeys(loginpage.loginBox(), username);
    }

    /**
     * 封装密码输入
     * */
    public void passwordLogin(String password){
        loginpage.sendKeys(loginpage.passwordElement(), password);
    }

    /**
     * 封装点击登录的操作
     * */
    public void loginAction(){
        loginpage.click(loginpage.loginButtion());
    }
}
