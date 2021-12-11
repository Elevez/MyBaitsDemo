package cn.edu.hzvtc.pojo;

public class Employee {
    private Integer id;
    private String empName;
    private String email;
    private String gender;

    //private Integer deptId;
    private Department department;

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Employee() {

    }

    public Employee(Integer id, String empName, String email, String gender) {
        this.id = id;
        this.empName = empName;
        this.email = email;
        this.gender = gender;
    }

    public Employee(Integer id, String empName, String email, String gender, Department department) {
        this.id = id;
        this.empName = empName;
        this.email = email;
        this.gender = gender;
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", empName='" + empName + '\'' +
                ", email='" + email + '\'' +
                ", gender='" + gender + '\'' +
                ", department=" + department +
                '}';
    }
}
