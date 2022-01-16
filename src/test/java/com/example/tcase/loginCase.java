package com.example.tcase;

import com.example.base.DriverBase;
import com.example.business.loginBuss;
import com.example.utils.ReadProperties;
import org.junit.Test;

/**
 * @author 池恩
 * @date 2022/1/16 14:44
 * @project_name
 */
public class loginCase extends CaseBase{
    private DriverBase driver;
    private loginBuss loginBuss;

    /**
     * 构造方法初始化loginBuss
     * */
    public loginCase(){
        this.driver = initDriver("firefox");
        loginBuss = new loginBuss(driver);
    }

    @Test
    public void LoginTest() throws Exception{
        //读取配置文件
        ReadProperties readProperties = new ReadProperties("F:\\JavaPractice\\POLoginDemo\\src\\main\\resources\\application.properties");

        //这个driver来自于DriverBase  DriverBase类下封装了gerUrl方法
        String URL = readProperties.getValue("URL");
        driver.getUrl(URL);
        Thread.sleep(3000);
        //获取username 和 password
        String username = readProperties.getValue("LoginInfo").split(">")[0];
        String password = readProperties.getValue("LoginInfo").split(">")[1];

        loginBuss.bussLogin(username, password);
    }
}
