package com.tobecoder.userservice.controller;

import com.tobecoder.userservice.proxy.EmployeeProxy;
import com.tobecoder.userservice.response.EmployeeResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    private final EmployeeProxy employeeProxy;

    public UserController(EmployeeProxy employeeProxy) {
        this.employeeProxy = employeeProxy;
    }

    @GetMapping("/employee/{id}")
    public EmployeeResponse findEmployeeByIdFromUserService(@PathVariable("id") Long id) {
        return employeeProxy.findEmployeeById(id);
    }

}
