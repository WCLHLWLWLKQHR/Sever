package xmu.crms.view;

import static org.springframework.web.bind.annotation.RequestMethod.*;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.Response;

import xmu.crms.entity.*;
import xmu.crms.view.vo.*;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MeController {

    @RequestMapping(value = "/me", method = GET)
    @ResponseBody
    public User getCurrentUser(HttpServletResponse response) {
        User user = new User();
        user.setId(3486);
        user.setType("teacher");
        user.setName("张三");
        user.setNumber("24321432534");
        user.setPhone("18159215806");
        user.setEmail("2332015202333@stu.xmu.edu.cn");
        user.setGender("male");
        School school = new School(32, "厦门大学");
        user.setSchool(school);
        user.setTitle("教授");
        user.setAvatar("/avatar/3486.png");
        response.setStatus(200);
        return user;
    }

    @RequestMapping(value = "/me", method = PUT)
    public Response uodateCurrentUser(User user, HttpServletResponse response) {
        response.setStatus(204);
        return null;
    }

    @RequestMapping(value = "/signin", method = GET)
    @ResponseBody
    public UserVO signinWechat(HttpServletResponse response) {
        UserVO userVO = new UserVO(3486,"student","张三",
                "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJjaWQiOiJPQTAwMDEiLCJpYXQiOjE0ODI2NTcyODQyMjF9.TeJpy936w610Vrrm+c3+RXouCA9k1AX0Bk8qURkYkdo=");
        response.setStatus(200);
        return userVO;
    }

    @RequestMapping(value = "/signin", method = POST)
    @ResponseBody
    public UserVO signinPassword(User user, HttpServletResponse response) {
        UserVO userVO = new UserVO(3486, "student", "张三",
                "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJjaWQiOiJPQTAwMDEiLCJpYXQiOjE0ODI2NTcyODQyMjF9.TeJpy936w610Vrrm+c3+RXouCA9k1AX0Bk8qURkYkdo=");
        response.setStatus(200);
        return userVO;
    }

    @RequestMapping(value = "/register", method = POST)
    @ResponseBody
    public UserVO registerPassword(PasswordVO passwordVO, HttpServletResponse response) {
        UserVO userVO = new UserVO(3486, "unbinded", "",
                "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJjaWQiOiJPQTAwMDEiLCJpYXQiOjE0ODI2NTcyODQyMjF9.TeJpy936w610Vrrm+c3+RXouCA9k1AX0Bk8qURkYkdo=");
        response.setStatus(200);
        return userVO;
    }
}
