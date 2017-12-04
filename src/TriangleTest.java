
public class TriangleTest {

    public static void main(String[] args) {

        Triangle triangle = new Triangle(3, 4, 5);
        TriangleAnalizer analizer = new TriangleAnalizer();

        boolean sprawdzenie = analizer.isRightTriangle(triangle);
        if(sprawdzenie){
            System.out.println("Trójkąt jest prostokątny");
        } else {
            System.out.println("Trójkąt nie jest prostokątny");
        }
    }
}
