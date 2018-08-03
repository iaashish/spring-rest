package ennate.academy.exception;

import ennate.academy.entity.Employee;

public class EmployeeNotFoundException extends RuntimeException {

    public EmployeeNotFoundException(String message){
        super(message);
    }
}
