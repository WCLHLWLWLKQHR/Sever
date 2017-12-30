package xmu.crms.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import xmu.crms.dao.CourseDAO;
import xmu.crms.entity.ClassInfo;
import xmu.crms.entity.Course;
import xmu.crms.exception.ClassesNotFoundException;
import xmu.crms.exception.CourseNotFoundException;
import xmu.crms.exception.UserNotFoundException;
import xmu.crms.service.CourseService;
import xmu.crms.service.SeminarService;

import java.math.BigInteger;
import java.util.List;

/**
 * @author LUWEIW
 */

@Service("CourseService")
@Component
public class CourseServiceImpl implements CourseService {
    public CourseDAO courseDAO;
    public SeminarServiceImpl seminarServiceImpl;
    public ClassServiceImpl classServiceImpl;
    public UserServiceImpl userServiceImpl;

    @Override
    public List<Course> listCourseByUserId(BigInteger userId) throws IllegalArgumentException, CourseNotFoundException {
        if (userId.intValue() < 0) {
            throw new IllegalArgumentException("userId格式错误");
        }
        List<Course> courseList = courseDAO.listCourseByUserId(userId);
        if (courseList == null) {
            throw new CourseNotFoundException();
            //throw new CourseNotFoundException("没有找到该课程");
        }
        return courseList;
    }

    @Override
    public BigInteger insertCourseByUserId(BigInteger userId, Course course) throws IllegalArgumentException {
        if (userId.intValue() < 0) {
            throw new IllegalArgumentException("userId格式错误");
        }
        return courseDAO.insertCourseByUserId(course);
    }

    @Override
    public Course getCourseByCourseId(BigInteger courseId) throws IllegalArgumentException, CourseNotFoundException {
        if (courseId.intValue() < 0) {
            throw new IllegalArgumentException("courseId格式错误");
        }
        Course course = courseDAO.getCourseByCourseId(courseId);
        if (course == null) {
            throw new CourseNotFoundException();
        }
        return course;
    }

    @Override
    public void updateCourseByCourseId(BigInteger courseId, Course course) throws CourseNotFoundException {
        if (course.getId().intValue() < 0) {
            throw new CourseNotFoundException();
        }
        courseDAO.updateCourseByCourseId(course);
    }

    @Override
    public void deleteCourseByCourseId(BigInteger courseId) throws IllegalArgumentException {
        if (courseId.intValue() < 0) {
            throw new IllegalArgumentException("courseId格式错误");
        }
        courseDAO.deleteCourseByCourseId(courseId);

        try {
            seminarServiceImpl.deleteSeminarByCourseId(courseId);
            classServiceImpl.deleteClassByCourseId(courseId);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Course> listCourseByCourseName(String courseName) {
        List<Course> courseList = courseDAO.listCourseByCourseName(courseName);
        return courseList;
    }

    @Override
    public List<ClassInfo> listClassByCourseName(String courseName) throws CourseNotFoundException {
        List<ClassInfo> classInfoList = courseDAO.listClassByCourseName(courseName);
        if (this.listCourseByCourseName(courseName) == null) {
            throw new CourseNotFoundException();
        }
        return classInfoList;
    }

    @Override
    public List<ClassInfo> listClassByTeacherName(String teacherName) throws UserNotFoundException, ClassesNotFoundException {
        List<ClassInfo> classInfoList = courseDAO.listClassByTeacherName(teacherName);
        if (userServiceImpl.listUserIdByUserName(teacherName) == null) {
            throw new UserNotFoundException();
        }
        if (classInfoList == null) {
            throw new ClassesNotFoundException();
        }
        return classInfoList;
    }

    @Override
    public List<ClassInfo> listClassByName(String courseName, String teacherName) throws UserNotFoundException, CourseNotFoundException {
        return null;
    }
}
