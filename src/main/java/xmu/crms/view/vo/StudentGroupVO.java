package xmu.crms.view.vo;

import java.util.ArrayList;
import java.util.List;

public class StudentGroupVO {
    private int id;
    private String name;
    private MemberVO leader;
    private List<MemberVO> members;
    private List<TopicVO> topics;

    public StudentGroupVO() {
        members = new ArrayList<MemberVO>();
        topics = new ArrayList<TopicVO>();
    }

    public StudentGroupVO(int id, String name, MemberVO leader,
                          List<MemberVO> members, List<TopicVO> topics) {
        this.id = id;
        this.name = name;
        this.leader = leader;
        this.members = members;
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
}
