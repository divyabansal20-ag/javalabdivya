
#include<stdio.h>

int main() {

    int n=153;
    int temp=n;
    int r,sum=0;

    while(n>0) {

        r=n%10;
        sum=sum+r*r*r;
        n=n/10;

    }

    if(sum==temp)

        printf("Armstrong Number");

    else

        printf("Not Armstrong");

    return 0;
}