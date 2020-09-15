
public static void main(String []args){
Scanner sc=new Scanner(System.in);
    int number;
   System.out.println("Enter four-digit number: ");
   number=sc.nextInt();
   System.out.println("Encrypted number is: "+encrypt(number));
   System.out.println("Decrypt cycle: "+decrypt(encrypt(number)));
}
}