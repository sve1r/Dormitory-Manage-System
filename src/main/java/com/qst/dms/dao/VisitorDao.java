package com.qst.dms.dao;

import com.qst.dms.po.Visitor;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @program: dormitorySystem
 * @description: 访客
 * @author:
 * @create:
 **/
public interface VisitorDao {
    /**
     * 进行分页查询
     */

    //获取总条数
    Integer totalCount(@Param("v_name") String v_name, @Param("v_phone") Integer v_phone);

    //获取用户列表
    List<Visitor> getVisitorList(@Param("v_name") String v_name, @Param("v_phone") Integer v_phone, @Param("currentPage") Integer currentPage, @Param("pageSize") Integer pageSize);

    int addVisitor(Visitor visitor);   //添加学生信息

    List<Visitor> getAll();

}
