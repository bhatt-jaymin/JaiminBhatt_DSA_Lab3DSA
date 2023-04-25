package com.gl.nodesum.dsa3;


public class Nodes {
    public int data;
    public Nodes left;
    public Nodes right;

    public Nodes(int data) {
        this.data = data;
        left = right = null;
    }
}

