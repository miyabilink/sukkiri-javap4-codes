import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    FileReader fr = new FileReader("rpgsave.dat");
    System.out.println("すべてのデータを読んで表示します");
    int i = fr.read();
    while (i != -1) {
      char c = (char)i;
      System.out.print(c);
      i = fr.read();
    }
    System.out.println("ファイルの末尾に到達しました");
    fr.close();
  }
}
