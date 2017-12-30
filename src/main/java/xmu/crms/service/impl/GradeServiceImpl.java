package xmu.crms.service.impl;
/**
 * @author QHr
 */
import java.math.BigInteger;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import xmu.crms.entity.Seminar;
import xmu.crms.entity.SeminarGroup;
import xmu.crms.exception.GroupNotFoundException;
import xmu.crms.mapper.SeminarGroupMapper;

import xmu.crms.mapper.SeminarMapper;
import xmu.crms.service.GradeService;

public class GradeServiceImpl  implements GradeService{

	SeminarGroupMapper seminarGroupMapper;
	@Override
	public void deleteStudentScoreGroupByTopicId(BigInteger seminarGroupTopicId) {
		// TODO Auto-generated method stub
		seminarGroupMapper.deleteStudentScoreGroupByTopicId(seminarGroupTopicId);
	}

	@Override
	public SeminarGroup getSeminarGroupBySeminarGroupId(BigInteger seminarGroupId)
			throws GroupNotFoundException, IllegalArgumentException {
		// TODO Auto-generated method stub
		return seminarGroupMapper.getSeminarGroupBySeminarGroupId(seminarGroupId);
	}

	@Override
	public List<SeminarGroup> listSeminarGradeByCourseId(BigInteger userId, BigInteger courseId) {
		// TODO Auto-generated method stub
		return seminarGroupMapper.listSeminarGradeByCourseId(userId, courseId);
	}

	@Override
	public void insertGroupGradeByUserId(BigInteger topicId, BigInteger userId, BigInteger groupId, BigInteger grade) {
		// TODO Auto-generated method stub
		
		
		seminarGroupMapper.insertGroupGradeByUserId(topicId, userId, groupId, grade);
	}

	@Override
	public void updateGroupByGroupId(BigInteger seminarGroupId, BigInteger grade) {
		// TODO Auto-generated method stub
		seminarGroupMapper.updateGroupByGroupId(seminarGroupId, grade);
	}

	@Override
	public void updateGroupReportGradeByGroupId(BigInteger seminarGroupId, BigInteger grade) {
		// TODO Auto-generated method stub
		seminarGroupMapper.updateGroupReportGradeByGroupId(seminarGroupId, grade);
	}

	@Override
	public void updateGroupFianlGradeByGroupId(BigInteger seminarGroupId,BigInteger grade) throws IllegalArgumentException, GroupNotFoundException {
		// TODO Auto-generated method stub
		SeminarGroup seminarGroup=getSeminarGroupBySeminarGroupId(seminarGroupId);
		int finalGrade=seminarGroup.getReportGrade()+seminarGroup.getPresentationGrade();
		BigInteger bigfinalGrade=new BigInteger(String.valueOf(finalGrade));
		seminarGroupMapper.updateGroupFianlGradeByGroupId(seminarGroupId, bigfinalGrade);
	}
	
   
}
