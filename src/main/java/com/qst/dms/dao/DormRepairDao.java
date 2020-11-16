package com.qst.dms.dao;


import com.qst.dms.po.DormRepair;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @program: dormitorySystem
 * @description: 维修登记
 * @author:
 * @create:
 **/
public interface DormRepairDao {

    /**
     * 进行分页查询
     */

    //获取总条数
    Integer totalCount(@Param("d_id") Integer d_id, @Param("d_dormbuilding") String d_dormbuilding);
    //获取用户列表
    List<DormRepair> getDormRepairList(@Param("d_id") Integer d_id, @Param("d_dormbuilding") String d_dormbuilding, @Param("currentPage") Integer currentPage, @Param("pageSize") Integer pageSize);

    int addDormRepair(DormRepair dormrepair);    //添加宿舍信息
    int deleteDormRepair(Integer r_id);   //删除宿舍信息
    int updateDormRepair(DormRepair dormrepair); //修改宿舍信息
    DormRepair findDormRepairById(Integer r_id);
    List<DormRepair> getAll();

}
