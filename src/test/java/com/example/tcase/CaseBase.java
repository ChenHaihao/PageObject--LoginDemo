package com.example.tcase;

import com.example.base.DriverBase;

/**
 * @author �ض�
 * @date 2022/1/16 14:44
 * @project_name    ����driver���� ���е�case�����������
 */
public class CaseBase {

    /**
     * ��ʼ��driver
     * */
    public DriverBase initDriver(String browers){
        DriverBase driver = new DriverBase(browers);
        return driver;
    }

}
