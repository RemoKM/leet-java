public class NewYearChaos{

public static void main(String[] args){
  int[] a= {1 2 5 3 7 8 6 4};
  int bribe = 0;

  for(int i = 0; i< a.length; i++){

    if( a[i] > i+1+2){
      System.out.println("Chaos");
      return;
    }

    int idx = 0;
    if(idx < a[i] - 2){
      idx = a[i] -2;
    }
    for(int j = 0; j < i; j++){
      if(a[j] > a[i]){
        bribe ++;
      }
    }
  }
  System.out.println(bribe);
}



}
