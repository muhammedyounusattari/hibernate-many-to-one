package younus.attari;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee {

	@Id
	@GeneratedValue
	private Long id;

	private String empProject, empReporting, empDesig;
	
//	@OneToMany(cascade=CascadeType.ALL)
	//private Collection<Address> address = new ArrayList<>();

	@OneToMany(mappedBy="emp",cascade=CascadeType.ALL)
	private Collection<Address> address = new ArrayList<Address>();
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmpProject() {
		return empProject;
	}

	public void setEmpProject(String empProject) {
		this.empProject = empProject;
	}

	public String getEmpReporting() {
		return empReporting;
	}

	public void setEmpReporting(String empReporting) {
		this.empReporting = empReporting;
	}

	public String getEmpDesig() {
		return empDesig;
	}

	public void setEmpDesig(String empDesig) {
		this.empDesig = empDesig;
	}

	public Collection<Address> getAddress() {
		return address;
	}

	public void setAddress(Collection<Address> address) {
		this.address = address;
	}

}
