package com.hl.magic.letcode.controller;

import com.hl.magic.letcode.comman.ResponseMessage;
import com.hl.magic.letcode.comman.ResponseStatus;
import com.hl.magic.letcode.model.SystemUser;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author hl
 * @date 2020/3/14 22:07
 */
public class SystemUser3Controller {

    public ResponseMessage getUser() {
        SystemUser systemUser = new SystemUser("1", "小明", "xiaoming123");
        return new ResponseMessage(ResponseStatus.SUCCESS.getStatus(), ResponseStatus.SUCCESS.getMessage(), systemUser);
    }

    public ResponseMessage getUserList() {
        List<SystemUser> list = new ArrayList<>();
        SystemUser xiaoming = new SystemUser("1", "小明", "xiaoming123");
        SystemUser xiaoli = new SystemUser("2", "小丽", "xiaoli123");
        list.add(xiaoming);
        list.add(xiaoli);
        return new ResponseMessage(ResponseStatus.SUCCESS.getStatus(), ResponseStatus.SUCCESS.getMessage(), list);
    }

    public ResponseMessage getMap() {
        Map<String, Object> map = new HashMap<>();
        SystemUser user = new SystemUser("1", "xiaoming", "xiaomign123");
        map.put("用户信息", user);
        map.put("在干啥呢", "working");
        map.put("备注说明", "hello world");
        map.put("一串数字", 123456789);
        return new ResponseMessage(ResponseStatus.SUCCESS.getStatus(), ResponseStatus.SUCCESS.getMessage(), map);
    }
}
