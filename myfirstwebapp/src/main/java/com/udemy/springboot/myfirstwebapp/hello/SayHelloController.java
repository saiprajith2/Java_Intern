package com.udemy.springboot.myfirstwebapp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SayHelloController {
    //"say-hello" => "Hello! What are you learning today?

    @RequestMapping("say-hello")
    @ResponseBody//The string which we have written in here will be sent as is to browser
    public String sayHello(){
        return "Hello! What are you learning today?";
    }

    @RequestMapping("say-hello-html")
    @ResponseBody//The string which we have written in here will be sent as is to browser
    public String sayHelloHtml(){
        StringBuffer sb= new StringBuffer();
        sb.append("<html>");
        sb.append("<head>");
        sb.append("<title> My First HTML Page - Changed</title>");
        sb.append("</head>");
        sb.append("<body>");
        sb.append("My first html page with body - Changed");
        sb.append("</body>");
        sb.append("</html>");

        return sb.toString();
    }
    //"say-hello-jsp" => sayHello.jsp
    //src/main/resources/META-INF/resources/WEB-INF/jsp/sayHello.jsp
    //src/main/resources/META-INF/resources/WEB-INF/jsp/welcome.jsp
    @RequestMapping("say-hello-jsp")
    //@ResponseBody - If the response body was there, it will give output as it is in return, to get html from jsp, we removed this.
    public String sayHelloJsp(){
        return "sayHello";
    }
}
