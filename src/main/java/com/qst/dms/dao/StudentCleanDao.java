package com.qst.dms.dao;


import com.qst.dms.po.StudentClean;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @program: dormitorySystem
 * @description: 学生卫生
 * @author:
 * @create:
 **/
public interface StudentCleanDao {
    /**
     * 进行分页查询
     */
    //获取总条数
    Integer totalCount(@Param("s_studentid") Integer s_studentid, @Param("s_name") String s_name, @Param("s_dormitoryid") Integer s_dormitoryid);
    //获取用户列表
    List<StudentClean> getStudentCleanList(@Param("s_studentid") Integer s_studentid, @Param("s_name") String s_name, @Param("s_dormitoryid") Integer s_dormitoryid, @Param("currentPage") Integer currentPage, @Param("pageSize") Integer pageSize);

    int addStudentClean(StudentClean studentclean);    //添加宿舍卫生信息
    int deleteStudentClean(Integer g_id);   //删除宿舍卫生信息
    int updateStudentClean(StudentClean studentclean); //修改宿舍卫生信息
    StudentClean findStudentCleanById(Integer g_id);

    List<StudentClean> getAll();
}
