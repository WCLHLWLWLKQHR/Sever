package xmu.crms.view;

import static org.springframework.web.bind.annotation.RequestMethod.*;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import xmu.crms.entity.*;
import xmu.crms.view.vo.*;

import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.Response;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/topic")
public class TopicController {

    @RequestMapping(value = "/{topicId}", method = GET)
    @ResponseBody
    public Topic getTopicById(@PathVariable("topicId") int topicId) {
        Topic topic = new Topic();
        topic.setId(257);
        topic.setSerial("A");
        topic.setName("领域模型与模块");
        topic.setDescription("Domain model与模块划分");
        topic.setGroupLimit(5);
        topic.setGroupMemberLimit(6);
        topic.setGroupLeft(2);
        return topic;
    }

    @RequestMapping(value = "/{topicId}", method = PUT)
    public Response updateTopicById(@PathVariable("topicId") int topicId,
                                    Topic topic, HttpServletResponse response) {
        response.setStatus(204);
        return null;
    }

    @RequestMapping(value = "/{topicId}", method = DELETE)
    public Response eleteTopicById(@PathVariable("topicId") int topicId,
                                    HttpServletResponse response) {
        response.setStatus(204);
        return null;
    }

    @RequestMapping(value = "/{topicId}/group", method = GET)
    @ResponseBody
    public List<TopicGroupVO> getGroupsByTopicId(@PathVariable("topicId") int topicId) {
        List<TopicGroupVO> topicGroupVOS = new ArrayList<TopicGroupVO>();
        topicGroupVOS.add(new TopicGroupVO(23,"1A1"));
        topicGroupVOS.add(new TopicGroupVO(26,"2A2"));
        return topicGroupVOS;
    }
}
