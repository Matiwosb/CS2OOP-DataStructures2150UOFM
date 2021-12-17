package Homework7;

class Main {
    public static void main(String[] args) {
        int[] result = Solution(new int[]{3,2,4,3}, 2, 4);
        for(Integer res : result)
            System.out.println(res + " ");

        int[] result1 = Solution(new int[]{1,5,6}, 4, 3);
        for(Integer res : result1)
            System.out.println(res + " ");

        int[] result2 = Solution(new int[]{1,2,3,4}, 4, 6);
        for(Integer res : result2)
            System.out.println(res + " ");
    } static int[] Solution(int[] ar,int f,int m) {
        int n = ar.length;
        int den = n + f,sum=0;
        for(int i=0;i<n;i++) {
            sum += ar[i];
        }
        int rhs = m * den;
        int c=0,maxSum = 6 * f;
        rhs -= sum;
        int ans[] = {0};
        if(rhs > maxSum || rhs < 0) {
            return ans;
        }
        int chi[] = new int[f];
        while(rhs!=0) {
            if(rhs >= 5+f) {
                chi[c] = 6;
                rhs-=6;
                f--;
                c++;
            }
            else {
                rhs-=(f-1);
                chi[c++] = rhs;
                f--;
                while(f!=0) {
                    chi[c++] = 1;
                    f--;
                }
                break;
            }
        }
        return chi;
    }
}