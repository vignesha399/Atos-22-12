package com.example.springbootdemo.Controllers;
/**
 * EmpController
 */

import java.util.*;
import com.example.springbootdemo.Models.Employee;
import com.example.springbootdemo.Response.Response;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/emp")
@RestController
public class EmpController {
    List<Employee> list = new ArrayList<>();
    // Add Employee
    @PostMapping("/insertEmp")
    public Response addEmp(@RequestBody Employee emp) {
        // If added successfully to the list
        if(list.add(emp)) {
            return new Response(200, "Successfully Inserted in List", emp);
        }
        // On Error
        return new Response(500, "Internal Server Error", null);
    }

    // Get All Employee
    @GetMapping("/GetAllEmp")
    public Response getAllEmp() {
        if(list.size() > 0) {
            return new Response(200, "Successfully Fetched Employees", list);
        }
        return new Response(200, "No Employee Present in the List", null);
    }

    
}
