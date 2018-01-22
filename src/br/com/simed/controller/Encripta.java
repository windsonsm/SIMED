/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.simed.controller;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 *
 * @author windsonsm
 */
public class Encripta {

    public static String criptografarSenha(String senha) {

        String sen = "";

        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            BigInteger hash = new BigInteger(1, md.digest(senha.getBytes()));
            sen = hash.toString(32);
        } catch (NoSuchAlgorithmException e) {
        }

        return sen;
    }  

}
