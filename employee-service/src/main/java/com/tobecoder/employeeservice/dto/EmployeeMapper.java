package com.tobecoder.employeeservice.dto;

import com.tobecoder.employeeservice.entity.EmployeeEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface EmployeeMapper {
    EmployeeMapper MAPPER = Mappers.getMapper(EmployeeMapper.class);
    EmployeeResponse bindDataEntityToResponse(EmployeeEntity employeeEntity);
}
