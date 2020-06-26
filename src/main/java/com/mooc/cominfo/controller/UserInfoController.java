package com.mooc.cominfo.controller;

import com.mooc.cominfo.constant.RedisConstant;
import com.mooc.cominfo.dataobject.UserInfo;
import com.mooc.cominfo.enums.ResultEnum;
import com.mooc.cominfo.from.LoginForm;
import com.mooc.cominfo.service.UserInfoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;
import java.util.Map;
import java.util.UUID;

/**
 * @author admin
 * 员工信息的Controller
 * @Controller 注解可以控制跳转到相应的页面
 */
@Controller
@RequestMapping("/user")
@Slf4j
public class UserInfoController {
    @Autowired
    private UserInfoService userInfoService;
    @Autowired
    private StringRedisTemplate redisTemplate;

    /*登陆验证*/
    @PostMapping("/login")
    public ModelAndView login(@Validated LoginForm form,
                              BindingResult bindingResult,
                              HttpServletResponse response,
                              Map<String, Object> map) {

        if (bindingResult.hasErrors()) {
            /*传入的参数不符合规范,返回错误信息*/
            map.put("msg", bindingResult.getFieldError().getDefaultMessage());
            map.put("url", "/cominfo/user/loginView");
            return new ModelAndView("common/loginView", map);
        }
        UserInfo result = userInfoService.check(form.getPhoneNumber(), form.getPasswords());
        if (result == null || result.equals("")) {
            /*登陆人员不存在，返回错误信息*/
            map.put("msg", ResultEnum.USER_NOT_EXIST.getMsg());
            map.put("url", "/cominfo/user/loginView");
            return new ModelAndView("common/loginView", map);
        }
        /*设置token至redis,opsforValue()表示拿到操作*/
        String token = UUID.randomUUID().toString();
        Integer expire=RedisConstant.EXPIRE;
        //TODO 设置四个变量值，依次为redis的key值，value值，过期时间，时间单位
        return null;
    }

    /*修改密码*/
    @PostMapping("/update")
    public ModelAndView update(@RequestParam("passwords") String passwords) {
        //TODO 去session 或者redis中获取电话号码
        String phoneNumber = "15102052326";
        if (passwords == null || passwords.isEmpty()) {
            //返回密码为空
            return null;
        }
        UserInfo result = userInfoService.update(phoneNumber, passwords);
        //TODO 修改成功之后的跳转操作应该交由控制层
        if (result != null) {

        }
        return null;
    }

    /*登陆界面*/
    @GetMapping("/loginView")
    public ModelAndView loginView() {
        return new ModelAndView("common/loginView");
    }

}
