package com.lichunkai.controller;

import com.lichunkai.pojo.Emp;
import com.lichunkai.pojo.Result;
import com.lichunkai.service.EmpService;
import com.lichunkai.service.impl.EmpServiceA;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Author：Lick
 * Date Created in 2023-04-07
 * Time：20:10
 */
@RestController
public class EmpController {
    private EmpService empService ;

    @RequestMapping("/listEmp")
    public Result list() {
        List<Emp> empList = empService.listEmp();

        // 响应数据
        return Result.success(empList);
    }
}
