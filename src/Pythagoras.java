import java.util.Arrays;

class Pythagoras {
    boolean isRightTriangle(Triangle triangle){
        double squareA = Math.pow(triangle.getA(),2);
        double squareB = Math.pow(triangle.getB(),2);
        double squareC = Math.pow(triangle.getC(),2);
        //Znajdz przeciwprostokątną
        double[] sides = {squareA,squareB,squareC};
        Arrays.sort(sides);

        if (sides[0] + sides[1] == sides[2])
            return true;
        else
            return false;
    }
}
