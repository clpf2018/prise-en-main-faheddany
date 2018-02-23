/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.isae.glg204.tp1;

/**
 *
 * @author daf
 */
public class MainClass {
    
    public static void main(String[] args) {
        Client.ClientBuilder cb = new Client.ClientBuilder("1", "Dany", "Fahed").etat("Celibataire").pays("Liban");
        Client client = new Client(cb);
        
        System.out.print(client.getPrenom()+ " " + client.getNom() + " du " + client.getPays());
    }
}
