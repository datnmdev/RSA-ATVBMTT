/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ptithcm.demo_rsa;

/**
 *
 * @author MINHDAT
 */
public class Keys {
    private Key privateKey;
    private Key publicKey;

    public Keys() {
    }

    public Keys(Key privateKey, Key publicKey) {
        this.privateKey = privateKey;
        this.publicKey = publicKey;
    }
    
//    Getters and setters
    public Key getPrivateKey() {
        return privateKey;
    }

    public void Key(Key privateKey) {
        this.privateKey = privateKey;
    }

    public Key getPublicKey() {
        return publicKey;
    }

    public void setPublicKey(Key publicKey) {
        this.publicKey = publicKey;
    }
}
