package com.tencent.wxcloudrun.controller;

import com.tencent.wxcloudrun.config.ApiResponse;
import com.tencent.wxcloudrun.model.Activity;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/activity")
public class ActivityController {

    @PostMapping("/submit")
    public ApiResponse submit(Activity activity){
        log.info("submit:{}", activity);
        return ApiResponse.ok();
    }

}
