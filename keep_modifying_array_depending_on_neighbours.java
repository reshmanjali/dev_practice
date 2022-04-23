// Given a zero-indexed array A consisting of N integers representing the initial test scores of a row of students, returns an array of integers representing their final test scores in the same order). There is a group of students sat next to each other in a row. Each day, students study together and take a test at the end of the day. 
// Test scores for a given student can only change once per day as follows: 
// • If a student sits immediately between two students with better scores, that student's score will improve by 1 when they take the test. 
// • If a student sits between two students with worse scores, that student's test score will decrease by 1. 
// This process will repeat each day as long as at least one student keeps changing their score. Note that the first and last student in the row never change their scores as they never sit between two students. Return an array representing the final test scores for each student once their scores fully stop changing. Test Output Example 1: Input: [1,6,3,4,3,5] Returns: [1,4,4,4,4,5] On the first day, the second student's score will decrease, the third student's score will increase, the fourth student's score will decrease by 1 and the fifth student's score will increase by 1, i.e. (1,5,4,3,4,5). On the second day, the second student's score will decrease again and the fourth student's score will increase, i.e. (1,4,4,4,4,5). There will be no more changes in scores after that.
public class MyClass {
    public static void main(String args[]) {
      int[] a = {1,6,3,4,3,5};
        sol(a);
      System.out.println("Done");
    }
    public static void sol(int[] a){
        int l=a.length;
        int c=0;
        int[] b = new int[l];
        int[] tp = new int[l];
        for(int i=0;i<=l-1;i++){
            b[i] = a[i];
            System.out.print(b[i] +" ");
            tp[i] = 0;
        }
        System.out.print("\n");
        while(true){
            c=0;
            for(int i=0;i<=l-1;i++){
                tp[i] = 0;
            }
            for(int i=1;i<=l-2;i++){
                if(a[i]<a[i+1] && a[i]<a[i-1]){
                    tp[i] -= 1;
                    c++;
                }
                else if(a[i]>a[i+1] && a[i]>a[i-1]){
                    tp[i] += 1;
                    c++;
                }
            }
            System.out.print("\n");
                for(int j=0;j<=l-1;j++){
                    a[j] += tp[j];
                    System.out.print(a[j]+" ");
                }
            if(c==0){
                break;
            }
        }
        
    }
}