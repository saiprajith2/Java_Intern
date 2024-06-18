public class MyChar {
    private char ch;

    public MyChar(char ch){
        this.ch=ch;
    }
    public static void printLowerCaseAlphabets() {
        for(char ch='a';ch<='z';ch++){
            System.out.print(ch+" ");
        }
        System.out.println();
    }

    public static void printUpperCaseAlphabets() {
        for(char ch='A';ch<='Z';ch++){
            System.out.print(ch+" ");
        }
    }

    public boolean isVowel() {
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
            return true;
        }
        return false;
    }

    public boolean isDigit() {
        if(ch>='0' && ch<='9'){
            return true;
        }
        return false;
    }

    public boolean isAlphabet() {
        if(ch>='a' && ch<='z'){
            return  true;
        }
        if(ch>='A' && ch<='Z'){
            return  true;
        }
        return  false;
    }

    public boolean isConsonant() {
        if(isAlphabet() && !isVowel()){
            return  true;
        }
        return false;
    }
}
