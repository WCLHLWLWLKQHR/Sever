package xmu.crms.dao;

import java.math.BigInteger;
import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import xmu.crms.entity.ClassInfo;
import xmu.crms.entity.Course;
public class CourseDAO {
    /**
     * 按userId获取与当前用户相关联的课程列表.
     * <p>老师与他相关联的课程列表<br>
     *
     * @param userId 用户Id
     * @return null 课程列表
     * @author lhl
     */
    public List<Course> listCourseByUserId(BigInteger userId) {
        return null;
    }


    /**
     * 按userId创建课程.
     * <p>按userId创建课程<br>
     *
     * @param course 课程信息
     * @author lhl
     */
    public void insertCourseByUserId(Course course) {

    }


    /**
     * 按courseId获取课程 .
     * <p>按courseId获取课程 <br>
     *
     * @param courseId 课程Id
     * @return course
     * @author lhl
     */
    public Course getCourseByCourseId(BigInteger courseId){
        return null;
    }


    /**
     * 传入courseId和course信息修改course信息.
     * <p>传入courseId和course信息修改course信息 <br>
     *
     * @param courseId 课程Id
     * @param course   课程信息
     * @author lhl
     */
    public void updateCourseByCourseId(Course course) {

    }


    /**
     * 按courseId删除课程.
     * <p>先根据courseID删除Seminar 和 class,然后再将course的信息删除<br>
     *
     * @param courseId 课程Id
     * @throws IllegalArgumentException courseId格式错误时抛出
     * @author lhl
     */
    public void deleteCourseByCourseId(BigInteger courseId) {

    }


    /**
     * 根据课程名称获取课程列表.
     * <p>根据课程名称获取课程列表<br>
     *
     * @param courseName 课程名称
     * @return list 课程列表
     * @author YeXiaona
     */
    public List<Course> listCourseByCourseName(String courseName) {
        return null;
    }


    /**
     * 按课程名称获取班级列表.
     * <p>根据课程名获取课程ID，通过课程ID获取班级列表<br>
     *
     * @param courseName 课程名称
     * @return list 班级列表
     * @author lhl
     */
    public List<ClassInfo> listClassByCourseName(String courseName) {
        return null;
    }


    /**
     * 按教师名称获取班级列表.
     * <p>根据教师名称获取课程ID，通过课程ID获取班级列表<br>
     *
     * @param teacherName 教师名称
     * @return list 班级列表
     * @author lhl
     */
    public List<ClassInfo> listClassByTeacherName(String teacherName) {
        return null;
    }


    /**
     * 按课程名称和教师名称获取班级列表.
     * <p> 根据课程名和教师名获取课程ID，通过课程ID获取班级列表;若课程名和班级名均不为空，取交集<br>
     *
     * @param courseName  课程名称
     * @param teacherName 教师名称
     * @return List 班级列表
     * @throws UserNotFoundException   无此姓名的教师
     * @throws CourseNotFoundException 无此名称的课程
     * @author lhl
     */
    public List<ClassInfo> listClassByName(String courseName, String teacherName){
        return null;
    }

}
