public class StringReverse {

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

    //reversing string without extra space
    String s1 =" My name is Dhanush";
    char[] s = s1.toCharArray();
    System.out.println(reverseWords(s));

    //reversing string with extra space
    String s2 =" My name is Dhanush";
    int length = s2.length();
    String[] str = s1.split(" ");
    s2="";
    for(int i=str.length-1;i>0;i--) {
        s2 = s2+str[i]+" ";
    }
    System.out.println("----");
    s2 = s2.substring(0, length-1);
    System.out.println(s2);
    

}
    
}
