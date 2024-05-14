/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;
import java.util.Scanner;
    

/**
 *
 * @author matte
 */
public class Triangle 
{
    public static void main(String[] args) 
    {
        Scanner tastiera = new Scanner(System.in);
        double lato1, lato2, lato3;
        System.out.printf("Dammi i dati del tuo triangolo. \nSe il triangolo è rettangolo e non conosci un cateto o l'ipotenusa digita 0 e io troverò per te il terzo lato. \n ");
        System.out.printf("Dimmi se il triangolo è rettangolo, ottusangolo o acutangolo: ");
        String tipoAngoli = tastiera.nextLine();
        if ("rettangolo".equals(tipoAngoli))
            {
                System.out.printf("Inserisci il primo cateto: ");
                lato1 = tastiera.nextDouble();
                System.out.printf("Inserisci il secondo cateto: ");
                lato2 = tastiera.nextDouble();
                System.out.printf("Inserisci l'ipotenusa: ");
                lato3 = tastiera.nextDouble();
            }
        else
            {
                System.out.printf("Inserisci il primo lato: ");
                lato1 = tastiera.nextDouble();
                System.out.printf("Inserisci il secondo lato: ");
                lato2 = tastiera.nextDouble();
                System.out.printf("Inserisci il terzo lato: ");
                lato3 = tastiera.nextDouble();
            }
        TriangleObjects triangolo = new TriangleObjects(lato1, lato2, lato3, tipoAngoli);
        if (TriangleMetodi.checkValidityTriangle(triangolo) == false)
        {
            System.out.printf("Il triangolo non è valido\n");
        }
        else
        {
            System.out.printf("Il triangolo è valido\n");
        }
        TriangleMetodi.typeTrianglebySide(triangolo);
    }
}
