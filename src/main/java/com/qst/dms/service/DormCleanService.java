package com.qst.dms.service;



import com.qst.dms.po.DormClean;
import com.qst.dms.po.PageInfo;

import java.util.List;

/**
 * @program: dormitorySystem
 * @description: 宿舍卫生服务接口
 * @author:
 * @create:
 **/
public interface DormCleanService {
    //分页查询
    PageInfo<DormClean> findPageInfo(Integer d_id, String d_dormbuilding, Integer pageIndex, Integer pageSize);

    int addDormClean(DormClean dormclean);    //添加宿舍信息
    int deleteDormClean(Integer g_id);   //删除宿舍信息
    int updateDormClean(DormClean dormclean); //修改宿舍信息
    DormClean findDormCleanById(Integer g_id);
    List<DormClean> getAll();
}
