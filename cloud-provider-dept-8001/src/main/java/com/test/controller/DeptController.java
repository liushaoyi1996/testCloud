package com.test.controller;

import com.test.entity.Dept;
import com.test.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DeptController {
    @Autowired
    DeptService deptService;

    @RequestMapping(value = "/dept/add",method= RequestMethod.POST)
    public boolean add(@RequestBody Dept dept) {
        return deptService.add(dept);
    }

    @RequestMapping(value = "/dept/get/{ID}",method= RequestMethod.GET)
    public Dept get(@PathVariable("id") Long id) {
        return deptService.get(id);
    }

    @RequestMapping(value = "/dept/list",method= RequestMethod.GET)
    public List<Dept> list(Dept dept) {
        System.out.println(dept);
        return deptService.list();
    }


}
