package com.atguigu06.team.service;

import com.atguigu06.team.domain.Architect;
import com.atguigu06.team.domain.Designer;
import com.atguigu06.team.domain.Employee;
import com.atguigu06.team.domain.Programmer;

public class TeamService {
    private int counter = 1; //给memberid自动赋值的

    private final int MAX_MEMBER = 5; //团队最大成员数

    private Programmer[] team = new Programmer[MAX_MEMBER]; //开发团队的数组

    private int total = 0;//记录开发团队中的人数

    /*
    返回当前团队的所有对象
     */
    public Programmer[] getTeam() {
        Programmer[] team = new Programmer[total];
        for (int i = 0; i < total; i++) {
            team[i] = this.team[i];
        }
        return team;
    }

    /**
    向团队中添加成员
     */
    public void addMember(Employee e) throws TeamException{
        if(total >= MAX_MEMBER){
            throw new TeamException("成员已满，无法添加");
        }
        if(!(e instanceof Programmer)){
            throw new TeamException("该成员不是开发人员，添加失败");
        }
        Programmer p = (Programmer) e;
        Status status = p.getStatus();
        switch (status){
            case BUSY:
                throw new TeamException("该员工已经是某团队成员");
            case VOCATION:
                throw new TeamException("该员工正在休假,无法添加");
        }
        Boolean isexlist = isExlist(p);
        if(isexlist){
            throw new TeamException("该员工已经在该团队中");
        }


        int progNum = 0,desNum = 0,archNum = 0;

        for (int i = 0; i < total; i++) {
            if(team[i] instanceof Architect){
                archNum++;
            } else if (team[i] instanceof Designer) {
                desNum++;
            } else if (team[i] instanceof Programmer) {
                progNum++;
            }
        }
        if (p instanceof Architect){
            if(archNum >= 1){
                throw new TeamException("团队中最多只能有一名架构师");
            }
        }else if(p instanceof Designer){
            if(desNum>=2){
                throw new TeamException("团队中最多只能有两名设计师");
            }
        }else {
            if(progNum>=3){
                throw new TeamException("该团队中最多只能有三名程序员");
            }
        }
        //代码如果能执行到此位置意味着P可以添加到当前数组中
        team[total++] = p;
        p.setMemberid(counter++);
        p.setStatus(Status.BUSY);





    }

    private Boolean isExlist(Programmer p) {
        for (int i = 0; i < total; i++) {
            if(p.getID() == team[i].getID()){
                return true;
            }
        }
        return false;
    }

    public void removeMember(int memberId)throws TeamException{
        int i = 0;
        for (; i < total; i++) {
            if(team[i].getID() == memberId){
                //找到员工，需要调整其相关属性
                team[i].setStatus(Status.FREE);
                //员工member可以不修改


                break;
            }
        }
        if(i == total){
            throw new TeamException("找不到指定的memberId员工，删除失败");
        }


        for (int j = i; j < total; j++) {
            team[j] = team[j + 1];
        }


        team[--total] = null;



    }
}
