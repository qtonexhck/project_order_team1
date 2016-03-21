package com.test360.controller;

import com.test360.Function.MessageReply;
import com.test360.littlemealutil.AccessVerify;
import com.test360.littlemealutil.MessageUtil;
import com.test360.wxmsg.TextMessage;
import org.dom4j.DocumentException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

/**
 * Created by IvenJow_1014 on 2016/3/20.
 */
@Controller
@RequestMapping(value = "/littlemeal/wx/access.do")
public class WeiXinAccess {
    /**
     * get方法交互
     *
     * @throws ServletException
     * @throws IOException
     */
    @ResponseBody
    @RequestMapping(method = {RequestMethod.GET})
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //进行接入验证
        AccessVerify.verify(req,resp);
    }

    /**
     * post方法交互
     */
    @ResponseBody
    @RequestMapping(method = {RequestMethod.POST})
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        MessageReply reply = new MessageReply();
        reply.reply(req,resp);
    }
}