/*
 Write a program of calculating the result and providing grade according to the marks of the student
*/
import java.util.*;
import java.io.*;
public class task1
{
    public static void main(String[]args)
    {
        // marks[] == for taking input from the user
        int marks[]=new int[10];
        int i,j,m,total=0,max=0,min=0,count=0,comp_sub=0;
        float average;
        // flag ==true for checking the condition
        boolean flag=true;
        String subjects[]={"Hindi","English","Math","Science","General knowledge"};
        // use of scanner class for taking input at the runtime
        Scanner sn=new Scanner(System.in);
        System.out.println("*****ENTER THE MARKS*****");
        // use of for loop for taking numbers from user 
        for (i=0; i<subjects.length; i++)
        {
            System.out.printf("Enter the marks of %s:- ",subjects[i]);
            m=sn.nextInt();
            marks[i]=m;
            total+=m;
            // conditional statement
            if(i==0)
            {
                min=max=m;
            }
            else
            {
                if(m>max) max=m;
                if(m<min) min=m;
            }
        }
        for (j = 0; j < subjects.length; j++) 
        {
            if(marks[j]<33)
            {
                count++;
                if(count==1)
                {
                    comp_sub=j;
                }
            }
        }
        if(count==0)
        {
            System.out.println("Total marks is:- "+total+"/500");
            System.out.print("Enter the grade:- ");
            String grade=sn.next();
            average=(float)total/i;
            System.out.flush();
            System.out.println("Average is:- " +average);
            System.out.println("Highest score of the student is:- "+max);
            System.out.println("Minimum score of the student is:- "+min);
        }
        else
        {
            if(count==1)
            {
                System.out.println("Compartment in "+subjects[comp_sub]);
                System.out.println("Marks of "+subjects[comp_sub]+" is "+marks[comp_sub]);
            }
            else
            {
                System.out.println("Fail");
            }
        }

    }
}