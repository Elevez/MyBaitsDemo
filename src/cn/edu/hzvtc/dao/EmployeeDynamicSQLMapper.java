package cn.edu.hzvtc.dao;

import cn.edu.hzvtc.pojo.Employee;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EmployeeDynamicSQLMapper {
    List<Employee> selectEmpByIdList(List<Integer> ids);
    List<Employee> selectEmpByCondition(Employee employee);
    Boolean updateEmp(Employee employee);
    void addEmps(@Param("emps") List<Employee> emps);
}
