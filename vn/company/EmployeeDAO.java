package vn.company;

import java.sql.SQLException;

//define all the function
public interface EmployeeDAO {
//    return one employee
    public Employee getEmployeeById(String Id) throws SQLException;
//    return 1 list of employee
//    public ArrayList<Employee> getAllEmployee();
    public Employee getAllEmployee() throws SQLException;
    public Employee addEmployee(Employee e) throws SQLException;
    public Employee deleteEmployee(String Id) throws SQLException;
    public Employee updateEmployee(String Id, String name) throws SQLException;
}

