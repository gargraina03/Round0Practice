package com.company;

public class nextSmallestPalindrome {
public void NSP(long num){
    int len = (int)(Math.log10(num)+1);  //optimised way of calculating the length
    long[] parr = new long[len];
    int i = 0;

    while(num!=0){
        parr[len-1-i] = num%10;
        num = num/10;
        i = i+1;
    }
    int mididx = (int)(len/2);
    //handling the same number in the niddle case

    long oldmid,newmid;


    if(len%2==0){
         oldmid = parr[mididx];
    }else{
        oldmid = parr[mididx+1];

    }

    for(int j = 0;j<len;j++){
        System.out.print(parr[j]+" ");

    }

    System.out.println("\n old middle element is:"+oldmid);

    for(int k = 0;k<len;k++){
        parr[len-1-k] = parr[k];
    }
    for(int j = 0;j<len;j++){
        System.out.print(parr[j]+" ");

    }
    if(parr[mididx]==parr[mididx-1]){
        parr[mididx] += 1;
        parr[mididx - 1] += 1;
    }

    if(len%2==0){
        newmid = parr[mididx];
    }else{
        newmid = parr[mididx+1];

    }

    System.out.println("\n new middle element is:"+newmid);


    if (newmid < oldmid&&(len%2==0)) {
        parr[mididx] += 1;
        parr[mididx - 1] += 1;
    }else if(newmid<oldmid&&(len%2==1)){
        parr[mididx]+=1;
    }




    for(int j = 0;j<len;j++){
        System.out.print(parr[j]+" ");

    }

    }


}
