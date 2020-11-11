package com.qst.dms.dao;


import com.qst.dms.po.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 管理员DAO层接口
 */
public interface StudentDao {
    /**
     * 进行分页查询
     */

    //获取总条数
    Integer totalCount(@Param("s_name") String s_name, @Param("s_studentid") Integer s_studentid,
                       @Param("s_classid") Integer s_classid, @Param("s_classname") String s_classname);

    //获取用户列表
    List<Student> getStudentList(@Param("s_name") String s_name, @Param("s_studentid") Integer s_studentid, @Param("s_classid") Integer s_classid,
                                 @Param("s_classname") String s_classname, @Param("currentPage") Integer currentPage, @Param("pageSize") Integer pageSize);

    int deleteStudent(Integer s_id);   //删除学生信息

    int addStudent(Student student);   //添加学生信息

    int updateStudent(Student student); //修改学生信息

    Student findStudentById(Integer s_id);

    List<Student> getAll();
}
