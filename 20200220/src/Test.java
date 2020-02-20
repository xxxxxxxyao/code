//判断回文串

public class Test {

    public static boolean re(String s) {
        if (s == null) {
            return true;
        }
        s = s.toLowerCase();
        char[] ch = s.toCharArray();

        for (int left = 0, right = ch.length - 1; left < right; ) {
            while (left < right) {
                if ((ch[left] >= '0' && ch[left] <= '9') || (ch[left] >= 'a' && ch[left] <= 'z')) {
                    break;
                }
                left++;
            }
            while (left < right) {
                if ((ch[right] >= '0' && ch[right] <= '9') || (ch[right] >= 'a' && ch[right] <= 'z')) {
                    break;
                }
                right--;
            }

            if (ch[left] == ch[right]) {
                left++;
                right--;
            } else {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        String arr="A man, a plan, a canal: Panama";
        boolean a=re(arr);
        System.out.println(a);
    }
}

