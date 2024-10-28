package com.atguigu01.selfdefine.exer1;

import java.util.*;

public class DAO<T>{

    Map<String,T> map;

    {
        map = new HashMap<>();
    }


    public void save(String id,T enity){//保存T类型到MAP成员变量中
        if(!map.containsKey(id)) {
            map.put(id, enity);
        }
    }
    public T get(String id){
        return map.get(id);
    }
    public void update(String id,T enity){//替换Map 中key为id的内容，改为entity 对象
        if(map.containsKey(id)){
        map.put(id,enity);
        }
    }
    public List<T> list(){ //返回map中的T对象
        Collection<T> valuse = map.values();
        ArrayList<T> list = new ArrayList<>(valuse);

        return list;

    }
    public void delete(String id){
        map.remove(id);
    }



}
