package com.atguigu01.selfdefine.exer1;

import java.util.*;

public class DAO<T>{

    Map<String,T> map;

    {
        map = new HashMap<>();
    }


    public void save(String id,T enity){//����T���͵�MAP��Ա������
        if(!map.containsKey(id)) {
            map.put(id, enity);
        }
    }
    public T get(String id){
        return map.get(id);
    }
    public void update(String id,T enity){//�滻Map ��keyΪid�����ݣ���Ϊentity ����
        if(map.containsKey(id)){
        map.put(id,enity);
        }
    }
    public List<T> list(){ //����map�е�T����
        Collection<T> valuse = map.values();
        ArrayList<T> list = new ArrayList<>(valuse);

        return list;

    }
    public void delete(String id){
        map.remove(id);
    }



}
