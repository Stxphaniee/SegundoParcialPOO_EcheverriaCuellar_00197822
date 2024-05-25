public class ConcreteBuilder1 implements Builder {
    private Product product;

    public ConcreteBuilder1() {
        product = new Product();
    }

    @Override
    public void buildPartA() {
        product.setPartA("PartA1");
    }

    @Override
    public void buildPartB() {
        product.setPartB("PartB1");
    }

    @Override
    public void buildPartC() {
        product.setPartC("PartC1");
    }

    @Override
    public Product getResult() {
        return product;
    }
}
