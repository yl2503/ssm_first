package com.yl.demo.controller;

import com.yl.demo.bean.Employee;
import com.yl.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

@Controller
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @RequestMapping("/emps")
    public String getAllEmp(Map<String, Object> map){
        List<Employee> emps = employeeService.getAllEmp();
        map.put("emps", emps);
        return "emp-list";
    }
}
