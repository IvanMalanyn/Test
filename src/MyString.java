public class MyString {

    char[] chars;

    public MyString(String s) {
        this.chars = s.toCharArray();
    }

    public void printMe(){
        for (char i :chars) {
            System.out.println(i);
        }
    }
}

