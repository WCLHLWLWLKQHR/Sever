package xmu.crms.entity;

public class Grade {
    private int topicId;
    private int grade;

    public Grade() {
    }

    public Grade(int topicId, int grade) {
        this.topicId = topicId;
        this.grade = grade;
    }

    public int getTopicId() {
        return topicId;
    }

    public void setTopicId(int topicId) {
        this.topicId = topicId;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
}
