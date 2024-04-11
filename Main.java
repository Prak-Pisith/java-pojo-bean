import java.io.*;


public class Main {
    public static void main(String[] args) {

        JavaPojo javaPojo = new JavaPojo();
        System.out.println("Java Pojo ==>");
        System.out.println(javaPojo);

        JavaBean javaBean = new JavaBean();
        System.out.println("Java Bean ==>");
        System.out.println(javaBean);

    }
}

// Java - Pojo
class JavaPojo {
    private int number;
    private String text;

    @java.lang.Override
    public java.lang.String toString() {
        return "JavaPojo{" +
                "number=" + number +
                ", text='" + text + '\'' +
                '}';
    }
}

// Java - Bean / EJB
class JavaBean implements Serializable {
    private int number;
    private String text;

    /*
    Required:
     * public No-arg constructor
     * getter & setter
     * serializable
     */
    public JavaBean() {}

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "JavaBean{" +
                "number=" + number +
                ", text='" + text + '\'' +
                '}';
    }
}