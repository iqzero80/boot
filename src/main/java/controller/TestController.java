package controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@ComponentScan
@Controller
@EnableAutoConfiguration
public class TestController extends SpringBootServletInitializer {
    public static void main(String[] args) {
        SpringApplication.run(TestController.class, args);
    }

    @RequestMapping("/")
    public String hello(Map<String, Object> model) {
        System.out.println("hello");
        model.put("name", "jinwoo");
        return "hello";
    }

    @RequestMapping("/test")
    public String test() {
        System.out.println("test");
        return "test";
    }

    @RequestMapping("/test2")
    @ResponseBody
    public HashMap<String, Object> test2() {
        System.out.println("test2");
        HashMap<String, Object> ret = new HashMap<String, Object>();
        ret.put("status", "0");
        return ret;
    }
}
