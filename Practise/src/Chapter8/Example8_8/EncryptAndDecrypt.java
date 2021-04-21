package Chapter8.Example8_8;

public class EncryptAndDecrypt {
    String encrypt(String sourceString, String password) {  //加密算法
        char[] p = password.toCharArray();
        int n = p.length;
        char[] c = sourceString.toCharArray();
        int m = c.length;
        for (int k = 0; k < m; k++) {
            int mima = c[k] + p[k % n];                         //加密
            c[k] = (char) mima;
        }
        return new String(c);                             //返回密文
    }

    String decrypt(String sourceString, String password) {  //解密算法
        char[] p = password.toCharArray();
        int n = p.length;
        char[] c = sourceString.toCharArray();
        int m = c.length;
        for (int k = 0; k < m; k++) {
            int mima = c[k] - p[k % n];
            c[k] = (char) mima;                               //解密
        }
        return new String(c);                              //返回明文
    }
}
