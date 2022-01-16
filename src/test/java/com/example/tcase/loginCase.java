package com.example.tcase;

import com.example.base.DriverBase;
import com.example.business.loginBuss;
import com.example.utils.ReadProperties;
import org.junit.Test;

/**
 * @author �ض�
 * @date 2022/1/16 14:44
 * @project_name
 */
public class loginCase extends CaseBase{
    private DriverBase driver;
    private loginBuss loginBuss;

    /**
     * ���췽����ʼ��loginBuss
     * */
    public loginCase(){
        this.driver = initDriver("firefox");
        loginBuss = new loginBuss(driver);
    }

    @Test
    public void LoginTest() throws Exception{
        //��ȡ�����ļ�
        ReadProperties readProperties = new ReadProperties("F:\\JavaPractice\\POLoginDemo\\src\\main\\resources\\application.properties");

        //���driver������DriverBase  DriverBase���·�װ��gerUrl����
        String URL = readProperties.getValue("URL");
        driver.getUrl(URL);
        Thread.sleep(3000);
        //��ȡusername �� password
        String username = readProperties.getValue("LoginInfo").split(">")[0];
        String password = readProperties.getValue("LoginInfo").split(">")[1];

        loginBuss.bussLogin(username, password);
    }
}
