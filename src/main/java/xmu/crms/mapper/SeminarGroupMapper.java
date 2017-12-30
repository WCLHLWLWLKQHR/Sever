package xmu.crms.mapper;

import java.math.BigInteger;
import java.util.List;

import xmu.crms.entity.Seminar;
import xmu.crms.entity.SeminarGroup;

public interface SeminarGroupMapper {

	/**
     * 按seminarGroupTopicId删除学生打分表.
     *
     * @param seminarGroupTopicId  小组话题表的Id
     * @author lhl
     */
    void deleteStudentScoreGroupByTopicId(BigInteger seminarGroupTopicId);

    
    /**
     * 获取学生某一堂讨论课的小组信息.
     * <p>获取某学生一堂讨论课的小组信息（包括成绩）<br>
     *
     * @param seminarGroupId 讨论课小组id
     * @return seminarGroup 讨论课小组信息（包括成绩）
     * @author lhl
     */
    SeminarGroup getSeminarGroupBySeminarGroupId(BigInteger seminarGroupId);
    
    
    /**
     * 按课程id获取学生该课程所有讨论课
     * <p>请通过以下面三个方法实现，获取该学生所有SeminarGroup和Seminar后,筛选出本Seminar的Group<br>
     *
     * @param userId 用户id
     * @param seminarId 课程id
     * @return List 该课程下所有讨论课列表
     * @author lhl
     */
    //List<SeminarGroup> listSeminarGradeByCourseId(BigInteger userId,BigInteger seminarId);

    /**
     * 按课程id获取该课程所有讨论课
     * @param courseId 课程id
     * @return List 该课程下所有讨论课列表
     * @author lhl
     */
    List<Seminar> listSeminarBycourseId(BigInteger courseId);

    
    /**
     * 按课程id删除该课程所有讨论课
     * @param courseId 课程id
     * @author lhl
     */
    void deleteSeminarBycourseId(BigInteger courseId);

    
    
    /**
     * 根据用户id获得该用户的seminarGroupId
     * @param userId 用户id
     * @return List 该课程下所有讨论课列表
     * @author lhl
     */
    List<Integer> listSeminarGroupIdByuserId(BigInteger userId);

    /**
     * 根据seminarGroupId获得该用户的seminarGroup
     * @param seminarGroupId
     * @return List 该课程下所有讨论课列表
     * @author lhl
     */
    List<SeminarGroup> listSeminarGroupByseminarGroupId(BigInteger seminarGroupId);

    /**
     * 提交对其他小组的打分.
     *
     * @param userId    用户id
     * @param groupId   小组Id
     * @param grade     分数
     * @param topicId   话题id
     * @author lhl
     */
    void insertGroupGradeByUserId(BigInteger topicId, BigInteger userId, BigInteger groupId, BigInteger grade);

    
    /**
     * 按ID设置小组报告分.
     *
     * @param seminar_group_id 讨论课组id
     * @param grade            分数
     * @author lhl
     */
    void updateGroupByGroupId(BigInteger seminar_group_id, BigInteger grade);

    
    /**
     * 按ID设置小组展示分.
     *
     * @param seminar_group_id 讨论课组id
     * @param grade            分数
     * @author lhl
     */
    void updateGroupReportGradeByGroupId(BigInteger seminar_group_id, BigInteger grade);

    
    /**
     * 按ID设置小组最终得分分.
     *
     * @param seminar_group_id 讨论课组id
     * @param grade            分数
     * @author lhl
     */
    void updateGroupFianlGradeByGroupId(BigInteger seminar_group_id, BigInteger grade);
}
