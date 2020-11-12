package com.qst.dms.controller;


import com.qst.dms.po.PageInfo;
import com.qst.dms.service.ClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Class ClassController
 *
 * @author sve1r
 * @description 班级控制器类
 * @date 2020/11/11
 */
@Controller
public class ClassController {
    /**
     * 依赖注入
     */
    @Autowired
    private ClassService classService;

    /**
     * 分页查询
     *
     * @param c_classid    班级 id
     * @param c_classname  班级名称
     * @param c_counsellor 辅导员
     * @param pageIndex    当前页码
     * @param pageSize     显示条数
     * @param model        页面视图模型
     * @return 查找后的页面
     */
    @RequestMapping(value = "/findClass")
    public String findClass(Integer c_classid, String c_classname, String c_counsellor,
                            Integer pageIndex, Integer pageSize, Model model) {

        PageInfo<Class> ci = classService.findPageInfo(c_classname, c_counsellor,
                c_classid, pageIndex, pageSize);
        model.addAttribute("ci", ci);
        model.addAttribute("c_classid", c_classid);
        return "class_list";
    }

    /**
     * 导出 excel
     *
     * @return 班级列表
     */
    @RequestMapping(value = "/exportclasslist", method = RequestMethod.POST)
    @ResponseBody
    public List<Class> exportClass() {
        return classService.getAll();
    }

    /**
     * 删除班级信息
     *
     * @param c_id 班级 id
     * @return 返回重查询后的班级列表
     */
    @RequestMapping("/deleteClass")
    @ResponseBody
    public String deleteClass(Integer c_id) {
        int c = classService.deleteClass(c_id);
        return "class_list";
    }

    /**
     * 添加班级
     *
     * @param uclass 班级对象
     * @return 重查询后的班级列表
     */
    @RequestMapping(value = "/addClass", method = RequestMethod.POST)
    @ResponseBody
    public String addClass(@RequestBody Class uclass) {
        int c = classService.addClass(uclass);
        return "class_list";
    }

    /**
     * 根据id 查询班级
     *
     * @param c_id    班级 id
     * @param session session 值
     * @return 返回编辑页面
     */
    @RequestMapping("/findClassById")
    public String findClassById(Integer c_id, HttpSession session) {
        Class c = classService.findClassById(c_id);
        session.setAttribute("c", c);
        return "class_edit";
    }

    /**
     * 修改班级信息
     */
    @RequestMapping(value = "/updateClass", method = RequestMethod.POST)

    public String updateClass(Class uclass) {
        int c = classService.updateClass(uclass);
        return "redirect:/findClass";
    }

    /**
     * 班级人员信息查询
     */
    @RequestMapping(value = "/findClassStudent")
    public String findClassStudent(Integer c_classid, String c_classname, Model model) {
        List<Class> c = classService.findClassStudent(c_classid, c_classname);
        model.addAttribute("cs", c);
        return "class_Studentlist";
    }


    /**
     * 班级人员全部信息查询
     */

    //采用Ajax来提交表单，并返回JSON数据
//	@RequestMapping(value = "/findClassStudentlist",method = RequestMethod.POST)
//	@ResponseBody
//	public List<Class> findClassStudentlist(@RequestBody Class uclass){
//		List<Class> c = classService.findClassStudent(uclass);
//		return c;
//	}
}
