package xmu.crms.view.vo;

import java.util.ArrayList;
import java.util.List;

public class SeminarByIdVO {
    private int id;
    private String name;
    private String description;
    private String groupingMethod;
    private String startTime;
    private String endTime;
    private List<TopicVO> topics;

    public SeminarByIdVO() {
        topics = new ArrayList<TopicVO>();
    }

    public SeminarByIdVO(int id, String name, String description, String groupingMethod,
                         String startTime, String endTime, List<TopicVO> topics) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.groupingMethod = groupingMethod;
        this.startTime = startTime;
        this.endTime = endTime;
        this.topics = topics;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getGroupingMethod() {
        return groupingMethod;
    }

    public void setGroupingMethod(String groupingMethod) {
        this.groupingMethod = groupingMethod;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public List<TopicVO> getTopics() {
        return topics;
    }

    public void setTopicVOList(List<TopicVO> topics) {
        this.topics = topics;
    }
}
