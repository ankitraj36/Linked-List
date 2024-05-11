import java.util.*;
class q1
{
    public static void twoSum(int[] a, int target) 
    {
        for(int i=0; i<a.length; i++)
        {
            for(int j=0; j<a.length; j++)
            {
                if((a[i]+a[j])==target)
                    System.out.println(a[i] +" at index "+i+" + "+ a[j]+"at index "+j+" = "+ target);
            }
        }
    }
    public static void main(String args[])
    {
        int a[]={1,2,3,4,5,6,7,8,9,10}, target=12;
        twoSum(a,target);
    }
}