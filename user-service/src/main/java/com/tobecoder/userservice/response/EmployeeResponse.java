package com.tobecoder.userservice.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeResponse implements Serializable {
    private Long id;
    private String name;
    private String gender;
    private String email;
}
