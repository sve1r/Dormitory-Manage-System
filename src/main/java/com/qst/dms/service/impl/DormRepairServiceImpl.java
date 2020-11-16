package com.qst.dms.service.impl;


import com.qst.dms.dao.DormRepairDao;
import com.qst.dms.po.DormRepair;
import com.qst.dms.po.PageInfo;
import com.qst.dms.service.DormRepairService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @program: dormitorySystem
 * @description: 维修登记
 * @author:
 * @create:
 **/
@Service("dormRepairService")
@Transactional
public class DormRepairServiceImpl implements DormRepairService {
    /**
     * 自动注入
     */
    @Autowired
    private DormRepairDao dormRepairDao;

    /**
     * 分页查询
     *
     * @param d_id           宿舍 id
     * @param d_dormbuilding 宿舍楼号
     * @param pageIndex      页数
     * @param pageSize       页面总数
     * @return 返回查询分页信息
     */
    @Override
    public PageInfo<DormRepair> findPageInfo(Integer d_id, String d_dormbuilding, Integer pageIndex, Integer pageSize) {
        PageInfo<DormRepair> pi = new PageInfo<>();
        pi.setPageIndex(pageIndex);
        pi.setPageSize(pageSize);
        //获取总条数
        Integer totalCount = dormRepairDao.totalCount(d_id, d_dormbuilding);
        if (totalCount > 0) {
            pi.setTotalCount(totalCount);
            //每一页显示宿舍信息数
            //currentPage = (pageIndex-1)*pageSize  当前页码数减1*最大条数=开始行数
            List<DormRepair> dormRepairList = dormRepairDao.getDormRepairList(d_id, d_dormbuilding,
                    (pi.getPageIndex() - 1) * pi.getPageSize(), pi.getPageSize());
            pi.setList(dormRepairList);
        }
        return pi;
    }

    /**
     * 所有报修结果
     *
     * @return 返回 dao 层查询结果
     */
    @Override
    public List<DormRepair> getAll() {
        return dormRepairDao.getAll();
    }

    /**
     * 添加宿舍信息
     *
     * @param dormrepair
     * @return
     */
    @Override
    public int addDormRepair(DormRepair dormrepair) {
        return dormRepairDao.addDormRepair(dormrepair);
    }

    /**
     * 通过id删除宿舍信息
     *
     * @param r_id 宿舍 id
     * @return dao 层执行结果
     */
    @Override
    public int deleteDormRepair(Integer r_id) {
        return dormRepairDao.deleteDormRepair(r_id);
    }

    /**
     * 更新宿舍修复
     *
     * @param dormrepair 宿舍报修对象
     * @return dao 层执行结果
     */
    @Override
    public int updateDormRepair(DormRepair dormrepair) {
        return dormRepairDao.updateDormRepair(dormrepair);
    }

    /**
     * 根据报修 id 查找宿舍
     *
     * @param r_id 报修宿舍 id
     * @return dao 层执行结果
     */
    @Override
    public DormRepair findDormRepairById(Integer r_id) {
        return dormRepairDao.findDormRepairById(r_id);
    }

}

