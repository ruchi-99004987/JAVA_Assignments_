package Activity_2;
//Q_4
public class Company {
	private String name;
	private String employees;
	private String teamlead;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmployees() {
		return employees;
	}
	public void setEmployees(String employees) {
		this.employees = employees;
	}
	public String getTeamlead() {
		return teamlead;
	}
	public void setTeamlead(String teamlead) {
		this.teamlead = teamlead;
	}
	@Override
	public String toString() {
		return "Company [name=" + name + ", employees=" + employees + ", teamlead=" + teamlead + "]";
	}
	
}
