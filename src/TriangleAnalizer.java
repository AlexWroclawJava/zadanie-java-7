public class TriangleAnalizer {

    public boolean isRightTriangle(Triangle triangle) {

        double bok1 = triangle.getBok1();
        double bok2 = triangle.getBok2();
        double bok3 = triangle.getBok3();

        if ((bok1 * bok1 + bok2 * bok2 == bok3 * bok3) || (bok2 * bok2 + bok3 * bok3 == bok1 * bok1) || (bok1 * bok1 + bok3 * bok3 == bok3 * bok3)) {
            return true;
        } else {
            return false;
        }
    }
}

