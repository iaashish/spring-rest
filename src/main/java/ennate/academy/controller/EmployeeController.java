package ennate.academy.controller;

import ennate.academy.entity.Employee;
import ennate.academy.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.util.List;

//@Controller//same as component but it is of type component just to context based
//@ResponseBody//just put it in class it is available to every thing

@RestController//combination of controller and responsebody
@RequestMapping(value = "employees")//spring will take care of slashes
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @RequestMapping(method = RequestMethod.GET)
    public List<Employee> findAll() {
        return employeeService.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, value = "{id}")
    public Employee findById(@PathVariable String id) {
        return null;
    }

    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Employee create(@RequestBody Employee employee) {
        return employeeService.create(employee);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "{id}")
    public Employee update(@PathVariable String id, @RequestBody Employee employee) {
        return employee;
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "{id}")
    public void delete(@PathVariable String id) {

    }

}
