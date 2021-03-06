package xmu.crms.view.vo;

import java.util.List;

public class SeminarCurrentVO {

    private int id;
    private String name;
    private String courseName;
    private String groupingMethod;
    private String startTime;
    private String endTime;
    private List<ClassVO> classes;

    public SeminarCurrentVO() {
    }

    public SeminarCurrentVO(int id, String name, String courseName,
                            String groupingMethod, String startTime, String endTime, List<ClassVO> classes) {
        this.id = id;
        this.name = name;
        this.courseName = courseName;
        this.groupingMethod = groupingMethod;
        this.startTime = startTime;
        this.endTime = endTime;
        this.classes = classes;
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

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
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

    public List<ClassVO> getClasses() {
        return classes;
    }

    public void setClasses(List<ClassVO> classes) {
        this.classes = classes;
    }
}
