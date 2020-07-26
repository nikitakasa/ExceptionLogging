package com.ArutlaHarish.CleanCodeExample;
import java.util.*;
class MainRunner
{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        while(true)
        {
            System.out.println("1 --- Compound and Simple Interest");
            System.out.println("2 --- Estimate Cost for House Construction");
            System.out.println("3 --- Exit");
                   
            switch(sc.nextInt())
            {
                case 1 :
                CalculateSimpleCompound calculateSimpleCompound = new CalculateSimpleCompound();
       
                calculateSimpleCompound.readInput();
                
               float simpleInterest= calculateSimpleCompound.calculateSimpleInterest();
               
                double compoundInterest=calculateSimpleCompound.calculateCompoundInterest();
                 break;
                 case 2:
                 
                 InputReader inputReader = new InputReader();
                 
                 inputReader.readInput();
                 
                 String standard=inputReader.getStandard();
                 int totaArea=inputReader.getTotalArea();
                 
                 EstimateHouseCost estimateHouseCost = new EstimateHouseCost(standard, totaArea);
                int estimatedCost= estimateHouseCost.Estimate();
                break;
                case 3:
                System.exit(0);
                default:
                break;        

            }
        }

       
        


    }
}