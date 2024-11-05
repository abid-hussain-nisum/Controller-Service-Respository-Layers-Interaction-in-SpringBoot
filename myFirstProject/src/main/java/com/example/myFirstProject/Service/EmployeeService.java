package com.example.myFirstProject.Service;

import com.example.myFirstProject.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;
    public String getEmployee(Integer id)
    {
        String employee = employeeRepository.getEmployee(id);
        return employee;
    }
}
