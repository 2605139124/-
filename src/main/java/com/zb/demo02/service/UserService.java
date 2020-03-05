package com.zb.demo02.service;

import java.util.List;
import java.util.Map;


public interface UserService {
    List<Map> list(Map map);


    public List<Map> getAllRoles();
    public  int save(Map map);
}
