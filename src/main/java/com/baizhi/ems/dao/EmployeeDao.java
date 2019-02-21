package com.baizhi.ems.dao;
import com.baizhi.ems.entity.Employee;

import java.util.List;
public interface EmployeeDao{
	/**
	 * 获得Employee数据的总行数
	 * @return
	 */
    long getEmployeeRowCount();
	/**
	 * 获得Employee数据集合
	 * @return
	 */
    List<Employee> selectEmployee();
	/**
	 * 获得一个Employee对象,以参数Employee对象中不为空的属性作为条件进行查询
	 * @param obj
	 * @return
	 */
    Employee selectEmployeeByObj(Employee obj);
	/**
	 * 通过Employee的id获得Employee对象
	 * @param id
	 * @return
	 */
    Employee selectEmployeeById(Integer id);
	/**
	 * 插入Employee到数据库,包括null值
	 * @param value
	 * @return
	 */
    int insertEmployee(Employee value);
	/**
	 * 插入Employee中属性值不为null的数据到数据库
	 * @param value
	 * @return
	 */
    int insertNonEmptyEmployee(Employee value);
	/**
	 * 通过Employee的id删除Employee
	 * @param id
	 * @return
	 */
    int deleteEmployeeById(Integer id);
	/**
	 * 通过Employee的id更新Employee中的数据,包括null值
	 * @param enti
	 * @return
	 */
    int updateEmployeeById(Employee enti);
	/**
	 * 通过Employee的id更新Employee中属性不为null的数据
	 * @param enti
	 * @return
	 */
    int updateNonEmptyEmployeeById(Employee enti);
}