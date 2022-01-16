package com.example.utils;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Properties;

/**
 * @author 池恩
 * @date 2022/1/16 14:34
 * @project_name
 */
public class ReadProperties {
    private String filePath = "LoginElement.properties";
    private Properties properties;

    /**
     * 构造方法 创建对象时自动返回pro对象  在new该对象的时候会自动加载readProperties()方法
     * */
    public ReadProperties(String filePath){
        this.filePath = filePath;
        //在new该对象的时候会自动加载readProperties()方法
        this.properties = readProperties();
    }

    /**
     * 返回已经加载properties文件的pro对象
     * */
    public Properties readProperties(){
        //创建对象
        Properties pro = new Properties();
        //读取properties文件到缓存
        try {
            BufferedInputStream in = new BufferedInputStream(new FileInputStream(filePath));
            //加载缓存到pro对象 prop.load(in)这么写 不能读取properties配置文件中的中文
            pro.load(new InputStreamReader(in, "utf-8"));
        } catch (Exception e) {
            e.printStackTrace();
        }

        //返回pro对象
        return pro;
    }

    /**
     * 使用全局的properties对象获取key对应的value值
     * @return
     * */
    public String getValue(String key){

        return properties.getProperty(key);
    }
}
