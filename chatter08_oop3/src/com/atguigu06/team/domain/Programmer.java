package com.atguigu06.team.domain;

import com.atguigu06.team.service.Status;

public class Programmer extends Employee{
    private int memberid; //�����Ŷ���Tid
    private Status status = Status.FREE;
    private Equipment equipment;

    public Programmer() {
    }

    public Programmer(int ID, String name, int age, double salary, Equipment equipment) {
        super(ID, name, age, salary);
        this.equipment = equipment;
    }

    public int getMemberid() {
        return memberid;
    }

    public void setMemberid(int memberid) {
        this.memberid = memberid;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Equipment getEquipment() {
        return equipment;
    }

    public void setEquipment(Equipment equipment) {
        this.equipment = equipment;
    }

    @Override
    public String toString() {
        return getDetails() + "\t����Ա\t" + status + "\t\t\t\t\t" + equipment.getDescription();
    }
}
