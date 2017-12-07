package xmu.crms.view;


import xmu.crms.entity.Proportions;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import static org.springframework.web.bind.annotation.RequestMethod.*;

import xmu.crms.entity.Class;
import xmu.crms.view.vo.*;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.Response;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/class")
public class ClassController {

    @RequestMapping(method = GET)
    @ResponseBody
    public List<CourseClassVO> getClasses() {
        List<CourseClassVO> courseClassVOS = new ArrayList<CourseClassVO>();

        CourseClassVO courseClassVO1 = new CourseClassVO();
        courseClassVO1.setId(23);
        courseClassVO1.setName("周三1-2节");
        courseClassVO1.setNumStudent(60);
        courseClassVO1.setTime("周三1-2、周五1-2");
        courseClassVO1.setSite("公寓405");
        courseClassVO1.setCourseName("OOAD");
        courseClassVO1.setCourseTeacher("邱明");
        courseClassVOS.add(courseClassVO1);

        CourseClassVO courseClassVO2 = new CourseClassVO();
        courseClassVO2.setId(42);
        courseClassVO2.setName("一班");
        courseClassVO2.setNumStudent(60);
        courseClassVO2.setTime("周三34节、周五12节");
        courseClassVO2.setSite("海韵202");
        courseClassVO2.setCourseName(".NET平台开发");
        courseClassVO2.setCourseTeacher("杨律青");
        courseClassVOS.add(courseClassVO2);
        return courseClassVOS;
    }

    @RequestMapping(value = "/{classId}", method = GET)
    @ResponseBody
    public Class getClassById(@PathVariable("classId") int classId) {
        Class class1 = new Class();
        class1.setId(23);
        class1.setName("周三1-2节");
        class1.setNumStudent(120);
        class1.setTime("周三一二节");
        class1.setSite("海韵201");
        class1.setCalling(-1);
        class1.setRoster("/rester/周三12班.xlsx");
        Proportions proportions = new Proportions(50, 50, 20, 60, 20);
        class1.setProportions(proportions);
        return class1;
    }

    @RequestMapping(value = "/{classId}", method = PUT)
    public Response updateClassById(@PathVariable("classId") int classId, Class _class, HttpServletResponse response) {
        response.setStatus(204);
        return null;
    }

    @RequestMapping(value = "/{classId}", method = DELETE)
    public Response deleteClassById(@PathVariable("classId") int classId, HttpServletResponse response) {
        response.setStatus(204);
        return null;
    }

    @RequestMapping(value = "/{classId}/student", method = GET)
    @ResponseBody
    public List<StudentVO> selectClass1(@PathVariable("classId") int classId) {
        List<StudentVO> studentVOS = new ArrayList<StudentVO>();
        studentVOS.add(new StudentVO(233,"张三","24320152202333"));
        studentVOS.add(new StudentVO(245,"张八","24320152202334"));
        return studentVOS;
    }

    @RequestMapping(value = "/{classId}/student", method = POST)
    @ResponseBody
    public UrlVO selectClass2(@PathVariable("classId") int classId, IdVO id, HttpServletResponse response) {
        UrlVO url = new UrlVO("/class/34/student/2757");
        response.setStatus(201);
        return url;
    }

    @RequestMapping(value = "/{classId}/student/{studentId}", method = DELETE)
    public Response deselectClass(@PathVariable("classId") int classId,
                                  @PathVariable("studentId") int studentId,
                                  HttpServletResponse response) {
        response.setStatus(204);
        return null;
    }

    @RequestMapping(value = "/{classId}/classgroup", method = GET)
    @ResponseBody
    public ClassGroupVO getClassGroupByClassId(@PathVariable("classId") int classId) {
        ClassGroupVO classGroupVO = new ClassGroupVO();
        StudentVO leader = new StudentVO(2757,"张三","23320152202333");
        classGroupVO.setLeader(leader);
        List<StudentVO> members = new ArrayList<StudentVO>();
        StudentVO member1 = new StudentVO(2756,"李四","23320152202443");
        members.add(member1);
        StudentVO member2 = new StudentVO(2777,"王五","23320152202433");
        members.add(member2);
        classGroupVO.setMembers(members);
        return classGroupVO;
    }

    @RequestMapping(value = "/{classId}/classgroup/resign", method = PUT)
    public Response resignClassGroupLeader(@PathVariable("classId") int classId,
                                           IdVO id,
                                           HttpServletResponse response) {
        response.setStatus(204);
        return null;
    }

    @RequestMapping(value = "/{classId}/classgroup/assign", method = PUT)
    public Response assignClassGroupLeader(@PathVariable("classId") int classId,
                                           IdVO id,
                                           HttpServletResponse response) {
        response.setStatus(204);
        return null;
    }

    @RequestMapping(value = "/{classId}/classgroup/add", method = PUT)
    public Response addClassgroupMember(@PathVariable("classId") int classId,
                                           IdVO id,
                                           HttpServletResponse response) {
        response.setStatus(204);
        return null;
    }

    @RequestMapping(value = "/{classId}/classgroup/remove", method = PUT)
    public Response removeClassgroupMember(@PathVariable("classId") int classId,
                                        IdVO id,
                                        HttpServletResponse response) {
        response.setStatus(204);
        return null;
    }
}
