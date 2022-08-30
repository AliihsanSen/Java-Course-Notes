package day32_StringBuilder;

public class C06_Replace {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Calm down");

        sb.replace(5, 10, "Up");
        System.out.println("sb = " + sb); // sb = Calm Up

        sb.replace(4, 5, "---");
        System.out.println("sb = " + sb); // sb = Calm---Up

        sb.replace(4,7," ");
        System.out.println("sb = " + sb); // sb = Calm Up

        sb.replace(5,7,"Down");
        System.out.println("sb = " + sb); // sb = Calm Down


    }
}
