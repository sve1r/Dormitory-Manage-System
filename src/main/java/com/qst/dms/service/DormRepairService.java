package com.qst.dms.service;



import com.qst.dms.po.DormRepair;
import com.qst.dms.po.PageInfo;

import java.util.List;

/**
 * @program: dormitorySystem
 * @description: 维修登记
 * @author:
 * @create:
 **/
public interface DormRepairService {

    //分页查询
    PageInfo<DormRepair> findPageInfo(Integer d_id, String d_dormbuilding, Integer pageIndex, Integer pageSize);

    int addDormRepair(DormRepair dormrepair);    //添加宿舍信息
    int deleteDormRepair(Integer r_id);   //删除宿舍信息
    int updateDormRepair(DormRepair dormrepair); //修改宿舍信息
    DormRepair findDormRepairById(Integer r_id);
    List<DormRepair> getAll();
}
