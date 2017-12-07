package xmu.crms.view.vo;

import java.util.ArrayList;
import java.util.List;

public class GroupByIdVO {
    private int id;
    private MemberVO leader;
    private List<MemberVO> members;
    private List<TopicVO> topics;
    private String report;

    public GroupByIdVO() {
        members = new ArrayList<MemberVO>();
        topics = new ArrayList<TopicVO>();
    }

    public GroupByIdVO(int id, MemberVO leader, List<MemberVO> members, List<TopicVO> topics, String report) {
        this.id = id;
        this.leader = leader;
        this.members = members;
        this.topics = topics;
        this.report = report;
    }

    public GroupByIdVO(int id, MemberVO leader, List<MemberVO> members, String report) {
        this.id = id;
        this.leader = leader;
        this.members = members;
        this.report = report;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public MemberVO getLeader() {
        return leader;
    }

    public void setLeader(MemberVO leader) {
        this.leader = leader;
    }

    public List<MemberVO> getMembers() {
        return members;
    }

    public void setMembers(List<MemberVO> members) {
        this.members = members;
    }

    public List<TopicVO> getTopics() {
        return topics;
    }

    public void setTopics(List<TopicVO> topics) {
        this.topics = topics;
    }

    public String getReport() {
        return report;
    }

    public void setReport(String report) {
        this.report = report;
    }
}
