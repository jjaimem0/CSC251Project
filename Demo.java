import java.util.Scanner; // Needed in order to be able to use the Scanner class to get the user's input

public class Demo
{
   public static void main(String[] args)
   {
      Scanner key = new Scanner(System.in); //create a Scanner object to get the user's input
      
      //variables
      String poliNumber;
      String providerName;
      String poliHoldName;
      String poliHoldLastName;
      int poliHoldAge;
      String smokingStatus;
      double poliHoldHeight;
      double poliHoldWeight;
                  
      System.out.print("Please enter the Policy Number: ");
      poliNumber = key.nextLine();
      
      System.out.print("Please enter the Provider Name: ");
      providerName = key.nextLine();
      
      System.out.print("Please enter the Policyholder's First Name: ");
      poliHoldName = key.nextLine();
      
      System.out.print("Please enter the Policyholder's Last Name: ");
      poliHoldLastName = key.nextLine();
      
      System.out.print("Please enter the Policyholder's Age: ");
      poliHoldAge = key.nextInt();
      
      key.nextLine();
      
      System.out.print("Please enter the Policyholder's Smoking Status (smoker/non-smoker): ");
      smokingStatus = key.nextLine();
      
      System.out.print("Please enter the Policyholder's Height (in inches): ");
      poliHoldHeight = key.nextDouble();
      
      System.out.print("Please enter the Policyholder's Weight (in pounds): ");
      poliHoldWeight = key.nextDouble();
      
      Policy pHolder = new Policy(poliNumber, providerName, poliHoldName, poliHoldLastName, poliHoldAge, smokingStatus, poliHoldHeight, poliHoldWeight);
                  
      System.out.println();
      
      System.out.println("Policy Number: " + pHolder.getPolicyNumber());
      System.out.println("Provider Name: " + pHolder.getProviderName());
      System.out.println("PolicyHolder's First Name: " + pHolder.getPoliHoldName());
      System.out.println("PolicyHolder's Last Name: " + pHolder.getPoliHoldLastName());
      System.out.println("PolicyHolder's Age: " + pHolder.getPoliHoldAge());
      System.out.println("PolicyHolder's Smoking Status: " + pHolder.getPoliHoldSmokingStatus());
      System.out.println("PolicyHolder's Height: " + pHolder.getPoliHoldHeight());
      System.out.println("PolicyHolder's Weight: " + pHolder.getPoliHoldWeight());
      System.out.printf("Policyholder's BMI: %.2f\n", pHolder.getBMI());
      System.out.printf("Policy Price: $%.2f\n", pHolder.getPrice());
   }// main ends
}// public class Demo ends