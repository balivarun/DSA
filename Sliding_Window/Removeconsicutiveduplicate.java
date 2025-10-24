package Sliding_Window;

public class Removeconsicutiveduplicate {

  public static String removeDuplicates(String s) {
    int n = s.length();
    StringBuilder sb = new StringBuilder();

    if (n == 0) {
      return sb.toString();
    }

    for (int i = 0; i < n - 1; i++) {
      if (s.charAt(i) != s.charAt(i + 1)) {
        sb.append(s.charAt(i));
      }
    }
    sb.append(s.charAt(n-1));
    return sb.toString();

  }

  public static void main(String[] args) {
    String s2 = "aabcca";
    System.out.println(removeDuplicates(s2));
  }
}
