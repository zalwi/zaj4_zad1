class TestTriangles {
    public static void main(String[] args) {
        Triangle triangle1 = new Triangle(2,5,3);
        Triangle triangle2 = new Triangle(6,10,8);

        Pythagoras math = new Pythagoras();

        triangle1.showInfo();
        System.out.println("Czy jest prostokątny?: " + math.isRightTriangle(triangle1));
        triangle2.showInfo();
        System.out.println("Czy jest prostokątny?: " + math.isRightTriangle(triangle2));
    }
}
