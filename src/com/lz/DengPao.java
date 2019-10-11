package com.lz;

public class DengPao {
    private boolean isGood;
    DengPao(boolean i){
        isGood = i;
    }
    public void  DianDeng()  {
        if(this.isGood==false){
            System.out.println("点亮");
            return true;
        }
        else {
            System.out.println("未点亮");
            try {
                throw new DengPaoIsBadException("灯泡是坏的");
            } catch (DengPaoIsBadException e) {
                e.printStackTrace();
            }
        }
    }
}
