package ennate.academy.respository;

import ennate.academy.entity.Employee;

import java.util.List;

public interface EmployeeRepository {

    List<Employee> findAll();

    Employee findOne(String id);

    Employee create(Employee emp);
}
