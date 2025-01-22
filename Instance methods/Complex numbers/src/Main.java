class Complex {

    double real;
    double image;

    public void add(Complex num) {
        this.real += num.real;
        this.image += num.image;
    }

    public void subtract(Complex num) {
        this.real -= num.real;
        this.image -= num.image;
    }

    public void print() {
        System.out.println(this.real + " + " + this.image + "i");
    }
}
