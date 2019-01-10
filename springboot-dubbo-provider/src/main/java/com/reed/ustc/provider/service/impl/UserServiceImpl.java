package com.reed.ustc.provider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;

import com.reed.ustc.provider.service.UserService;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

/**
 * created by reedfan on 2019/1/10 0010
 */

@Component
@Service
public class UserServiceImpl implements UserService {
    @Override
    public List<String> getUsers() {
        return Arrays.asList("reed","fan");
    }
}
