package com.test360.Function;

import com.test360.littlemealutil.MessageUtil;
import com.test360.wxmsg.TextMessage;
import org.dom4j.DocumentException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

/**
 * Created by IvenJow_1014 on 2016/3/21.
 * 文本消息自动回复
 */
public class MessageReply {
    public void reply(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");
        PrintWriter out = resp.getWriter();
        try {
            //获取
            Map<String ,String> map = MessageUtil.xmlToMap(req);
            String fromUserName = map.get("FromUserName");
            String toUserName = map.get("ToUserName");
            String msgType = map.get("MsgType");
            String content = map.get("Content");

            String message = null;
            //发送
            if("text".equals(msgType)) {
                TextMessage textMessage = new TextMessage();
                textMessage.setFromUserName(toUserName);
                textMessage.setToUserName(fromUserName);
                textMessage.setMsgType("text");
                textMessage.setCreateTime(new SimpleDateFormat("yyyy-mm-dd").format(new Date().getTime()));
                if(content.matches("#\\d{11}#"))
                    textMessage.setContent("您已成功绑定");
                else
                    textMessage.setContent("请输入您的手机号进行绑定\n格式：#手机号#");
                message = MessageUtil.textToXml(textMessage);
            }
            out.print(message);
        }catch (DocumentException e) {
            e.printStackTrace();
        }finally {
            out.close();
        }

    }
}
