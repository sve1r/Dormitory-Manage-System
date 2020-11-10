package com.qst.dms.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class PageInfo<T> implements Serializable {
    private Integer pageIndex =1;//页码
    private Integer pageSize =3;//显示条数
    private Integer totalCount =0; //总条数
    private Integer pageTotalCount =0; //总页数
    //每页显示的数据集合
    private List<T> list = new ArrayList<T>();


}
