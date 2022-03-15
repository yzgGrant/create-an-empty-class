import java.io.File;

public class Cat {
    int a = 1;
    int b = 2;

    public static void main(String[] args) {
        Cat cat = new Cat();
        File file = new File("C:/Users/Administrator/Desktop/1/hello.txt");
        //你好
        //xinshijie
        //另一个分支
        System.out.println(file.exists());
    }
}
