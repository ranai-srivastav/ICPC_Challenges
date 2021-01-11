#include<stdio.h>
#include<iostream>
#include<cmath>

int main()
{
    #ifndef ONLINE_JUDGE
        freopen("input.txt", "r", stdin);
        freopen("output.txt", "w", stdout);
    #endif
        
    int numCases;
    scanf("%d", &numCases);
    
    for(int i = 0; i < numCases; i++)
    {
        long long num = 0;
        scanf("%lld", &num);
        printf("%d\n", (int)((sqrt(8 * num + 1)-1)*0.5));
    }
    return 0;
}