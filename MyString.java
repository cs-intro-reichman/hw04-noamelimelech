public class MyString {
    public static void main(String[] args) {
        System.out.println("Testing lowercase:");
        System.out.println("UnHappy : " + lowerCase("UnHappy"));
        System.out.println("This costs 15 Sheksls : " + lowerCase("This costs 15 Sheksls"));
        System.out.println("TLV : " + lowerCase("TLV"));
        System.out.println("lowercase : " + lowerCase("lowercase"));

        System.out.println("Testing contains:");
        System.out.println(contains("unhappy", "happy")); // true
        System.out.println(contains("happy", "unhappy")); // false
        System.out.println(contains("historical", "story")); // false
        System.out.println(contains("psychology", "psycho")); // true
        System.out.println(contains("personality", "son")); // true
        System.out.println(contains("personality", "dad")); // false
        System.out.println(contains("resignation", "sign")); // true
    }

    /** Returns the lowercase version of the given string. */
    public static String lowerCase(String str) {
        char [] chr = str.toCharArray();
        for(int i=0; i<chr.length;i++){
            if('A' <= chr[i] && chr[i]<= 'Z'){
                chr[i] = (char) (chr[i] + 32);
            }
        }

       return new String(chr);
    }

    /** If str1 contains str2, returns true; otherwise returns false. */
    public static boolean contains(String str1, String str2) {
        int lenght1 = str1.length();
        int lenght2 = str2.length();
        char [] chr1 = str1.toCharArray();
        char [] chr2 = str2.toCharArray();
        if (lenght1<lenght2) {
            return false;
        }
        for(int i=0;i<lenght1 - lenght2 +1;i++){
            boolean match = true;
            for (int j=0;j<lenght2;j++){
                if (chr1[i+j]!=chr2[j]) {
                    match = false;
                    break;  
                }
            }
            if (match) {
                return true;

            }
            
                
            }
            return false;

        }
        
    }    

