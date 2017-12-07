package xmu.crms.view.vo;

public class CourseVO {
    private int id;
    private String name;

    public CourseVO() {
    }

    public CourseVO(int id, String name) {
        this.id = id;
        this.name = name;
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

    @Override
    public String toString() {
        return "CourseVO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
