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

    //Reversing String:
    //Method 1: - using String Buffer - uses extra space
    String revStr = "Dhanush is a";
    StringBuffer revStrBuff = new StringBuffer();
    revStrBuff.append(revStr);
    revStrBuff.reverse();
    System.out.println(revStrBuff.toString());

    System.out.println("----");
    //Reversing Lines:
    //Method 1: Boring - reversing line without extra space
    String s1 ="My name is Dhanush";
    char[] s = s1.toCharArray();
    System.out.println(reverseWords(s));

    System.out.println("----");
    //Method 2: Reversing line with extra space
    String s2 ="My name is Dhanush";
    String[] str = s2.split(" ");
    s2="";
    for(int j=str.length-1;j>=0;j--) {
        s2 = s2+str[j]+" ";
    }
    System.out.println(s2.trim());
}
    
}
