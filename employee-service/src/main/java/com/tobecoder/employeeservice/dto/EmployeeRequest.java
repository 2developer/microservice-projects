package com.tobecoder.employeeservice.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class EmployeeRequest implements Serializable {
    private String name;
    private String gender;
    private String email;
}
