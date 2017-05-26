package demo;

import java.util.ArrayList;
import java.util.List;
 
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

import demo.model.Employee;

@CrossOrigin(origins = "http://localhost", maxAge = 3600) 
@RestController
public class EmployeeController 
{
    @RequestMapping("/")
    public List<Employee> getEmployees() 
    {
        List<Employee> employeesList = new ArrayList<Employee>();
        employeesList.add(new Employee(1,"lokesh","gupta","howtodoinjava@gmail.com"));
        return employeesList;
    }
}
