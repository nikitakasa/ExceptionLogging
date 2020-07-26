package com.ArutlaHarish.CleanCodeExample;
import java.util.*;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class CalculateSimpleCompound implements CompoundSimple
{
Scanner scanner;
int principle;
int interestRate;
int termOfLoan;
private static Logger LOGGER =LogManager.getLogger(CalculateSimpleCompound.class);
    CalculateSimpleCompound()
    {
        scanner = null;
        principle = 0;
        interestRate = 0;
        termOfLoan = 0;
    }

    @Override
    public float calculateSimpleInterest() {
         float simpleInterest = (principle*((float)interestRate/100)*termOfLoan)/100;
         LOGGER.info("The simple interest is calculated"+simpleInterest);
         return simpleInterest;
        }

    @Override 
    public double calculateCompoundInterest()
    {
        double compoundInterest = (double)(principle * (Math.pow((1+(double)interestRate/100),termOfLoan)))-principle;
        LOGGER.info("CompoundInterest calculated"+compoundInterest);
        return compoundInterest;        
    }
    
    @Override
    public void readInput()
    {
        scanner = new Scanner(System.in);
        System.out.println("Enter the Principle Amount ");
        principle = scanner.nextInt();
        System.out.println("Enter the Interest Rate ");
        interestRate = scanner.nextInt();
        System.out.println("Enter the Term of Loan");
        termOfLoan = scanner.nextInt();
        LOGGER.info("Successfully executed read input");
    }
        
}