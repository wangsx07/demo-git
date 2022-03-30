package com.controler;


import com.sobot.utils.GeneralDto;
import com.sobot.utils.JsonResponseUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class HeartbeatController {

    /**
     * 健康状态监测
     * @param request
     * @param response
     * @param ver
     */
    @RequestMapping(value = "heart_beat/{ver}",method= RequestMethod.GET)
    public void heartBeat(HttpServletRequest request,
                          HttpServletResponse response, @PathVariable Long ver) {
        GeneralDto<String> gendto = new GeneralDto<String>();
        try {
            gendto.setRetCode("000000");
        } catch (Exception e) {
            gendto.setRetCode("999999");
            e.printStackTrace();
        } finally {
            JsonResponseUtil.write(response, gendto);
        }
    }

}