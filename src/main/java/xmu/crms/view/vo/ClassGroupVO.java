package xmu.crms.view.vo;

import java.util.ArrayList;
import java.util.List;

public class ClassGroupVO {
    private StudentVO leader;
    private List<StudentVO> members;

    public ClassGroupVO() {
        members = new ArrayList<StudentVO>();
    }

    public ClassGroupVO(StudentVO leader, List<StudentVO> members) {
        this.leader = leader;
        this.members = members;
    }

    public StudentVO getLeader() {
        return leader;
    }

    public void setLeader(StudentVO leader) {
        this.leader = leader;
    }

    public List<StudentVO> getMembers() {
        return members;
    }

    public void setMembers(List<StudentVO> members) {
        this.members = members;
    }
}
