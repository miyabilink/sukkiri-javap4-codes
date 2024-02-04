public class Main{
  public static void main(String[] args) { 
    LoginHistory h = new LoginHistory("USER1", -5, true);
    System.out.println("ログインを試みたユーザー名は" + h.user());
  } 
}
