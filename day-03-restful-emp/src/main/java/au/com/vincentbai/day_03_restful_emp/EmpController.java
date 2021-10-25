package au.com.vincentbai.day_03_restful_emp;

import au.com.vincentbai.day_03_restful_emp.bean.Department;
import au.com.vincentbai.day_03_restful_emp.bean.Employee;
import au.com.vincentbai.day_03_restful_emp.dao.DepartmentDao;
import au.com.vincentbai.day_03_restful_emp.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Controller
public class EmpController {

    @Autowired
    private EmployeeDao employeeDao;

    @Autowired
    private DepartmentDao departmentDao;

    /**
     * 获取所有的员工信息
     * @param map
     * @return
     */
    @RequestMapping(value = "/emps", method = RequestMethod.GET)
    public String getAllEmps(Map<String, Object> map){

        Collection<Employee> emps = employeeDao.getAll();

        // 将数据放在request作用域中
        map.put("emps", emps);

        return "list";
    }


    /**
     * 跳转到添加页面
     * @return
     */
    @RequestMapping(value="/emp", method = RequestMethod.GET)
    public String toAdd(Map<String,Object> map){

        Collection<Department> departments = departmentDao.getDepartments();

        map.put("depts", departments);

        // 为 springMVC 的form标签做准备
        Map<String, String> genders = new HashMap<>();

        genders.put("0", "Female");
        genders.put("1", "Male");

        map.put("genders", genders);

        // form标签的自动回显功能，会在页面中默认获取request作用域中command属性的值并展示出来
        map.put("emp", new Employee());

        return "edit";
    }

    /**
     * 添加操作
     * @param emp
     * @return
     */
    @RequestMapping(value = "/emp", method = RequestMethod.POST)
    public String addEmp(Employee emp){

        employeeDao.save(emp);

        return "redirect:/emps";
    }

    /**
     * 获取要回显的数据，跳转到更新页面并回显
     * @return
     */
    @RequestMapping(value = "/emp/{empId}", method = RequestMethod.GET)
    public String toUpdate(@PathVariable("empId") Integer empId, Map<String, Object> map){

        Employee employee = employeeDao.get(empId);

        // 还要提供所有的部门信息，供用户选择
        Collection<Department> departments = departmentDao.getDepartments();

        map.put("emp", employee);

        map.put("depts", departments);

        return "update";
    }

    /**
     * 更新操作
     * @param emp
     * @return
     *
     */
    @RequestMapping(value ="/emp", method = RequestMethod.PUT)
    public String updateEmp(Employee emp){

        employeeDao.save(emp);

        return "redirect:/emps";

    }


}
