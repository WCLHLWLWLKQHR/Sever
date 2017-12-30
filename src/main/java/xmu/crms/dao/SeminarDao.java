package xmu.crms.dao;

import java.math.BigInteger;
import java.util.List;

import xmu.crms.entity.Seminar;

public interface SeminarDao {
	
	 /**
	 * 按courseId获取Seminar.
	 * @author lhl
	 * @param courseId 课程Id
	 * @return List 讨论课列表
	 */
	 List<Seminar> listSeminarByCourseId(BigInteger courseId);
	
	
	 /**
	 * 按courseId删除Seminar.
	 * <p>先根据CourseId获得所有的seminar的信息，然后根据seminar信息删除相关topic的记录，然后再根据SeminarId删除SeminarGroup表记录,最后再将seminar的信息删除<br>
	 * @author lhl
	 * @param courseId 课程Id
	 */
	 void deleteSeminarByCourseId(BigInteger courseId);

	
	 /**
	 * 用户通过讨论课id获得讨论课的信息.
	 * <p>用户通过讨论课id获得讨论课的信息（包括讨论课名称、讨论课描述、分组方式、开始时间、结束时间）<br>
	 * @author lhl
	 * @param seminarId 讨论课的id
	 * @return 相应的讨论课信息
	 */
	 Seminar getSeminarBySeminarId(BigInteger seminarId);
	
	
	/**
	 * 按讨论课id修改讨论课.
	 * <p>用户（老师）通过seminarId修改讨论课的相关信息<br>
	 * @author lhl
	 * @param seminarId 讨论课的id
	 * @param seminar 讨论课信息
	 */
	 void updateSeminarBySeminarId(Seminar seminar);
	
	
	/**
	 * 按讨论课id删除讨论课.
	 * <p>用户（老师）通过seminarId删除讨论课<br>(包括删除讨论课包含的topic信息和小组信息).
	 * @author lhl
	 * @param seminarId 讨论课的id
	 */
	 void deleteSeminarBySeminarId(BigInteger seminarId);

	
	/**
	 * 新增讨论课.
	 * <p>用户（老师）在指定的课程下创建讨论课<br>
	 * @author lhl
	 * @param courseId 课程的id
	 * @param seminar 讨论课信息
	 */
	 BigInteger insertSeminarByCourseId(Seminar seminar);
}
