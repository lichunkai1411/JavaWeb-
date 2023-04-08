package com.lichunkai.dao.impl;

import com.lichunkai.dao.EmpDao;
import com.lichunkai.pojo.Emp;
import com.lichunkai.utils.XmlParserUtils;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Author：Lick
 * Date Created in 2023-04-07
 * Time：20:30
 */
public class EmpDaoA implements EmpDao {
    @Override
    public List<Emp> listEmp() {
        String file = this.getClass().getClassLoader().getResource("emp.xml").getFile();
        System.out.println(file);
        // 加载并解析emp.xml文件
        List<Emp> empList = XmlParserUtils.parse(file, Emp.class);
        return empList;
    }
}
