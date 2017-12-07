package xmu.crms.view.vo;

public class UserVO {
    private int id;
    private String type;
    private String name;
    private String jwt;

    public UserVO() {
    }

    public UserVO(int id, String type, String name, String jwt) {
        this.id = id;
        this.type = type;
        this.name = name;
        this.jwt = jwt;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJwt() {
        return jwt;
    }

    public void setJwt(String jwt) {
        this.jwt = jwt;
    }
}
