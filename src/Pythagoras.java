class Pythagoras {
    boolean isRightTriangle(Triangle triangle){
        double squareA = triangle.a*triangle.a;
        double squareB = triangle.b*triangle.b;
        double squareC = triangle.c*triangle.c;

        if (squareA + squareB == squareC)
            return true;
        else
            return false;
    }
}
