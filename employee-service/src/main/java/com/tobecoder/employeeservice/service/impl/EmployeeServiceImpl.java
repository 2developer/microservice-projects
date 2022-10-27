package com.tobecoder.employeeservice.service.impl;

import com.tobecoder.employeeservice.dto.EmployeeMapper;
import com.tobecoder.employeeservice.dto.EmployeeRequest;
import com.tobecoder.employeeservice.dto.EmployeeResponse;
import com.tobecoder.employeeservice.entity.EmployeeEntity;
import com.tobecoder.employeeservice.repository.EmployeeRepository;
import com.tobecoder.employeeservice.service.EmployeeService;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public EmployeeResponse findEmployeeById(Long id) {
        EmployeeEntity employeeEntity = employeeRepository.getById(id);
        return EmployeeMapper.MAPPER.bindDataEntityToResponse(employeeEntity);
    }

    @Override
    public EmployeeResponse createEmployee(EmployeeRequest employeeRequest) {

        EmployeeEntity employeeEntity = new EmployeeEntity();
        employeeEntity.setName(employeeRequest.getName());
        employeeEntity.setGender(employeeRequest.getGender());
        employeeEntity.setEmail(employeeRequest.getEmail());
        employeeRepository.save(employeeEntity);

        return EmployeeMapper.MAPPER.bindDataEntityToResponse(employeeEntity);
    }
}
