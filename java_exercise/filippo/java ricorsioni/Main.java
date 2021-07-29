public class Main{
    
public static void main(String[] args){
int x=5;

System.out.println(fattoriale(x));
System.out.println(fibonacci(x));
reverse("Ahmed", 5);
}
public static int fattoriale(int n){

int fattoriale;
if( n == 0){
return fattoriale= 1;

}else{

return fattoriale = fattoriale(n-1)*n;

    }
}

//int n è la posizione che mi serve nella serie di fibonacci
public static int fibonacci(int n){
int fibonacci;
if( n == 0){
return fibonacci = 1;
}else if( n==1){

    return fibonacci=1;
}else{

    return fibonacci= fibonacci(n-1)+fibonacci(n-2);
}
}
//0 1 1 2 3 5 8 13..


public static void reverse(String s, int lunghezza){
int i = lunghezza-1; //perche lui parte da 0 
if(i==0){
    System.out.print(s.charAt(i));
}else{
    System.out.print(s.charAt(i));
    reverse(s,i);
}
}
}


