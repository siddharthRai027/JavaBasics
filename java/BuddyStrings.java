public class BuddyStrings {
    public boolean buddyStrings(String s, String goal) {
        char[] str = s.toCharArray();

        for (int i = 0; i < str.length; i++) {
            for (int j = 0; j < str.length; j++) {
                while(i<2){
                    char t = str[i];
                    str[i]=str[j];
                    str[j]=t;
                   String k =new  String(str);
                    if ( k== goal) {
                        return true;
                    }
                    else{
                        return false;
                    }
                }
            }
        }
        return true;
    }


    public static void main(String[] args) {
        BuddyStrings bs = new BuddyStrings();
        System.out.println(bs.buddyStrings("aa", "aa"));
    }
}