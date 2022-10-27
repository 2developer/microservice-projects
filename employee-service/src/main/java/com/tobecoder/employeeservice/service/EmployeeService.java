package com.tobecoder.employeeservice.service;

import com.tobecoder.employeeservice.dto.EmployeeRequest;
import com.tobecoder.employeeservice.dto.EmployeeResponse;

public interface EmployeeService {
    EmployeeResponse findEmployeeById(Long id);
    EmployeeResponse createEmployee(EmployeeRequest employeeRequest);
}
