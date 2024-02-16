import java.util.Arrays;
public class Exercise {
  public static int[] removeDuplicates(int[] arr) {
    //   TODO
    int i,j;
    int isDuplicates = 0;
    int[] newA = new int[5];
    for(i=0;i<=arr.length+1;i++)
    {
      for(j=1;j<=arr.length;j++)
      {
        if(arr[i]==arr[j])
        {
            newA[j-1]=arr[i];
        }
      }
    }
    return newA;
  }
}