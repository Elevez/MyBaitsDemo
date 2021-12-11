package cn.edu.hzvtc.dao;

import cn.edu.hzvtc.pojo.Department;

import java.util.List;

public interface DepartmentMapper {
    Department selectDept(Integer id);
    List<Department> selectDepts(Integer id);
}
