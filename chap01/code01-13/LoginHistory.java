public class LoginHistory { 
  private String user; 
  private int retry; 
  private boolean result; 

  public LoginHistory(String user, int retry, boolean result) { 
    this.user = user; 
    this.retry= retry; 
    this.result= result; 
  }  

  // 3フィールドのgetter宣言（省略） 
  // toString()をオーバーライド（省略） 
  // equals()をオーバーライド（省略） 
  // hashCode()をオーバーライド（省略） 
} 