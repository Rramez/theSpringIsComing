package com.example.thespringiscoming;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.stereotype.Component;

@Component
public class Jcpc {
    private Dp dp;
    private NumberTheory nth;
    private Graphs graphs;
    @Autowired
    public Jcpc (Dp dp , NumberTheory nth , Graphs graphs){
        this.dp = dp;
        this.nth = nth;
        this.graphs = graphs;
    }

}