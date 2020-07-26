package com.ArutlaHarish.CleanCodeExample;
import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
class EstimateHouseCost implements EstimateInterface
{
   
    String materialStandard;
    int totalArea;
     EstimateHouseCost(String material,int area)
     {
         materialStandard=material;
         totalArea=area;
     }

    @Override
    public int Estimate() {
          int totalCost=0;

        if(materialStandard.compareToIgnoreCase("standard")==0)
        {
            totalCost+=1200*totalArea;
        }
        else if(materialStandard.compareToIgnoreCase("above standard")==0)
        {
          totalCost+=1500*totalArea;
        }
        else if(materialStandard.compareToIgnoreCase("high standard")==0)
        {
          Scanner sc = new Scanner(System.in);
         System.out.println("Do you need a fully automated one\nYes or No");
         String choice = sc.next();
         if(choice.equals("Yes"))
            totalCost+=2500*totalArea;
         else
         totalCost+= 1800*totalArea;   
        
        }
        Logger LOGGER = LogManager.getLogger(EstimateHouseCost.class);
        LOGGER.info("Logged data");
        return totalCost;
    }
    
}