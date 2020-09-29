public class BodyMassIndex{

double height, weight, bmi;

public moreInput(){
  Scanner scanner = new Scanner(System.in);
  System.out.println("Please enter 'Y' or 'N'");
  boolean Y = true;
  boolean N = false; 
  if (scanner.nextBoolean() == true;
 return;

public double getUserHeight () {
  Scanner scanner = new Scanner(System.in);
  System.out.println("Please enter your height(inches)");
  userHeight = scanner.nextDouble();
    return height;
}

  public double getUserWeight() {
    System.out.println("Please enter your weight(pounds)");
    userWeight = scanner.nextDouble();
      return weight;
  }

public BMIcalculation(){

double bmi = (703 * weight) / (height * height);
  return bmi;
}
  public void displayBmiInfo() {
    System.out.println("Your BMI is: " + BodyMassIndex.bmi);
  }

  public void displayBmiStatistics() {
    String[] bmiData = new String 
    for(int i = 0; i < bmiData.size; i++) {
      system.out.println(bmi.get(i)/bmiData.size);
    }

  }
  }