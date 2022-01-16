package com.example.tcase;

import com.example.base.DriverBase;

/**
 * @author 池恩
 * @date 2022/1/16 14:44
 * @project_name    生成driver对象 所有的case都集成这个类
 */
public class CaseBase {

    /**
     * 初始化driver
     * */
    public DriverBase initDriver(String browers){
        DriverBase driver = new DriverBase(browers);
        return driver;
    }

}
