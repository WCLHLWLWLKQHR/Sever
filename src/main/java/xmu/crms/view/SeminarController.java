package xmu.crms.view;

import static org.springframework.web.bind.annotation.RequestMethod.*;

import xmu.crms.entity.*;
import xmu.crms.view.vo.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.Response;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/seminar")
public class SeminarController {

    @RequestMapping(value = "/{seminarId}", method = GET)
    @ResponseBody
    public SeminarByIdVO getSeminarById(@PathVariable("seminarId") int seminarId) {
        SeminarByIdVO seminarByIdVO = new SeminarByIdVO();
        seminarByIdVO.setId(32);
        seminarByIdVO.setName("概要设计");
        seminarByIdVO.setDescription("模型层与数据库测试");
        seminarByIdVO.setGroupingMethod("fixed");
        seminarByIdVO.setStartTime("2017-10-10");
        seminarByIdVO.setEndTime("2017-10-24");
        List<TopicVO> topicVOS = new ArrayList<TopicVO>();
        topicVOS.add(new TopicVO(257,"领域模型与模块"));
        seminarByIdVO.setTopicVOList(topicVOS);
        return seminarByIdVO;
    }

    @RequestMapping(value = "/{seminarId}", method = PUT)
    public Response updateSeminarById(@PathVariable("seminarId") int seminarId,
                                      Seminar seminar, HttpServletResponse response) {
        response.setStatus(204);
        return null;
    }

    @RequestMapping(value = "/{seminarId}", method = DELETE)
    public Response deleteSeminarById(@PathVariable("seminarId") int seminarId,
                                      HttpServletResponse response) {
        response.setStatus(204);
        return null;
    }

    @RequestMapping(value = "/{seminarId}/my", method = GET)
    @ResponseBody
    public StudentSeminar getStudentSeminarById(@PathVariable("seminarId") int seminarId) {
        StudentSeminar studentSeminar = new StudentSeminar();
        studentSeminar.setId(32);
        studentSeminar.setName("概要设计");
        studentSeminar.setGroupingMethod("random");
        studentSeminar.setCourseName("OOAD");
        studentSeminar.setStartTime("2017-10-11");
        studentSeminar.setEndTime("2017-10-24");
        studentSeminar.setClassCalling(23);
        studentSeminar.setLeader(true);
        studentSeminar.setAreTopicsSelected(true);
        return  studentSeminar;
    }

    @RequestMapping(value = "/{seminarId}/detail", method = GET)
    @ResponseBody
    public SeminarDetail getSeminarDetailById(@PathVariable("seminarId") int seminarId) {
        SeminarDetail seminarDetail = new SeminarDetail();
        seminarDetail.setId(32);
        seminarDetail.setName("概要设计");
        seminarDetail.setStartTime("2017-10-10");
        seminarDetail.setEndTime("2017-10-24");
        seminarDetail.setSite("海韵201");
        seminarDetail.setTeacherName("邱明");
        seminarDetail.setTeacherEmail("mingqiu@xmu.edu.cn");
        return seminarDetail;
    }

    @RequestMapping(value = "/{seminarId}/topic", method = GET)
    @ResponseBody
    public List<Topic> getTopicsBySeminarId(@PathVariable("seminarId") int seminarId) {
        List<Topic> topics = new ArrayList<Topic>();
        Topic topic = new Topic();
        topic.setId(257);
        topic.setSerial("A");
        topic.setName("领域模型与模块");
        topic.setDescription("Domain model与模块划分");
        topic.setGroupMemberLimit(5);
        topic.setGroupMemberLimit(6);
        topic.setGroupLeft(2);
        topics.add(topic);
        return topics;
    }

    @RequestMapping(value = "/{seminarId}/topic", method = POST)
    @ResponseBody
    public int createTopicBySeminarId(@PathVariable("seminarId") int seminarId,
                                      Topic topic, HttpServletResponse response) {
        int id = 257;
        response.setStatus(201);
        return id;

    }

    @RequestMapping(value = "/{seminarId}/group", method = GET)
    @ResponseBody
    public List<GroupVO> getGroupBySeminarId(@PathVariable("seminarId") int seminarId) {
        List<GroupVO> groupVOS = new ArrayList<GroupVO>();

        List<TopicVO> topicVOS1 = new ArrayList<TopicVO>();
        topicVOS1.add(new TopicVO(257,"领域模型与模块"));
        groupVOS.add(new GroupVO(28,"1A1",topicVOS1));

        List<TopicVO> topicVOS2 = new ArrayList<TopicVO>();
        topicVOS2.add(new TopicVO(257,"领域模型与模块"));
        groupVOS.add(new GroupVO(29,"1A2",topicVOS2));

        return groupVOS;
    }

    @RequestMapping(value = "/{seminarId}/group/my", method = GET)
    @ResponseBody
    public StudentGroupVO getStudentGroupBySeminarId(@PathVariable("seminarId") int seminarId) {
        MemberVO leader = new MemberVO(8888,"张三");

        List<MemberVO> members = new ArrayList<MemberVO>();
        MemberVO member1 = new MemberVO(5324,"李四");
        MemberVO member2 = new MemberVO(5678,"王五");
        members.add(member1);
        members.add(member2);

        List<TopicVO> topics = new ArrayList<TopicVO>();
        TopicVO topic = new TopicVO(257,"领域模型与模块");
        topics.add(topic);

        StudentGroupVO studentGroupVO = new StudentGroupVO(28,"28",leader,members,topics);
        return studentGroupVO;
    }

    @RequestMapping(value = "/{seminarId}/class/{classId}/attendance", method = GET)
    @ResponseBody
    public SeminarClassAttendanceVO getSeminarClassAttendance(@PathVariable("seminarId") int seminarId,
                                                              @PathVariable("classId") int classId) {
        SeminarClassAttendanceVO seminarClassAttendanceVO = new SeminarClassAttendanceVO();
        seminarClassAttendanceVO.setNumPresent(40);
        seminarClassAttendanceVO.setNumStudent(60);
        seminarClassAttendanceVO.setStatus("calling");
        seminarClassAttendanceVO.setGroup("grouping");
        return seminarClassAttendanceVO;
    }

    @RequestMapping(value = "/{seminarId}/class/{classId}/attendance/present", method = GET)
    @ResponseBody
    public List<MemberVO> getSeminarClassPresent(@PathVariable("seminarId") int seminarId,
                                                              @PathVariable("classId") int classId) {
        List<MemberVO> members = new ArrayList<MemberVO>();
        members.add(new MemberVO(2357,"张三"));
        members.add(new MemberVO(8232,"李四"));
        return members;
    }

    @RequestMapping(value = "/{seminarId}/class/{classId}/attendance/late", method = GET)
    @ResponseBody
    public List<MemberVO> getSeminarClassLate(@PathVariable("seminarId") int seminarId,
                                              @PathVariable("classId") int classId) {
        List<MemberVO> members = new ArrayList<MemberVO>();
        members.add(new MemberVO(3412,"王五"));
        members.add(new MemberVO(5234,"王七九"));
        return members;
    }

    @RequestMapping(value = "/{seminarId}/class/{classId}/attendance/absent", method = GET)
    @ResponseBody
    public List<MemberVO> getSeminarClassAbsent(@PathVariable("seminarId") int seminarId,
                                              @PathVariable("classId") int classId) {
        List<MemberVO> members = new ArrayList<MemberVO>();
        members.add(new MemberVO(34,"张六"));
        return members;
    }

    @RequestMapping(value = "/{seminarId}/class/{classId}/attendance/{studentId}", method = GET)
    @ResponseBody
    public String updateAttendance(@PathVariable("seminarId") int seminarId,
                                   @PathVariable("classId") int classId,
                                   @PathVariable("studentId") int studentId,
                                   @RequestBody AttendanceVO attendance,
                                   HttpServletResponse response) {
        String state = "late";
        response.setStatus(200);
        return state;
    }
}
