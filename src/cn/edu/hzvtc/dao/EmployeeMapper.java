package cn.edu.hzvtc.dao;

import cn.edu.hzvtc.pojo.Employee;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface EmployeeMapper {
    Employee selectEmp(Integer id);
    Employee selectEmpByIdAndName(@Param("id") Integer id,@Param("name") String name);
    Employee selectEmpMap(Map<String,Object> map);
    Employee getEmpAndDept(Integer id);
    List<Employee> selectEmps();
    @MapKey("id")
    Map<Integer,Object> selectEmpsAsMap();
    void insertEmp(Employee employee);
    void deleteEmp(Integer id);
    Boolean updateEmp(Employee employee);
    List<Employee> getEmpsByDeptId(Integer id);
}
