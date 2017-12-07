package xmu.crms.view;

import static org.springframework.web.bind.annotation.RequestMethod.*;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
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
@RequestMapping("/group")
public class GroupController {

    @RequestMapping(value = "/{groupId}", method = GET)
    @ResponseBody
    public GroupByIdVO getGourpById(@PathVariable("groupId") int groupId) {
        MemberVO leader = new MemberVO(8888,"张三");
        List<MemberVO> members = new ArrayList<MemberVO>();
        MemberVO member1 = new MemberVO(5324,"李四");
        members.add(member1);
        MemberVO member2 = new MemberVO(5678,"王五");
        members.add(member2);

        List<TopicVO> topics = new ArrayList<TopicVO>();
        TopicVO topic = new TopicVO(257,"领域模型与模块");
        topics.add(topic);

        GroupByIdVO groupByIdVO = new GroupByIdVO();
        groupByIdVO.setId(28);
        groupByIdVO.setLeader(leader);
        groupByIdVO.setMembers(members);
        groupByIdVO.setTopics(topics);
        groupByIdVO.setReport("");
        return groupByIdVO;
    }

    @RequestMapping(value = "/{groupId}/resign", method = PUT)
    public Response resignGroupLeader(@PathVariable("groupId") int groupId,
                                    IdVO id,
                                    HttpServletResponse response) {
        response.setStatus(204);
        return null;
    }

    @RequestMapping(value = "/{groupId}/assign", method = PUT)
    public Response assignGroupLeader(@PathVariable("groupId") int groupId,
                                      IdVO id, HttpServletResponse response) {
        response.setStatus(204);
        return null;
    }

    @RequestMapping(value = "/{groupId}/add", method = PUT)
    public Response addGroupMember(@PathVariable("groupId") int groupId,
                                      IdVO id, HttpServletResponse response) {
        response.setStatus(204);
        return null;
    }

    @RequestMapping(value = "/{groupId}/remove", method = PUT)
    public Response removeGroupMember(@PathVariable("groupId") int groupId,
                                      IdVO id, HttpServletResponse response) {
        response.setStatus(204);
        return null;
    }

    @RequestMapping(value = "/{groupId}/topic", method = POST)
    public String selectTopc(@PathVariable("groupId") int groupId,
                                   IdVO id, HttpServletResponse response) {
        String url = "/group/27/topic/23";
        response.setStatus(201);
        return url;
    }

    @RequestMapping(value = "/{groupId}/topic/{topicId}", method = DELETE)
    public Response deleteTopic(@PathVariable("groupId") int groupId,
                               @PathVariable("topicId") int topicId,
                               HttpServletResponse response) {
        response.setStatus(204);
        return null;
    }

    @RequestMapping(value = "/{groupId}/grade", method = GET)
    @ResponseBody
    public SeminarGrade getGradeByGroupId(@PathVariable("groupId") int groupId,
                                          HttpServletResponse response) {
        List<Grade> presentationGrade = new ArrayList<Grade>();
        presentationGrade.add(new Grade(257,4));
        presentationGrade.add(new Grade(258,5));
        SeminarGrade seminarGrade = new SeminarGrade();
        seminarGrade.setPresentationGrade(presentationGrade);
        seminarGrade.setReportGrade(3);
        seminarGrade.setGrade(4);
        response.setStatus(200);
        return seminarGrade;
    }

    @RequestMapping(value = "/{groupId}/grade/report", method = PUT)
    public Response finalGradeByGroupId(@PathVariable("groupId") int groupId,
                                          ReportGradeVO reportGrade,
                                          HttpServletResponse response) {
        response.setStatus(204);
        return null;
    }

    @RequestMapping(value = "/{groupId}/grade/presentation/{studentId}", method = PUT)
    public Response submitGradeByGroupId(@PathVariable("groupId") int groupId,
                                      @PathVariable("studentId") int studentId,
                                      PresentationGrade presentationGrade,
                                      HttpServletResponse response) {
        response.setStatus(204);
        return null;
    }
}
