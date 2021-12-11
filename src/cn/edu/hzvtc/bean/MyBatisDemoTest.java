package cn.edu.hzvtc.bean;

import cn.edu.hzvtc.dao.DepartmentMapper;
import cn.edu.hzvtc.dao.EmployeeDynamicSQLMapper;
import cn.edu.hzvtc.dao.EmployeeMapper;
import cn.edu.hzvtc.pojo.Department;
import cn.edu.hzvtc.pojo.Employee;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyBatisDemoTest {
    SqlSessionFactory sqlSessionFactory;

    @Before
    public void init() throws Exception{
        //1.从MyBatis配置XML文件中构建SqlSessionFactory
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    }

    @Test
    public void test5() throws Exception{
        try (SqlSession session = sqlSessionFactory.openSession()) {
            EmployeeDynamicSQLMapper mapper = session.getMapper(EmployeeDynamicSQLMapper.class);
            List<Employee> employees = new ArrayList<>();
            employees.add(new Employee(null,"Eric","Eric@qq.com","F",new Department(1)));
            employees.add(new Employee(null,"Rock","Rock@qq.com","M",new Department(2)));
            mapper.addEmps(employees);
            session.commit();
        }
    }


//    @Test
//    public void test4() throws Exception{
//        try (SqlSession session = sqlSessionFactory.openSession()) {
//            EmployeeDynamicSQLMapper mapper = session.getMapper(EmployeeDynamicSQLMapper.class);
//            List<Integer> ids = new ArrayList<>();
//            System.out.println(mapper.selectEmpByIdList(ids));
//        }
//    }

//    @Test
//    public void test3() throws Exception{
//        try (SqlSession session = sqlSessionFactory.openSession()) {
//            EmployeeDynamicSQLMapper mapper = session.getMapper(EmployeeDynamicSQLMapper.class);
//            Employee employee = new Employee(5,"tom",null,null);
//            System.out.println(mapper.updateEmp(employee));
//            //手动提交
//            session.commit();
//        }
//    }

    @Test
    public void test2() throws Exception{
        try (SqlSession session = sqlSessionFactory.openSession()) {
            DepartmentMapper mapper = session.getMapper(DepartmentMapper.class);
//            EmployeeMapper mapper = session.getMapper(EmployeeMapper.class);
            System.out.println(mapper.selectDepts(1));

        }
    }

    /**
     * 数据修改
     * 对于数据的增删改的操作，需要进行数据的提交或者回滚：手动提交或自动提交
     */
//    @Test
//    public void testUpdate() throws Exception{
//        //2.从SqlSessionFactory中获取SqlSession
//        try (SqlSession session = sqlSessionFactory.openSession()) {
//            EmployeeMapper mapper = session.getMapper(EmployeeMapper.class);
//            Employee employee = new Employee(4,"rose","rose@qq.com","F");
//            mapper.updateEmp(employee);
//            //手动提交
//            session.commit();
//        }
//    }

    /**
     * 数据删除
     * 对于数据的增删改的操作，需要进行数据的提交或者回滚：手动提交或自动提交
     */
//    @Test
//    public void testDelete() throws Exception{
//        //2.从SqlSessionFactory中获取SqlSession
//        try (SqlSession session = sqlSessionFactory.openSession()) {
//            EmployeeMapper mapper = session.getMapper(EmployeeMapper.class);
//            Employee employee = new Employee(null,"tom","tom@qq.com","M");
//            mapper.deleteEmp(5);
//            //手动提交
//            session.commit();
//        }
//    }

    /**
     * 数据添加
     * 对于数据的增删改的操作，需要进行数据的提交或者回滚：手动提交或自动提交
     */
//    @Test
//    public void testInsert() throws Exception{
//        //2.从SqlSessionFactory中获取SqlSession
//        try (SqlSession session = sqlSessionFactory.openSession()) {
//            EmployeeMapper mapper = session.getMapper(EmployeeMapper.class);
//            //新员工
//            Employee employee = new Employee(null,"tom","tom@qq.com","M");
//            mapper.insertEmp(employee);
//            System.out.println(employee.getId());
//            //手动提交
//            session.commit();
//        }
//    }

    /**
     * 数据查询
     * 若查询结果为单个数据或单个对象,resultType描述返回值类型
     * 若查询结果为集合,resultType描述为集合元素的类型
     * 若查询结果为map,通过@MapKey指定的key值的来源,resultType描述为value部分的类型
     */
//    @Test
//    public void testSelect() throws Exception{
//        //2.从SqlSessionFactory中获取SqlSession
//        try (SqlSession session = sqlSessionFactory.openSession()) {
//            EmployeeMapper mapper = session.getMapper(EmployeeMapper.class);
//            //单值传参查询
////            Employee employee = mapper.selectEmp(4);
//            //多值传参查询
////            Employee employee = mapper.selectEmpByIdAndName(4,"rose");
////            Map<String,Object> map = new HashMap<>();
////            map.put("id",4);
////            map.put("name","rose");
////            Employee employee = mapper.selectEmpMap(map);
////            System.out.println(employee);
//            //集合查询
////            System.out.println(mapper.selectEmps());
////            System.out.println(mapper.selectEmpsAsMap());
//            System.out.println(mapper.getEmpAndDept(5));
//        }
//    }

//    @Test
//    public void test() throws Exception{
//        //1.从MyBatis配置XML文件中构建SqlSessionFactory
//        String resource = "mybatis-config.xml";
//        InputStream inputStream = Resources.getResourceAsStream(resource);
//        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
//
//        //2.从SqlSessionFactory中获取SqlSession
//        try (SqlSession session = sqlSessionFactory.openSession()) {
//            Employee employee = session.selectOne("cn.edu.hzvtc.EmployeeMapper.selectEmp", 1);
//            System.out.println(employee);
//        }
//    }
}
