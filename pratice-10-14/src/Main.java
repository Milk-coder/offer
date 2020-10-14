// 替换字符（空格）
public class Main {
        public static String replaceSpace(String s) {
            StringBuffer sc =new StringBuffer();
            for(int i = 0;i<s.length();i++){
                if(s.charAt(i) ==' '){
                    sc.append("%20");
                }
                else{
                    sc.append(s.charAt(i));
                }
            }
            return sc.toString();
        }

    public static void main(String[] args) {
        String s = new String( "we are happy");
        System.out.println(replaceSpace(s));
    }
    }
