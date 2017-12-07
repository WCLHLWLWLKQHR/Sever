# assign3
### 实验内容：在实验二的代码基础上，采用Spring Boot和Maven建立一个包含SpringMVC的工程，实现增加课程的功能.不需要页面，只需要实现对应的Controller，不要求实现数据库的访问，生成对象即可。需要支持用Spring测试框架测试

### 包结构
+ src/main/java
    + course
        + Application.java(main函数)
    + course.entity
        + Course.java(Course基本信息类)
    + course.service
        + CourseService.java(包含主要的函数)
    + course.view
        + CourseController.java
    + course.view.vo
        + AddForm.java(由于此实验不实现页面,这里用一个AddForm类代替页面)
+ src/test/java
    + course.test
        + CourseControllerTest.java(测试CourseController.java)
        + CourseServiceTest.java(测试CourseService.java)
