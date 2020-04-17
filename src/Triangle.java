class Triangle {
    double a;
    double b;
    double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    void showInfo(){
        System.out.println("Trójkąt o zadeklarowanych bokach: " + a + ", " + b + ", " + c);
    }
}
