/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author matte
 */
public class TriangleMetodi 
{

    /**
     *
     * @param triangolo
     * @return
     */
    public static boolean checkValidityTriangle(TriangleObjects triangolo)
    {
        double lato1 = triangolo.getLato1();
        double lato2 = triangolo.getLato2();
        double lato3 = triangolo.getLato3();
        String tipoAngoli = triangolo.gettypeAngle();
        double tmp;
        if ("rettangolo".equals(tipoAngoli))
            {
                if (lato1 == 0)
                    {
                        lato1 = Math.sqrt(lato3*lato3 - lato2*lato2);
                        System.out.printf("Il primo cateto vale: %f", lato1);
                        triangolo.setLato1(lato1);
                    }
            
                if (lato2 == 0)
                    {
                        lato2 = Math.sqrt(lato3*lato3 - lato1*lato1);
                        System.out.printf("Il secondo cateto vale: %f", lato2);
                        triangolo.setLato2(lato2);
                    }
            
                if (lato3 == 0)
                    {
                        lato3 = Math.sqrt(lato1*lato1 + lato2*lato2);
                        System.out.printf("L'ipotenusa vale: %f", lato3);
                        triangolo.setLato3(lato3);
                    }
            }
        if (("ottusangolo".equals(tipoAngoli)) || ("acutangolo".equals(tipoAngoli)))
           {
               if (lato1>lato2)
               {
                   if(lato1>lato3)
                   {
                       tmp = lato1;
                       lato1 = lato3;
                       lato3 = tmp;
                   }
                else
                   {
                       if(lato2>lato3)
                         {
                            tmp = lato2;
                            lato2 = lato3;
                            lato3 = tmp;
                         }
                   }
               }
               if (lato3*lato3 == lato1*lato1 + lato2*lato2)
               {
                   triangolo.settypeAngle("rettangolo");
                   System.out.printf("Il triangolo di cui mi ha dato i lati è in realta un triangolo rettangolo");
               }
           }
        return (lato1 + lato2 > lato3) && (lato1 + lato3 > lato2) && (lato3 + lato2 > lato1);
    }
    
    public static void typeTrianglebySide(TriangleObjects triangolo)
    {
        double lato1 = triangolo.getLato1();
        double lato2 = triangolo.getLato2();
        double lato3 = triangolo.getLato3();
        if ((lato1 == lato2) && (lato2 == lato3))
           {
               System.out.printf("Il triangolo di cui mi ha dato i lati è equilatero\n");
           }
        if ((lato1 == lato2) || ((lato2 == lato3)) || (lato1 == lato3)) 
           {
               System.out.printf("Il triangolo di cui mi ha dato i lati è isoscele\n");
           }
        if ((lato1 != lato2) && ((lato2 != lato3)) && (lato1!=lato3))
           {
               System.out.printf("Il triangolo di cui mi ha dato i lati è scaleno\n");
           }
    }  
}
