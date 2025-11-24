package com.jingtengyu.blogblogweb.controller;
import com.jingtengyu.blogblogmodule.common.enums.ResponseCodeEnum;
import com.jingtengyu.blogblogmodule.common.exception.BizException;
import com.jingtengyu.blogblogmodule.common.utils.JsonUtil;
import com.jingtengyu.blogblogmodule.common.utils.Response;
import com.jingtengyu.blogblogweb.model.User;
import com.jingtengyu.blogblogmodule.common.aspect.ApiOperationLog;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.stream.Collectors;

/**
 * @author: 犬小哈
 * @url: www.quanxiaoha.com
 * @date: 2023-08-10 10:34
 * @description: TODO
 **/
@Api(tags = "首页模块")
@RestController
@Slf4j
public class TestController {
    @PostMapping("/admin/test")
    @ApiOperationLog(description = "测试接口")
    public Response test(@RequestBody @Validated User user, BindingResult bindingResult) {
        log.info(JsonUtil.toJsonString(user));

        // 设置三种日期字段值
        user.setCreateTime(LocalDateTime.now());
        user.setUpdateDate(LocalDate.now());
        user.setTime(LocalTime.now());

        return Response.success(user);
    }



}
