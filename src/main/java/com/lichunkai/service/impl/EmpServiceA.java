package com.lichunkai.service.impl;

import com.lichunkai.dao.EmpDao;
import com.lichunkai.dao.impl.EmpDaoA;
import com.lichunkai.pojo.Emp;
import com.lichunkai.service.EmpService;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Author：Lick
 * Date Created in 2023-04-07
 * Time：20:32
 */
public class EmpServiceA implements EmpService {
    private EmpDao empDao;
    @Override
    public List<Emp> listEmp() {
        List<Emp> empList = empDao.listEmp();
        // 对数据进行转换处理
        empList.stream().forEach(emp -> {
            String gender = emp.getGender();
            if ("1".equals(gender)){
                emp.setGender("男");
            }else if ("2".equals(gender)){
                emp.setGender("女");
            }
            String job = emp.getJob();
            if ("1".equals(job)){
                emp.setJob("讲师");
            }else if ("2".equals(job)){
                emp.setJob("班主任");
            }else if ("3".equals(job)){
                emp.setJob("就业指导");
            }
        });
        return empList;
    }
}
