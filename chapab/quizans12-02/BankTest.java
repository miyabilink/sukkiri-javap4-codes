import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class BankTest {
  // (1)正常系：「ミヤビ」をセットできるか
  @Test public void setName() {
    Bank b = new Bank();
    b.setName("ミヤビ");
  }
  // (2)異常系：nullをセットしようとしたら例外が起きるべき
  @Test public void getNameWithNull() {
    try {
      Bank b = new Bank();
      b.setName(null);
    } catch (NullPointerException e) {
      return;
    }
    fail();
  }
  // (3)異常系：２文字をセットしようとしたら例外が起こるべき
  @Test
  public void throwsExceptionWithTwoName() {
    Bank b = new Bank();
    assertThrows(IllegalArgumentException.class, () -> { b.setName("ミヤ");});
  }
  /* 練習12-2の解答ここから */
  // (4)正常系：セットした内容を取得できるか
  @Test public void getName() {
    Bank b = new Bank();
    b.setName("ミヤビ");
    assertEquals("ミヤビ", b.getName());
  }
  /* 練習12-2の解答ここまで */
}
