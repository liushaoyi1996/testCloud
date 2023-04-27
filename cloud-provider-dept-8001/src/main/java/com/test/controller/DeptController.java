package com.test.controller;

import com.test.entity.Dept;
import com.test.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DeptController {
    //为了测试随便加的注释
    @Autowired
    DeptService deptService;

    @RequestMapping(value = "/dept/add",method= RequestMethod.POST)
    public boolean add(@RequestBody Dept dept) {
        return deptService.add(dept);
    }

    @RequestMapping("/dept/get")
    public Dept get(Long id) {
        return deptService.get(id);
    }

    @RequestMapping("/dept/list")
    public List<Dept> list() {
        return deptService.list();
    }


}
