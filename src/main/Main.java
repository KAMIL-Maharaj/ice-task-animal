/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

/**
 *
 * @author kamil
 */
public class Main {
    public static void main(String[] args) {
        Bird brd = new Bird(0, "", 0);
        Reptile rept = new Reptile(0, "", 0.0);

        System.out.println("Enter Bird's Information:");
        brd.input();

        System.out.println("Enter Reptile's Information:");
        rept.input();

        System.out.println("\nBird Information:");
        brd.output();

        System.out.println("\nReptile Information:");
        rept.output();
    }
}
