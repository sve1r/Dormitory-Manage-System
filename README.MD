# 学生宿舍管理系统
![GitHub contributors](https://img.shields.io/github/contributors/sve1r/Dormitory-Manage-System?style=for-the-badge)
![GitHub stars](https://img.shields.io/github/stars/sve1r/Dormitory-Manage-System?color=ffd700&style=for-the-badge)
![GitHub forks](https://img.shields.io/github/forks/sve1r/Dormitory-Manage-System?color=60c5ba&style=for-the-badge)
![GitHub issues](https://img.shields.io/github/issues/sve1r/Dormitory-Manage-System?color=1E90FF&style=for-the-badge)
![Github Codelines](https://img.shields.io/tokei/lines/github/sve1r/Dormitory-Manage-System?style=for-the-badge)
![GitHub](https://img.shields.io/github/license/sve1r/Dormitory-Manage-System?style=for-the-badge)
---
## 主要功能
* 学生管理
* 班级管理
* 宿舍管理
* 卫生管理
* 访客管理
* 管理员管理
```
//TODO
```

---
## 开发环境
- IDE : `JetBrains™ IntelliJ IDEA 2020.2.1`
- 数据库 : `Oracle™ Mysql 8.0.21`
- JDK版本 : `Oracle™ Java JDK 1.8`
- Tomcat版本 : `Apache™ Tomcat 9.x`

## 项目整体架构
```
├─ database                          // 数据库相关文件
│  ├─ design				            // 数据库设计
│  │  └─1
│  └─ sql                            // 数据库初始化脚本文件
├─ src                               // 项目源代码目录
│  └─ com                            //源代码目录
│  │  └─ qst                            // java代码目录
│  │  │  ├─ controller                      // 控制层
│  │  │  ├─ dao                             // 持久层
│  │  │  ├─ entity                          // 实体类
│  │  │  ├─ filter                          // 过滤器
│  │  │  ├─ lisener                         // 监听器
│  │  │  ├─ ***                             // ***
│  │  │  ├─ servlet                         // Servlet
│  │  │  ├─ service                         // 服务层
│  │  │  │  └─ impl                             // 服务层接口实现
│  │  │  └─ util                            // 工具类
├─ test                                 // 测试代码目录
├─ web                               // tomcat前端文件目录
│  ├─ WEB-INF                           // 页面相关配置文件
│  ├─ static                            // 页面所需静态资源 
│  │  ├─ css                                // 页面所需 css
│  │  ├─ js                                 // 页面所需 js 
│  │  ├─ imgs                               // 页面所需图片 
│  │  └─ ***                                // 页面所需*** 
│  └─ jsp                               // jsp页面目录                            
├─ README.md                         // README
└─ LICENSE                           // 项目所使用的软件许可证
```

## 更新内容
```
//TODO
```
