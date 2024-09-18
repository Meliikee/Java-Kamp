public class Main {
    public static void main(String[] args) {
        // Value types: bool,int,double...
        // Reference types: array,class,abstract,interface...

        int[] sayilar = new int[]{1,2,3};

        Product product1 = new Product();
        product1.setName("Laptop");
        product1.setDescription("Laptop Açıklaması");
        product1.setPrice(33800.0);

        Product product2 = new Product();
        product2.setName("Mouse");
        product2.setDescription("Mouse Açıklaması");
        product2.setPrice(1999.0);

        Product[] urunler = new Product[]{product1, product2}; // Product türünde bir array newlendi.

        for(int i=0; i<urunler.length; i++){
            System.out.println(urunler[i].getName());
            System.out.println(urunler[i].getDescription());
            System.out.println(urunler[i].getPrice());
        }
    }
}