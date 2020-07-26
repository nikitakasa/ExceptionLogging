package com.ArutlaHarish.CleanCodeExample;

import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
class InputReader
{
  String materialStandard;
  int totalArea;
  InputReader()
  {
      materialStandard=null;
      totalArea=0;
  }
  
  void readInput()
  {
	  Logger logger=LogManager.getFormatterLogger(InputReader.class);
	  logger.info("Entered in to InputReader");
      Scanner scanner = new Scanner(System.in);
      System.out.println("Enter the  Material Standard");
      this.materialStandard=scanner.nextLine();
      System.out.println("Enter the Total Area in Square feet");
      this.totalArea=scanner.nextInt();
  }
  String getStandard()
  {
        return  this.materialStandard;
  }
  int getTotalArea()
  {
      return this.totalArea;
  }



}