public class Main {
    static class Product{

        public int product(int x, int y) {
            return x+y;
        }

        public int product(int x, int y, int z) {
            return x+y+z;
        }

        public double product(double x, double y) {
            return x+y;
        }

    }
    public static void main(String[] args) {
        Product p = new Product();
        p.product(1,2);
        p.product(20,30,40);
        p.product(2.34,5.55);
    }
}
