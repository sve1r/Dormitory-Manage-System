package com.qst.dms.service.impl;



import com.qst.dms.dao.ClassDao;
import com.qst.dms.po.Class;
import com.qst.dms.po.PageInfo;
import com.qst.dms.service.ClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 用户Service接口实现类
 */
@Service("classService")
@Transactional
public class ClassServiceImpl implements ClassService {
    // classDao
    @Autowired
    private ClassDao classDao;


    //分页查询
    @Override
    public PageInfo<Class> findPageInfo(String c_classname, String c_counsellor, Integer c_classid, Integer pageIndex, Integer pageSize) {
        PageInfo<Class> pi = new PageInfo<>();
        pi.setPageIndex(pageIndex);
        pi.setPageSize(pageSize);
        //获取总条数
        Integer totalCount = classDao.totalCount(c_classname, c_classid, c_counsellor);
        if (totalCount > 0) {
            pi.setTotalCount(totalCount);
            //每一页显示班级信息数
            //currentPage = (pageIndex-1)*pageSize  当前页码数减1*最大条数=开始行数
            List<Class> classList = classDao.getClassList(c_classname, c_classid, c_counsellor,
                    (pi.getPageIndex() - 1) * pi.getPageSize(), pi.getPageSize());
            pi.setList(classList);
        }
        return pi;
    }

    @Override
    public List<Class> getAll() {
        return classDao.getAll();
    }

    //通过id删除班级信息
    @Override
    public int deleteClass(Integer c_id) {
        return classDao.deleteClass(c_id);
    }

    //添加班级信息
    @Override
    public int addClass(Class uclass) {
        return classDao.addClass(uclass);
    }

    @Override
    public Class findClassById(Integer c_id) {
        return classDao.findClassById(c_id);
    }

    //修改班级信息
    @Override
    public int updateClass(Class uclass) {
        return classDao.updateClass(uclass);
    }

    //查询宿舍人员信息
    @Override
    public List<Class> findClassStudent(Integer c_classid, String c_classname) {
        return classDao.findClassStudent(c_classid, c_classname);
    }
}