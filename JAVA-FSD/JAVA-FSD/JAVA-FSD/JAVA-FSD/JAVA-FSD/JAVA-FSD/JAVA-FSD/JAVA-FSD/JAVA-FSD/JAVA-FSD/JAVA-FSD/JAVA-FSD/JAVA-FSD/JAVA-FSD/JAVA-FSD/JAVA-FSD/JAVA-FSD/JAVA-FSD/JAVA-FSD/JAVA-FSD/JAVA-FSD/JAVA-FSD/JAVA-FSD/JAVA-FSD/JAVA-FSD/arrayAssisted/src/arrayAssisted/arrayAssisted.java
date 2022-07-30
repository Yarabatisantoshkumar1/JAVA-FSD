package arrayAssisted;

public class arrayAssisted {

public static void main(String[] args) {

//single-dimensional array
int a[]= {11,22,33,44,55,66,77,88};
for(int j=0;j<8;j++) {
System.out.println("Elements of array a: "+a[j]);
}


//multidimensional array
int[][] e = {
            {2, 4, 6, 8, 10}, 
            {3, 6, 9, 12} };
      
      System.out.println("\nLength of row 1: " + e[0].length);
      }
}

