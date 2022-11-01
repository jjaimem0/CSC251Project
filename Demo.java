import java.util.Scanner; // Needed in order to be able to use the Scanner class to get the user's input
import java.io.*;
import java.util.ArrayList;

public class Demo
{
   public static void main(String[] args) throws IOException
   {
      //Scanner key = new Scanner(System.in); //create a Scanner object to get the user's input
      
      //variables
      String poliNumber;
      String providerName;
      String poliHoldName;
      String poliHoldLastName;
      int poliHoldAge;
      int smoker = 0, nonSmoker = 0;
      String smokingStatus;
      double poliHoldHeight;
      double poliHoldWeight;
      
      File file = new File("PolicyInformation.txt");
      if(!file.exists())
      {
         System.out.print("the File does not exist");
         System.exit(0);
      }
      
      ArrayList<Policy> policyList = new ArrayList<>();
      
      Scanner inputFile = new Scanner(file);
      while(inputFile.hasNext())
      {
         poliNumber = inputFile.nextLine();
         providerName = inputFile.nextLine();
         poliHoldName = inputFile.nextLine();
         poliHoldLastName = inputFile.nextLine();
         poliHoldAge = inputFile.nextInt();
         inputFile.nextLine();
         smokingStatus = inputFile.nextLine();
         poliHoldHeight = inputFile.nextDouble();
         poliHoldWeight = inputFile.nextDouble();
      
         Policy pHolder = new Policy(poliNumber, providerName, poliHoldName, poliHoldLastName, poliHoldAge, smokingStatus, poliHoldHeight, poliHoldWeight);
         
         policyList.add(pHolder);
         
         for (int i=0; i <policyList.size(); i++);
         {
            System.out.println("Policy Number: " + pHolder.getPolicyNumber());
            System.out.println("Provider Name: " + pHolder.getProviderName());
            System.out.println("PolicyHolder's First Name: " + pHolder.getPoliHoldName());
            System.out.println("PolicyHolder's Last Name: " + pHolder.getPoliHoldLastName());
            System.out.println("PolicyHolder's Age: " + pHolder.getPoliHoldAge());
            System.out.println("PolicyHolder's Smoking Status: " + pHolder.getPoliHoldSmokingStatus());
            System.out.println("PolicyHolder's Height: " + pHolder.getPoliHoldHeight() + " inches");
            System.out.println("PolicyHolder's Weight: " + pHolder.getPoliHoldWeight() + " pounds");
            System.out.printf("Policyholder's BMI: %.2f\n", pHolder.getBMI());
            System.out.printf("Policy Price: $%.2f\n", pHolder.getPrice());
            
            if(smokingStatus.equalsIgnoreCase("SMOKER"))
            {
               smoker++;
            }
            else
            {
               nonSmoker++;
            }
         }
      if (inputFile.hasNext()) 
      {
         inputFile.nextLine();
         inputFile.nextLine();
      }
      System.out.println();
      System.out.println("The number of policies with a smoker is: " + smoker);
      System.out.println("The number of policies with a non-smoker is: " + nonSmoker);
      
      }
      inputFile.close();
   }// main ends
}// public class Demo ends