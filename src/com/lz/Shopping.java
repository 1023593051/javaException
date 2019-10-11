package com.lz;

public class Shopping {
    private DengPao dengPao;
    public Shopping(){
        dengPao = new DengPao(true);
    }

    public DengPao sellDengPao()  {
        System.out.println("卖出一个灯泡");
        return this.dengPao;
    }
}
