package xmu.crms.view.vo;

public class CourseClassVO {
    private int id;
    private String name;
    private int numStudent;
    private String time;
    private String site;
    private String courseName;
    private String courseTeacher;

    public CourseClassVO() {
    }

    public CourseClassVO(int id, String name, int numStudent, String time,
                         String site, String courseName, String courseTeacher) {
        this.id = id;
        this.name = name;
        this.numStudent = numStudent;
        this.time = time;
        this.site = site;
        this.courseName = courseName;
        this.courseTeacher = courseTeacher;
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

    public int getNumStudent() {
        return numStudent;
    }

    public void setNumStudent(int numStudent) {
        this.numStudent = numStudent;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseTeacher() {
        return courseTeacher;
    }

    public void setCourseTeacher(String courseTeacher) {
        this.courseTeacher = courseTeacher;
    }
}