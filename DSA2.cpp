#include<bits/stdc++.h>
using namespace std;
#define size 50



int main(){
    int i,j;
    char infix[100],postfix[100];
    cout<<"enter infix expression"<<endl;
    cin>>infix;
    i=0;
while(infix[i++]!='\0');
infix[i+1]='\0';
infix[i--]=')';
while(i>0){
    infix[i]=infix[i-1];
}
infix[i]='(';
 





    return 0;
}

