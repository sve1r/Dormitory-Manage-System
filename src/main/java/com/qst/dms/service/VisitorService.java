package com.qst.dms.service;

import com.qst.dms.po.PageInfo;
import com.qst.dms.po.Visitor;

import java.util.List;

/**
 * @program: dormitorySystem
 * @description: 访客
 * @author: Joyrocky
 * @create: 2019-05-14 12:39
 **/
public interface VisitorService {
    //分页查询
    PageInfo<Visitor> findPageInfo(String v_name, Integer v_phone, Integer pageIndex, Integer pageSize);

    int addVisitor(Visitor visitor);   //添加访客信息

    List<Visitor> getAll();
}
