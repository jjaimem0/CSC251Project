public class Policy
{
   private String poliNumber;
   private String providerName;
   private String poliHoldName;
   private String poliHoldLastName;
   private int poliHoldAge;
   private String smokingStatus;
   private double poliHoldHeight;
   private double poliHoldWeight;
   
   // Construcotrs
   public Policy()
   {
      poliNumber = "";
      providerName = "";
      poliHoldName = "";
      poliHoldLastName = "";
      poliHoldAge = 0;
      smokingStatus = "";
      poliHoldHeight = 0.0;
      poliHoldWeight = 0.0;
      
   }//public Policy ends
   
   public Policy(String polNumber, String proName, String phName,String phLastName, int phAge, String smoStatus, double height, double weight)
   {
      poliNumber = polNumber; 
      poliHoldName = polNumber;
      providerName = proName;
      poliHoldName = phName;
      poliHoldLastName = phLastName;
      poliHoldAge = phAge;
      smokingStatus = smoStatus;
      poliHoldHeight = height;
      poliHoldWeight = weight;
   }
   
   // SETTERS //
   // SETTERS //
   public void setPoliNumber(String polNumber)
   {
      poliNumber = polNumber;
      
   }// setPolicyNumber ends
   
   public void setProviderName(String proName)
   {
      providerName = proName;
      
   }// setProviderName ends
   
   public void setPoliHoldName(String phName)
   {
      poliHoldName = phName;
      
   }// SetPoliHoldName ends
   
   public void setPoliHoldLastName(String phLastName)
   {
      poliHoldLastName = phLastName;
      
   }// setPoliHoldLastName
   
   public void setPoliHoldAge(int phAge)
   {
      poliHoldAge = phAge;
      
   }// setPoliHoldAge
   
   public void setPoliHoldSmokingStatus(String smoStatus)
   {
      smokingStatus = smoStatus;
      
   }// setSmokingStatus ends
   
   public void setPoliHoldHeight(double phHeight)
   {
      poliHoldHeight = phHeight;
      
   }// setPoliHoldHeight ends
   
   public void setPoliHoldWeight(double phWeight)
   {
      poliHoldWeight = phWeight;
      
   }// setPoliHoldWeight ends
   
   // GETTERS //
   // GETTERS //
   public String getPolicyNumber()
   {
      return poliNumber;
      
   }// getPolicyNumber ends
   
   public String getProviderName()
   {
      return providerName;
      
   }// getProviderName ends
   
   public String getPoliHoldName()
   {
      return poliHoldName;
      
   }// getPoliHoldName ends
   
   public String getPoliHoldLastName()
   {
      return poliHoldLastName;
      
   }// getPoliHoldLastName
   
   public int getPoliHoldAge()
   {
      return poliHoldAge;
      
   }// getPoliHoldAge
   
   public String getPoliHoldSmokingStatus()
   {
      return smokingStatus;
      
   }// getSmokingStatus ends
   
   public double getPoliHoldHeight()
   {
      return poliHoldHeight;
      
   }// getPoliHoldHeight ends
   
   public double getPoliHoldWeight()
   {
      return poliHoldWeight;
      
   }// getPoliHoldWeight ends
   
   /*//////////////////////////////////////////////////
   // This method Calculates the policy holders BMI. //
   // @param poliHoldWeight - policy holders weight  //
   // @param poliHoldHeight - policy holders height  //
   // @return BMI                                    //
   //////////////////////////////////////////////////*/   
   public double getBMI()
   {
      final double CONVFACTOR = 703;
      
      return (poliHoldWeight * CONVFACTOR) / (Math.pow(poliHoldHeight,2));
   } // getBMI ends
   
  /*//////////////////////////////////////////////////
  // This method Calculates the price of the policy.//
  // @param poliHoldAge - age of policy holder      //
  // @param smokingStatus - smoking status of       //
  // policy holder.                                 //
  // @param BMI - policy holders BMI                //
  // @return the price of the policy                //
  //////////////////////////////////////////////////*/   
  public double getPrice()
   {
      // variables
      final double BASE_FEE = 600;
      final double AGE_FEE = 75;
      final double SMOKE_FEE = 100;
      final double BMI_FEE = 20;
      final int AGE_LIMIT = 50;
      final int BMI_LIMIT = 35;
      
      double price = BASE_FEE;
      
      if(getPoliHoldAge() > AGE_LIMIT)
      {
         price += AGE_FEE;
      }

      if(smokingStatus.equalsIgnoreCase("SMOKER"))
      {
         price += SMOKE_FEE;
      }

      if (getBMI() > BMI_LIMIT)
      {
         price += ((getBMI() - BMI_LIMIT) * BMI_FEE);
      }

      
      return price;
   } // getPrice ends
   
}// public class policy ends