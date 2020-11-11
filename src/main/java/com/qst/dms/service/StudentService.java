package com.qst.dms.service;


import com.qst.dms.po.PageInfo;
import com.qst.dms.po.Student;

import java.util.List;

/**
 * 用户Service层接口
 */
public interface StudentService {

	//分页查询
    PageInfo<Student> findPageInfo(String s_name, Integer s_studentid, Integer s_classid,
                                   String s_classname, Integer pageIndex, Integer pageSize);

	int deleteStudent(Integer s_id);   //通过id删除学生信息
	int addStudent(Student student);   //添加学生信息
	int updateStudent(Student student); //修改学生信息
	Student findStudentById(Integer s_id);
	List<Student> getAll();

}
