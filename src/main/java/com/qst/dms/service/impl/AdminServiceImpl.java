package com.qst.dms.service.impl;


import com.qst.dms.dao.AdminDao;
import com.qst.dms.po.Admin;
import com.qst.dms.po.PageInfo;
import com.qst.dms.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Class AdminServiceImpl
 *
 * @author sve1r
 * @description 用户Service接口实现类
 * @date 2020/11/11
 */
@Service("adminService")
@Transactional
public class AdminServiceImpl implements AdminService {
    /**
     * 自动注入 adminDao
     */
    @Autowired
    private AdminDao adminDao;

    /**
     * 管理登陆查询
     *
     * @param admin 管理员对象
     * @return dao 层查询结果
     */
    @Override
    public Admin findAdmin(Admin admin) {
        return adminDao.findAdmin(admin);
    }

    /**
     * 所有管理员对象结果
     *
     * @return 返回 dao 层查询结果
     */
    @Override
    public List<Admin> getAll() {
        return adminDao.getAll();
    }

    /**
     * 分页查询 管理员
     *
     * @param a_username 管理员用户名
     * @param a_describe 管理员描述
     * @param a_id       管理员 id
     * @param pageIndex  页数
     * @param pageSize   页面总数
     * @return
     */
    @Override
    public PageInfo<Admin> findPageInfo(String a_username, String a_describe, Integer a_id, Integer pageIndex, Integer pageSize) {
        PageInfo<Admin> pi = new PageInfo<>();
        pi.setPageIndex(pageIndex);
        pi.setPageSize(pageSize);
        //获取总条数
        Integer totalCount = adminDao.totalCount(a_username, a_describe, a_id);
        if (totalCount > 0) {
            pi.setTotalCount(totalCount);
            //每一页显示管理员信息数
            //currentPage = (pageIndex-1)*pageSize  当前页码数减1*最大条数=开始行数
            List<Admin> adminList = adminDao.getAdminList(a_username, a_describe, a_id,
                    (pi.getPageIndex() - 1) * pi.getPageSize(), pi.getPageSize());
            pi.setList(adminList);
        }
        return pi;
    }

    /**
     * 添加管理员信息
     *
     * @param admin 管理员对象
     * @return
     */
    @Override
    public int addAdmin(Admin admin) {
        return adminDao.addAdmin(admin);
    }

    /**
     * 通过id删除管理员信息
     *
     * @param a_id 管理员 id
     * @return dao 层执行结果
     */
    @Override
    public int deleteAdmin(Integer a_id) {
        return adminDao.deleteAdmin(a_id);
    }

    /**
     * 修改管理员信息
     *
     * @param admin 管理员对象
     * @return dao 层执行结果
     */
    @Override
    public int updateAdmin(Admin admin) {
        return adminDao.updateAdmin(admin);
    }

    /**
     * 根据 id 查询管理员
     *
     * @param a_id 管理员 id
     * @return dao 层执行结果
     */
    @Override
    public Admin findAdminById(Integer a_id) {
        return adminDao.findAdminById(a_id);
    }
}
