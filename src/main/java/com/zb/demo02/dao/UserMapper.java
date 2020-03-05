package com.zb.demo02.dao;

import java.util.List;
import java.util.Map;

public interface UserMapper {

    List<Map> list(Map map);

    public List<Map> getAllRoles();
    public  int save(Map map);
}
