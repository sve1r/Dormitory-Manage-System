package com.qst.dms.dao;


import com.qst.dms.po.DormClean;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @program: dormitorySystem
 * @description: 宿舍卫生
 * @author:
 * @create:
 **/
public interface DormCleanDao {
    /**
     * 进行分页查询
     */
    //获取总条数
    Integer totalCount(@Param("d_id") Integer d_id, @Param("d_dormbuilding") String d_dormbuilding);
    //获取用户列表
    List<DormClean> getDormCleanList(@Param("d_id") Integer d_id, @Param("d_dormbuilding") String d_dormbuilding, @Param("currentPage") Integer currentPage, @Param("pageSize") Integer pageSize);

    int addDormClean(DormClean dormclean);    //添加宿舍卫生信息
    int deleteDormClean(Integer g_id);   //删除宿舍卫生信息
    int updateDormClean(DormClean dormclean); //修改宿舍卫生信息
    DormClean findDormCleanById(Integer g_id);
    List<DormClean> getAll();

}
