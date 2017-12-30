package xmu.crms.service;
/**
 * @author QHr
 */
import java.math.BigInteger;
import java.util.List;

import xmu.crms.entity.SeminarGroup;
import xmu.crms.exception.GroupNotFoundException;

public interface GradeService {
	/**
	 * 按seminarGroupTopicId删除学生打分表.
     *
     * @param seminarGroupTopicId  小组话题表的Id
     * @author QHr
	 * */
	
    void deleteStudentScoreGroupByTopicId(BigInteger seminarGroupTopicId);
    
    /**
     * 获取学生某一堂讨论课的小组信息.
     * <p>获取某学生一堂讨论课的小组信息（包括成绩）<br>
     *
     * @param seminarGroupId 讨论课小组id
     * @return seminarGroup 讨论课小组信息（包括成绩）
     * @author QHr
     * @throws IllegalArgumentException 
     * @throws GroupNotFoundException 
      */
    
    SeminarGroup getSeminarGroupBySeminarGroupId(BigInteger seminarGroupId) throws GroupNotFoundException, IllegalArgumentException;
    
    /**
     * 按课程id获取学生该课程所有讨论课
     * <p>通过课程id获取该课程下学生所有讨论课详细信息（包括成绩）<br>
     *
     * @param userId 用户id
     * @param courseId 课程id
     * @return List 该课程下所有讨论课列表
     * @author QHr
     */
    List<SeminarGroup> listSeminarGradeByCourseId(BigInteger userId,BigInteger courseId);
  
    
    /**
     * 提交对其他小组的打分.
     *
     * @param userId    用户id
     * @param groupId   小组Id
     * @param grade     分数
     * @param topicId   话题id
     * @author QHr
     * @throws GroupNotFoundException 
     * @throws IllegalArgumentException 
     */
    void insertGroupGradeByUserId(BigInteger topicId, BigInteger userId, BigInteger groupId, BigInteger grade) throws IllegalArgumentException, GroupNotFoundException;

    
    /**
     * 按ID设置小组展示分.
     *
     * @param seminarGroupId 讨论课组id
     * @param grade            分数
     * @author QHr
     */
    void updateGroupByGroupId(BigInteger seminarGroupId, BigInteger grade);
   
    /**
     * 按ID设置小组报告分.
     *
     * @param seminarGroupId 讨论课组id
     * @param grade            分数
     * @author QHr
     */
    void updateGroupReportGradeByGroupId(BigInteger seminarGroupId, BigInteger grade);
    
   /**
     * 按ID设置小组最终得分分.
     *
     * @param seminarGroupId 讨论课组id
     * @param grade            分数
     * @author QHr
 * @throws GroupNotFoundException 
 * @throws IllegalArgumentException 
     */
    void updateGroupFianlGradeByGroupId(BigInteger seminarGroupId, BigInteger grade) throws IllegalArgumentException, GroupNotFoundException;
}
