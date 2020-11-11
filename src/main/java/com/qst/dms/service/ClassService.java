package com.qst.dms.service;



import com.qst.dms.po.PageInfo;

import java.util.List;

/**
 * 用户Service层接口
 */
public interface ClassService {

	//分页查询
    PageInfo<Class> findPageInfo(String c_classname, String c_counsellor, Integer c_classid, Integer pageIndex, Integer pageSize);

	int deleteClass(Integer c_id);   //删除班级信息
	int addClass(Class ucalss);    //添加班级信息
	Class findClassById(Integer c_id);
	int updateClass(Class uclass); //修改班级信息

    List<Class> findClassStudent(Integer c_classid, String c_classname);//查询班级人员信息
	List<Class> getAll();
}
