package springboot.training.resourceserver.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import springboot.training.resourceserver.model.Employee;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value="/secureapi/v1/", produces= MediaType.APPLICATION_JSON_VALUE)
public class EmployeeController {

    @GetMapping("/user/getEmployeesList")
    @ResponseBody
    public List<Employee> getEmployeeList(){
        List<Employee> employees = new ArrayList<>();
        Employee emp = new Employee();
        emp.setEmpId("emp1");
        emp.setEmpName("Cesar");

        Employee emp2 = new Employee();
        emp2.setEmpId("emp2");
        emp2.setEmpName("Garret");
        employees.add(emp);
        employees.add(emp2);
        return employees;
    }

}
