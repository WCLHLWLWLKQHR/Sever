package xmu.crms.view;

import static org.springframework.web.bind.annotation.RequestMethod.*;
import xmu.crms.entity.*;
import xmu.crms.view.vo.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import javax.websocket.server.PathParam;
import javax.xml.ws.Response;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/school")
public class SchoolController {

    @RequestMapping( method = GET)
    @ResponseBody
    public List<School> getSchools(@PathParam("city") String city) {
        List<School> schools = new ArrayList<School>();
        School school1 = new School(32,"厦门大学","福建","厦门");
        schools.add(school1);
        School school2 = new School(37,"厦门软件学院","福建","厦门");
        schools.add(school2);
        return  schools;
    }

    @RequestMapping(method = POST)
    public Response createSchool(School school, HttpServletResponse response) {
        response.setStatus(201);
        return null;
    }

    @RequestMapping(value = "/province", method = GET)
    @ResponseBody
    public List<String> getProvinces() {
        List<String> provinces = new ArrayList<String>();
        provinces.add("北京");
        provinces.add("天津");
        provinces.add("河北省");
        provinces.add("澳门特别行政区");
        return provinces;
    }

    @RequestMapping(value = "/city", method = GET)
    @ResponseBody
    public List<String> getCities(@PathParam("province") String province) {
        List<String> cities = new ArrayList<String>();
        cities.add("上海");
        cities.add("厦门");
        cities.add("广东");
        cities.add("南京");
        return cities;
    }

}
