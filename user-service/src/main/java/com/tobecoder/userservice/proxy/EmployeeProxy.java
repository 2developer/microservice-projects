package com.tobecoder.userservice.proxy;

import com.tobecoder.userservice.response.EmployeeResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "employee-service")
public interface EmployeeProxy {
    @GetMapping("/employee/{id}")
    public EmployeeResponse findEmployeeById(@PathVariable("id") Long id);
}
