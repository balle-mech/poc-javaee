package backingbeans;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import beans.Emp;
import dao.EmpDao;

@Named
@RequestScoped
public class EmpBean {
	private EmpDao empDao = new EmpDao();
	private Emp emp = new Emp();

	// Getters and Setters
	public Emp getEmployee() {
		return emp;
	}

	public void setEmployee(Emp emp) {
		this.emp = emp;
	}

	// Action method for adding an employee
	public String addEmployee() {
		System.out.println("Registering employee: " + emp.getName() + ", " + emp.getEmail());
		empDao.addEmployee(emp);
		return "result"; // Resultページへリダイレクト
	}

	// その他のCRUD操作も追加可能 (例: updateEmployee, deleteEmployee)
}
