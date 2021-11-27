public class Test {

public static char[] reverseWords(char[] s) {
    int i=0;
    for(int j=0; j<s.length; j++){
        if(s[j]==' '){
            reverse(s, i, j-1);        
            i=j+1;
        }
    }
    System.out.println(s);
 
    reverse(s, i, s.length-1);
    System.out.println(s);
 
    reverse(s, 0, s.length-1);
    System.out.println(s);

    return s;
}

public static void reverse(char[] s, int i, int j){
    while(i<j){
        char temp = s[i];
        s[i]=s[j];
        s[j]=temp;
        i++;
        j--;
    }
}  
public static void main(String[] args) {
    String s1 =" My name is Dhanush";
    char[] s = s1.toCharArray();
    String[] s2 = s1.split(" ");
    System.out.println(reverseWords(s));
}
    
}
