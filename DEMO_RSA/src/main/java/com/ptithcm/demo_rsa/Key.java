/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ptithcm.demo_rsa;

import java.math.BigInteger;

/**
 *
 * @author MINHDAT
 */
public class Key {
    private BigInteger x; // x là e hoặc d
    private BigInteger n;
    
//    Constructors
    public Key() {
    }

    public Key(BigInteger x, BigInteger n) {
        this.x = x;
        this.n = n;
    }

//    Getters and setters
    public BigInteger getX() {
        return x;
    }

    public void setX(BigInteger x) {
        this.x = x;
    }
    
    public BigInteger getN() {
        return n;
    }

    public void setN(BigInteger n) {
        this.n = n;
    }
}
