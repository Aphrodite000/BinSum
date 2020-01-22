public class Solution {
    public String addBinary(String a, String b) {
        StringBuilder sb=new StringBuilder();
        int c=0;//进位
        int i=a.length()-1;
        int j=b.length()-1;
        while(i>=0||j>=0||c!=0){
            int m=i>=0 ? a.charAt(i)-'0':0;
            //如果i小于0说明a字符串已经加完了，补0处理，如果大于0则该为是几就为几
            int n=j>=0 ? b.charAt(j)-'0':0;
            //如果j小于0说明b字符串已经加完了，以后的运算补0处理
            int ch=(m+n+c)%2;//这一位应该显示的字符
            c=(m+n+c)/2;//这一位给下一位的进位
            i--;
            j--;
            //倒着插入
            sb.append(ch);
        }
        //反转
        return sb.reverse().toString();
    }
}
