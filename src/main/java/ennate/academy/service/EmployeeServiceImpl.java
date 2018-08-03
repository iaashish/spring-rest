package ennate.academy.service;

import ennate.academy.entity.Employee;
import ennate.academy.exception.EmployeeNotFoundException;
import ennate.academy.respository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    @Transactional(readOnly = true)
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee findOne(String id) {
        if (id == null) {
            throw new EmployeeNotFoundException("this person doesnt exist");
        } else {
            return null;
        }
    }

    @Transactional
    public Employee create(Employee emp) {
        return employeeRepository.create(emp);

    }

    @Transactional//helps in commit and override
    public Employee update(String id, Employee emp) {
        return null;
    }

    @Transactional
    public void delete(String id) {

    }
}
