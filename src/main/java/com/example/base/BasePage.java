package com.example.base;

/**
 * @author 池恩
 * @date 2022/1/16 14:32
 * @project_name
 */

/**
 * Setup1：Base内的封装
 * */


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * PageObject第三步：BasePage的封装
 *
 * */

public class BasePage {
    private DriverBase driver;

    /**
     * 构造方法
     * */
    public BasePage(DriverBase driver){
        this.driver = driver;
    }

    /**
     * 封装Element
     * */
    public WebElement element(By by){

        return driver.element(by);
    }

    /**
     * 封装click操作
     * */
    public void click(WebElement element){
        //判断element是否为空 null和非null的处理方式
        if(element != null){
            element.click();
        }else{
            System.out.println("你要点击的元素不存在");
        }
    }

    /**
     * 封装SendKeys操作
     * */
    public void sendKeys(WebElement element,String context){
        //判断element是否为空 null和非null的处理方式
        if(element != null){
            element.clear();
            element.sendKeys(context);
        }else{
            System.out.println("你要输入的元素不存在 输入内容失败");
        }
    }


}
