package xmu.crms.view;



import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;



import org.junit.Test;

import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;

import org.springframework.http.MediaType;

import org.springframework.test.context.junit4.SpringRunner;

import org.springframework.test.web.servlet.MockMvc;



/**

 * URL-pattern:prefix="/class"

 * @author ZDD、Huhui

 * @date 2017-12-04

 */

@RunWith(SpringRunner.class)

@WebMvcTest

public class NewControllerTest {

    @Autowired

    private MockMvc mvc;



    /**

     * 获取班级列表测试

     * URL: /class

     * httpMethod: GET

     * @throws Exception

     */

    @Test

    public void testGetClassList() throws Exception{

        mvc.perform(get("/class"))

                .andExpect(status().isOk())

                .andExpect(jsonPath("$").isArray())

                .andExpect(jsonPath("$[0]").exists())

                .andExpect(jsonPath("$[0].id").isNumber())

                .andExpect(jsonPath("$[0].name").isString())

                .andExpect(jsonPath("$[0].numStudent").isNumber())

                .andExpect(jsonPath("$[0].time").isString())

                .andExpect(jsonPath("$[0].site").isString())

                .andExpect(jsonPath("$[0].courseName").isString())

                .andExpect(jsonPath("$[0].courseTeacher").isString())

                .andDo(print());

    }
}