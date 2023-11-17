

class Main 
{
  public static void main(String[] args) 
  {
    scanner sc = new Scanner(System.in);
	   
    int sum = 0;
    int num = 0;
    do {
      sum += num;
      System.out.println("Enter a number");
      num = sc.nextInt();
    } 
    while(num >= 0); 
	   
    System.out.println("The sum of entered positive numbers is " + sum);
    sc.close();
  }
}