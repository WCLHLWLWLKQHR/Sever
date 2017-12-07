package xmu.crms.view;

//这个包手动添加,包含了GET,POST等声明
import static org.springframework.web.bind.annotation.RequestMethod.*;

import xmu.crms.entity.*;
import xmu.crms.view.vo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.Response;
import java.util.ArrayList;
import java.util.List;

//添加Controller的注解
@Controller
//控制器指定可以处理哪些URL请求
@RequestMapping("/course")  
public class CourseController {
	/*
	@Autowired
	CourseService courseService = new CourseService();
	CourseDetailService courseDetailService = new CourseDetailService();
	CourseClassService courseClassService = new CourseClassService();
	SeminarClassesService seminarClassesService = new SeminarClassesService();
	Gson gson = new Gson();
	*/

	@RequestMapping(method = GET)
	@ResponseBody
	public List<UserCourseVO> getUserCourses(HttpServletResponse response) {
		List<UserCourseVO> userCourseVOS = new ArrayList<UserCourseVO>();
		userCourseVOS.add(new UserCourseVO(1,"OOAD",3,60,"2017-9-1","2018-1-1"));
		userCourseVOS.add(new UserCourseVO(2,"J2EE",1,60,"2017-9-1","2018-1-1"));
		response.setStatus(200);
		return userCourseVOS;
	}

	@RequestMapping(method = POST)
	@ResponseBody
	public IdVO createCourse(Course course, HttpServletResponse response) {
		IdVO id = new IdVO(23);
		response.setStatus(201);
		return id;
	}

	@RequestMapping(value = "/{courseId}", method = GET)
	@ResponseBody
	public CourseByIdVO getCourseById(@PathVariable("courseId") int courseId, HttpServletResponse response) {
		CourseByIdVO courseByIdVO = new CourseByIdVO();
		courseByIdVO.setId(23);
		courseByIdVO.setName("OOAD");
		courseByIdVO.setDescription("面向对象分析与设计");
		courseByIdVO.setTeacherName("邱明");
		courseByIdVO.setTeacherEmail("mingqiu@xmu.edu.cn");
		response.setStatus(200);
		return courseByIdVO;
	}

	@RequestMapping(value = "/{courseId}", method = PUT)
	public Response updateCourse(@PathVariable("courseId") int courseId, Course course, HttpServletResponse response) {
		response.setStatus(204);
		return null;
	}

	@RequestMapping(value = "/{courseId}", method = DELETE)
	public Response deleteCourseById(@PathVariable("courseId") int courseId, HttpServletResponse response) {
		response.setStatus(204);
		return null;
	}

	@RequestMapping(value = "/{courseId}/class", method = GET)
	@ResponseBody
	public List<CourseVO> getClassByCourseId(@PathVariable("courseId") int courseId, HttpServletResponse response) {
		List<CourseVO> courseVOS = new ArrayList<CourseVO>();
		courseVOS.add(new CourseVO(45,"周三1-2节"));
		courseVOS.add(new CourseVO(48,"周三3-4节"));
		response.setStatus(200);
		return courseVOS;
	}

	@RequestMapping(value = "/{courseId}/class", method = POST)
	@ResponseBody
	public IdVO createClassByCourseId(@PathVariable("courseId") int courseId, Course course, HttpServletResponse response) {
		IdVO id = new IdVO(45);
		response.setStatus(201);
		return id;
	}

	@RequestMapping(value = "/{courseId}/seminar", method = GET)
	@ResponseBody
	public List<SeminarVO> getSeminarsByCourseId(@PathVariable("courseId") int courseId, HttpServletResponse respons) {
		List<SeminarVO> seminarVOS = new ArrayList<SeminarVO>();
		seminarVOS.add(new SeminarVO(29,"界面原型设计","界面原型设计",
				"fixed","2017-09-25","2017-10-09",4));
		seminarVOS.add(new SeminarVO(32,"概要设计","模型层与数据库设计",
				"fixed","2017-10-10","2017-10-24",5));
		respons.setStatus(200);
		return seminarVOS;
	}

	@RequestMapping(value = "/{courseId}/seminar", method = POST)
	@ResponseBody
	public IdVO createSeminarByCourseId(@PathVariable("courseId") int courseId,
									   Course course, HttpServletResponse response) {
		IdVO id = new IdVO(32);
		response.setStatus(201);
		return id;
	}

	@RequestMapping(value = "/{courseId}/seminar/current", method = GET)
	@ResponseBody
	public SeminarCurrentVO getCurrentSeminarByCourseId(@PathVariable("courseId") int courseId) {
		SeminarCurrentVO seminarCurrentVO = new SeminarCurrentVO();
		seminarCurrentVO.setId(29);
		seminarCurrentVO.setName("界面原型设计");
		seminarCurrentVO.setCourseName("OOAD");
		seminarCurrentVO.setGroupingMethod("fixed");
		seminarCurrentVO.setStartTime("2017-09-25");
		seminarCurrentVO.setEndTime("2017-10-09");
		List<ClassVO> classVOS = new ArrayList<ClassVO>();
		classVOS.add(new ClassVO(53,"周三12"));
		classVOS.add(new ClassVO(57,"周三34"));
		seminarCurrentVO.setClasses(classVOS);
		return seminarCurrentVO;
	}

	@RequestMapping(value = "/{courseId}/grade", method = GET)
	@ResponseBody
	public List<SeminarGradeVO> getGradesByCourseId(@PathVariable("courseId") int courseId, HttpServletResponse response) {
		List<SeminarGradeVO> seminarGradeVOS = new ArrayList<SeminarGradeVO>();
		SeminarGradeVO seminarGradeVO1 = new SeminarGradeVO();
		seminarGradeVO1.setSeminarName("需求分析");
		seminarGradeVO1.setGroupName("3A2");
		seminarGradeVO1.setLeaderName("张三");
		seminarGradeVO1.setPresentationGrade(3);
		seminarGradeVO1.setReportGrade(4);
		seminarGradeVO1.setGrade(4);
		seminarGradeVOS.add(seminarGradeVO1);
		SeminarGradeVO seminarGradeVO2 = new SeminarGradeVO();
		seminarGradeVO2.setSeminarName("界面原型设计");
		seminarGradeVO2.setGroupName("3A3");
		seminarGradeVO2.setLeaderName("张三");
		seminarGradeVO2.setPresentationGrade(4);
		seminarGradeVO2.setReportGrade(4);
		seminarGradeVO2.setGrade(4);
		seminarGradeVOS.add(seminarGradeVO2);
		response.setStatus(200);
		return seminarGradeVOS;
	}
}
