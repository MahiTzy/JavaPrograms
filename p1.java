    // Write a java program to take day number as input and display day of week
    import java.util.*;
    class p1
    {
    public static void main(String [] args)
    {
      int dno;
      Scanner s=new Scanner(System.in);
      System.out.print("Enter day no : ");
      dno=s.nextInt();
      switch(dno)
      {
        case 1:
        System.out.println("Sunday");
        break;
        case 2:
        System.out.println("Monday");
        break;
        case 3:
        System.out.println("Tuesday");
        break;
        case 4:
        System.out.println("Wednesday");
        break;
        case 5:
        System.out.println("Thursday");
        break;
        case 6:
        System.out.println("Friday");
        break;
        case 7:
        System.out.println("Saturday");
        break;
        default:
	System.out.println("Invalid day number");
	break;
       }
      }
     }