package com.example.element;

import com.example.base.BasePage;
import com.example.base.DriverBase;
import org.openqa.selenium.WebElement;

/**
 * @author 池恩
 * @date 2022/1/16 14:36
 * @project_name
 */
public class loginPage extends BasePage {
    /**
     * 构造方法
     * */
    public loginPage(DriverBase driver) {
        super(driver);
    }

    /**
     * 获取登录按钮的element
     * super类BasePage有封装一个element方法 此处element可以直接使用
     * */
    public WebElement findLoginButtion(){
        //return super.element(ByMethon.bystr("userCountBox"));
        return element(ByMethon.bystr("userCountBox"));
    }

    /**
     * 获取"账号登录"的位置的element
     * */
    public WebElement checkCountLogin(){
        return element(ByMethon.bystr("countLogin"));
    }

    /**
     * 获取登录框的element
     * */
    public WebElement loginBox(){
        return element(ByMethon.bystr("loginUser"));
    }

    /**
     * 获取密码框的element
     * */
    public WebElement passwordElement(){
        return element(ByMethon.bystr("loginPassword"));
    }

    /**
     * 获取登录按钮的element
     * */
    public WebElement loginButtion(){
        return element(ByMethon.bystr("loginButtion"));
    }
}
