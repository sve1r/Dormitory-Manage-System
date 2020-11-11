package com.qst.dms.service;



import com.qst.dms.po.Admin;
import com.qst.dms.po.PageInfo;

import java.util.List;

/**
 * 用户Service层接口
 */
public interface AdminService {
	// 通过账号和密码查询用户
    Admin findAdmin(Admin admin);

	//找到所有所有数据
    List<Admin> getAll();

	//分页查询
    PageInfo<Admin> findPageInfo(String a_username, String a_describe, Integer a_id, Integer pageIndex, Integer pageSize);

	int addAdmin(Admin admin);    //添加管理员信息
	int deleteAdmin(Integer a_id);   //删除管理员信息
	int updateAdmin(Admin admin); //修改管理员信息
	Admin findAdminById(Integer a_id);
}
