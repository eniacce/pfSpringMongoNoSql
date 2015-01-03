package net.javabeat.primefaces.managedbeans;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import net.javabeat.springdata.beans.RegistrationService;
import net.javabeat.springdata.jpa.data.Employee;

@ManagedBean(name="registrationManagedBean")
@SessionScoped
public class RegistrationManagedBean {
	
	private Employee employee = new Employee();
        
        private Employee updateEmployee = new Employee();
        private  boolean isControl =false;
        
        
	
	private List<Employee> employees = new ArrayList<Employee>();
	
	@ManagedProperty(value="#{registrationService}")
	private RegistrationService service;
        
        
        
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
        
        
          public String register()
        {
            
           this.service.getRepository().save(employee);
           this.employee = new Employee();
           return "";
            
        }
	
	
        
        
      
        
        
     

    public Employee getUpdateEmployee() {
        return updateEmployee;
    }

    public void setUpdateEmployee(Employee updateEmployee) {
        this.updateEmployee = updateEmployee;
    }

    public boolean isIsControl() {
        return isControl;
    }

    public void setIsControl(boolean isControl) {
        this.isControl = isControl;
    }
    
    
    
    
       public void update(Employee emp)
        {
            this.updateEmployee = emp;
            System.out.println("Deneme:"+updateEmployee.getTelephoneNumber());
            System.out.println("Deneme:"+updateEmployee.getId().toString());
            
        }
       
       
       
       public void deleteRecord(Employee  emp)
       {
           this.service.getRepository().delete(emp);
           System.out.println("Kayit basari ile silindi");
       }
       
       
       
       public void updateRecord()
       {
       this.service.getRepository().save(updateEmployee);
           System.out.println("Basari ile guncellendi");
       
       }
       
      
        
        
        
        
       

   
        
        
        
        
}
