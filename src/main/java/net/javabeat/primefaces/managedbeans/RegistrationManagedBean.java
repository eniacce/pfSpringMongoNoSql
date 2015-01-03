package net.javabeat.primefaces.managedbeans;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import net.javabeat.springdata.beans.RegistrationService;
import net.javabeat.springdata.jpa.data.Employee;

/*
 @author mesuta
 @since 2.1.2015
 @param employee  create a new user
 @param updateEmployee for update employee
 @param employees for list all them
 @param service for db connection layer

 */
@ManagedBean(name = "registrationManagedBean")
@SessionScoped
public class RegistrationManagedBean {

    private Employee employee = new Employee();

    private Employee updateEmployee = new Employee();

    private List<Employee> employees = new ArrayList<Employee>();

    @ManagedProperty(value = "#{registrationService}")
    private RegistrationService service;

    //New employee register from UI 
    public String register() {

        this.service.getRepository().save(employee);
        this.employee = new Employee();
        return "";

    }

    public void update(Employee emp) {
        this.updateEmployee = emp;
        System.out.println("Deneme:" + updateEmployee.getTelephoneNumber());
        System.out.println("Deneme:" + updateEmployee.getId().toString());

    }

    public void deleteRecord(Employee emp) {
        this.service.getRepository().delete(emp);
        System.out.println("Kayit basari ile silindi");
    }

    public void updateRecord() {
        this.service.getRepository().save(updateEmployee);
        System.out.println("Basari ile guncellendi");

    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public List<Employee> getEmployees() {
        this.employees = Lists.newArrayList(this.service.getRepository().findAll());
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public RegistrationService getService() {
        return service;
    }

    public void setService(RegistrationService service) {
        this.service = service;
    }

    public Employee getUpdateEmployee() {
        return updateEmployee;
    }

    public void setUpdateEmployee(Employee updateEmployee) {
        this.updateEmployee = updateEmployee;
    }

}
