package com.atguigu06.team.service;

import com.atguigu06.team.domain.Architect;
import com.atguigu06.team.domain.Designer;
import com.atguigu06.team.domain.Employee;
import com.atguigu06.team.domain.Programmer;

public class TeamService {
    private int counter = 1; //��memberid�Զ���ֵ��

    private final int MAX_MEMBER = 5; //�Ŷ�����Ա��

    private Programmer[] team = new Programmer[MAX_MEMBER]; //�����Ŷӵ�����

    private int total = 0;//��¼�����Ŷ��е�����

    /*
    ���ص�ǰ�Ŷӵ����ж���
     */
    public Programmer[] getTeam() {
        Programmer[] team = new Programmer[total];
        for (int i = 0; i < total; i++) {
            team[i] = this.team[i];
        }
        return team;
    }

    /**
    ���Ŷ�����ӳ�Ա
     */
    public void addMember(Employee e) throws TeamException{
        if(total >= MAX_MEMBER){
            throw new TeamException("��Ա�������޷����");
        }
        if(!(e instanceof Programmer)){
            throw new TeamException("�ó�Ա���ǿ�����Ա�����ʧ��");
        }
        Programmer p = (Programmer) e;
        Status status = p.getStatus();
        switch (status){
            case BUSY:
                throw new TeamException("��Ա���Ѿ���ĳ�Ŷӳ�Ա");
            case VOCATION:
                throw new TeamException("��Ա�������ݼ�,�޷����");
        }
        Boolean isexlist = isExlist(p);
        if(isexlist){
            throw new TeamException("��Ա���Ѿ��ڸ��Ŷ���");
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
                throw new TeamException("�Ŷ������ֻ����һ���ܹ�ʦ");
            }
        }else if(p instanceof Designer){
            if(desNum>=2){
                throw new TeamException("�Ŷ������ֻ�����������ʦ");
            }
        }else {
            if(progNum>=3){
                throw new TeamException("���Ŷ������ֻ������������Ա");
            }
        }
        //���������ִ�е���λ����ζ��P������ӵ���ǰ������
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
                //�ҵ�Ա������Ҫ�������������
                team[i].setStatus(Status.FREE);
                //Ա��member���Բ��޸�


                break;
            }
        }
        if(i == total){
            throw new TeamException("�Ҳ���ָ����memberIdԱ����ɾ��ʧ��");
        }


        for (int j = i; j < total; j++) {
            team[j] = team[j + 1];
        }


        team[--total] = null;



    }
}
