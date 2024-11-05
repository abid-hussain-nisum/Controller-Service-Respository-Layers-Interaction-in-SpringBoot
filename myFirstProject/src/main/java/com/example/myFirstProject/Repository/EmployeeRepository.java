package com.example.myFirstProject.Repository;

import org.springframework.stereotype.Repository;

@Repository
public class EmployeeRepository {
    public String getEmployee(Integer id)
    {
        return "emp";
    }
}
