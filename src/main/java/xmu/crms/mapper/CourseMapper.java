package xmu.crms.mapper;

import java.math.BigInteger;
import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Options;
import org.springframework.beans.factory.annotation.Autowired;

import xmu.crms.entity.ClassInfo;
import xmu.crms.entity.Course;

public interface CourseMapper 
{

	/*
     * 按userId获取与当前用户相关联的课程列表.
     * <p>老师与他相关联的课程列表<br>
     *
     * @param userId 用户Id
     * @return null 课程列表
     * @author lhl
     */
	@Select("SELECT * FROM course WHERE teacher_id= #{userId}")
	@Results(
			{
				@Result(property = "startDate",  column = "start_date"),
		        @Result(property = "endDate", column = "end_date"),
		        @Result(property = "reportPercentage", column = "report_percentage"),
		        @Result(property = "presentationPercentage", column = "presentation_percentage"),
		        @Result(property = "fivePointPercentage", column = "five_point_percentage"),
		        @Result(property = "fourPointPercentage", column = "four_point_percentage"),
		        @Result(property = "threePointPercentage", column = "three_point_percentage"),
				@Result(property = "teacher",
	               column = "teacher_id",
	               one = @One(select = "xmu.crms.mapper.UserMapper.getUserById"))
			}
			)
	List<Course> listCourseByUserId(BigInteger userId);

	
	 /**
     * 创建课程.
     * <p>按userId创建课程<br>
     *
     * @param course 课程信息
     * @author lhl
     */
	 @Insert("INSERT INTO course("
	 		+ "name,"
	 		+ "start_date,"
	 		+ "end_date,"
	 		+ "teacher_id,"
	 		+ "description,"
	 		+ "report_percentage,"
	 		+ "presentation_percentage,"
	 		+ "five_point_percentage,"
	 		+ "four_point_percentage,"
	 		+ "three_point_percentage) "
	 		+ "VALUES("
	 		+ "#{name}, "
	 		+ "#{startDate}, "
	 		+ "#{endDate},"
	 		+ "#{teahcher.id},"
	 		+ "#{description},"
	 		+ "#{reportPercentage},"
	 		+ "#{presentationPercentage},"
	 		+ "#{fivePointPercentage},"
	 		+ "#{fourPointPercentage},"
	 		+ "#{threePointPercentage})")
	 @Options(useGeneratedKeys = true, keyProperty = "id" )  
	void insertCourse(Course course);
	
	
	/**
	 * 按courseId获取课程 .
	 * <p>按courseId获取课程 <br>
	 *
	 * @param courseId 课程Id
	 * @return course
	 * @author lhl
	 */
	@Select("SELECT * FROM course WHERE id= #{courseId}")
	@Results(
			{
				@Result(property = "startDate",  column = "start_date"),
		        @Result(property = "endDate", column = "end_date"),
		        @Result(property = "reportPercentage", column = "report_percentage"),
		        @Result(property = "presentationPercentage", column = "presentation_percentage"),
		        @Result(property = "fivePointPercentage", column = "five_point_percentage"),
		        @Result(property = "fourPointPercentage", column = "four_point_percentage"),
		        @Result(property = "teacher",
	               column = "teacher_id",
	               one = @One(select = "xmu.crms.mapper.UserMapper.getUserById"))
			}
			)
    Course getCourseByCourseId(BigInteger courseId);
    
    
    /**
     * 传入courseId和course信息修改course信息.
     * <p>传入courseId和course信息修改course信息 <br>
     *
     * @param courseId 课程Id
     * @param course   课程信息
     * @author lhl
     */
	 @Update("UPDATE course SET "
	 		+ "name=#{name},"
	 		+ "start_date=#{startDate} "
	 		+ "end_date=#{endDate} "
	 		+ "teacher_id=#{teacher.id} "
	 		+ "description=#{description} "
	 		+ "report_percentage=#{reportPercentage} "
	 		+ "presentation_percentage=#{presentationPercentage} "
	 		+ "five_point_percentage=#{fivePointPercentage} "
	 		+ "four_point_percentage=#{fourPointPercentage} "
	 		+ "three_point_percentage=#{threePointPercentage} "
	 		+ "WHERE "
	 		+ "id =#{id}")
     void updateCourseByCourseId(Course course);
    
    
    /**
     * 按courseId删除课程.
     * <p>先根据courseID删除Seminar 和 class,然后再将course的信息删除<br>
     *
     * @param courseId 课程Id
     * @throws IllegalArgumentException courseId格式错误时抛出
     * @author lhl
     */
	 @Delete("DELETE FROM class_info WHERE course_id =#{courseId}")
	 void deleteClassByCourseId(BigInteger courseId);
	 @Delete("DELETE FROM seminar WHERE course_id =#{courseId}")
	 void deleteSeminarByCourseId(BigInteger courseId);
	@Delete("DELETE FROM course WHERE id =#{courseId}")
    void deleteCourseByCourseId(BigInteger courseId);

    
    /**
     * 根据课程名称获取课程列表.
     * <p>根据课程名称获取课程列表<br>
     *
     * @param courseName 课程名称
     * @return list 课程列表
     * @author YeXiaona
     */
	@Select("SELECT * FROM course WHERE name= #{courseName}")
	@Results(
			{
				@Result(property = "startDate",  column = "start_date"),
		        @Result(property = "endDate", column = "end_date"),
		        @Result(property = "reportPercentage", column = "report_percentage"),
		        @Result(property = "presentationPercentage", column = "presentation_percentage"),
		        @Result(property = "fivePointPercentage", column = "five_point_percentage"),
		        @Result(property = "fourPointPercentage", column = "four_point_percentage"),
		        @Result(property = "threePointPercentage", column = "three_point_percentage"),
				@Result(property = "teacher",
	               column = "teacher_id",
	               one = @One(select = "xmu.crms.mapper.UserMapper.getUserById"))
			}
			)
    List<Course> listCourseByCourseName(String courseName);
    
    
    /**
     * 按课程id获取班级列表.
     * <p>根据课程名获取课程ID，通过课程ID获取班级列表<br>
     *
     * @param courseId 课程id
     * @return list 班级列表
     * @author lhl
     */
	@Select("SELECT * FROM class_info WHERE name= #{courseId}")
	@Results(
			{
				@Result(property = "classTime",  column = "class_time"),
		        @Result(property = "reportPercentage", column = "report_percentage"),
		        @Result(property = "presentationPercentage", column = "presentation_percentage"),
		        @Result(property = "fivePointPercentage", column = "five_point_percentage"),
		        @Result(property = "fourPointPercentage", column = "four_point_percentage"),
		        @Result(property = "threePointPercentage", column = "three_point_percentage"),
				@Result(property = "course",
	               column = "course_id",
	               one = @One(select = "xmu.crms.mapper.CourseMapper.getCourseByCourseId"))
			}
			)
    List<ClassInfo> listClassByCourseId(Integer courseId);
}
