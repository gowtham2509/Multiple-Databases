package com.md.base.controller;

import com.md.base.entity.primary.Employee;
import com.md.base.repository.emprepo.EmployeeRepository;
import com.md.base.entity.secondary.Manager;
import com.md.base.repository.manrepo.ManagerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {
    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private ManagerRepository managerRepository;

    @RequestMapping(value="/primary", method= RequestMethod.GET)
    public List<Employee> getPrimaryDatabaseData() {
        List<Employee> list = employeeRepository.findAll();
        return list;
    }

    @RequestMapping(value="/secondary", method=RequestMethod.GET)
    public List<Manager> getSecondaryDatabaseData() {
        List<Manager> list = managerRepository.findAll();
        return list;
    }
}
