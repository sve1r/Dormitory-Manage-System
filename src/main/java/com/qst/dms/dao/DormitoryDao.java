package com.qst.dms.dao;


import com.qst.dms.po.Dormitory;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 管理员DAO层接口
 */
public interface DormitoryDao {
	/**
	 * 进行分页查询
	 */

	 //获取总条数
	Integer totalCount(@Param("a_name") String a_name, @Param("s_dormitoryid") Integer s_dormitoryid, @Param("d_dormbuilding") String d_dormbuilding);
	 //获取用户列表
	 List<Dormitory> getDormitoryList(@Param("a_name") String a_name, @Param("s_dormitoryid") Integer s_dormitoryid, @Param("d_dormbuilding") String d_dormbuilding, @Param("currentPage") Integer currentPage, @Param("pageSize") Integer pageSize);

	int addDormitory(Dormitory dormitory);    //添加宿舍信息
	int deleteDormitory(Integer d_id);   //删除宿舍信息
	int updateDormitory(Dormitory dormitory); //修改宿舍信息
	Dormitory findDormitoryById(Integer d_id);

    List<Dormitory> findDormitoryStudent(Integer s_dormitoryid);//查询宿舍人员信息
	List<Dormitory> getAll();

}
