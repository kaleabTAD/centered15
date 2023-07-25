public class Main {
    public static void main(String[] args) {
        int []a={1,5,1,9,8};

        System.out.println(centered15(a));
    }
    static int centered15(int []a){
       int sum=0;
       for (int i=0;i<a.length;i++){
           sum=0;
           for (int j = i; j < a.length-i; j++) {
               sum+=a[j];
               if (sum>15)break;;
           }
           if (sum==15)return 1;
       }
       return 0;

    }
}