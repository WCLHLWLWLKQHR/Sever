package xmu.crms.view;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import static org.springframework.web.bind.annotation.RequestMethod.*;

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
    
}
