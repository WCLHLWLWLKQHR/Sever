package xmu.crms.view;

import static org.springframework.web.bind.annotation.RequestMethod.*;

import xmu.crms.entity.*;
import xmu.crms.view.vo.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;

@Controller
@RequestMapping("/upload")
public class UploadController {

    @RequestMapping(value = "/avatar", method = POST)
    @ResponseBody
    public AvatarVO uploadAvatar(String file, HttpServletResponse response) {
        AvatarVO avatarVO = new AvatarVO("/avatar/3485.png");
        response.setStatus(201);
        return avatarVO;
    }
}
