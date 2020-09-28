package com.atguigu.bigdata.test;


public class Java14_ObjectEq {
    public static void main(String[] args) {
        User14 user1 = new User14();
        User14 user2 = new User14();
        boolean equals = user1.equals(null);
        System.out.println(equals);
    }
}
class User14{
    private int id;
    private String name;

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public boolean equals(Object o){
        if(o instanceof User14){
            User14 otherUser = (User14)o;
            return this.id == otherUser.id;
        }else{
            return false;
        }
    }
}