package com.qst.dms.service;



import com.qst.dms.po.PageInfo;
import com.qst.dms.po.StudentClean;

import java.util.List;

/**
 * @program: dormitorySystem
 * @description: 学生卫生服务接口
 * @author: Joyrocky
 * @create: 2019-04-25 12:15
 **/
public interface StudentCleanService {
    //分页查询
    PageInfo<StudentClean> findPageInfo(Integer s_studentid, String s_name, Integer s_dormitoryid, Integer pageIndex, Integer pageSize);

    int addStudentClean(StudentClean studentclean);    //添加宿舍信息
    int deleteStudentClean(Integer g_id);   //删除宿舍信息
    int updateStudentClean(StudentClean studentclean); //修改宿舍信息
    StudentClean findStudentCleanById(Integer g_id);
    List<StudentClean> getAll();
}
