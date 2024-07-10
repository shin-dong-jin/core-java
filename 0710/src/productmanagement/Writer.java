package productmanagement;

public class Writer {

    private void writeProducts(Product[] products) {
        for(Product product : products) {
            System.out.print(product);
        }
    }

    private void writeTitle() {
        System.out.println("<<상품별 판매 이익금 및 이익율표>>");
    }

    private void writeHeader() {
        System.out.println("상품명\t수량\t판매단가\t매입단가\t운송료\t이익금\t이익율");
    }

    private void writeLine() {
        System.out.println("-----------------------------------------------------------------");
    }

    public void view(Product[] products) {
        writeTitle();
        writeLine();
        writeHeader();
        writeLine();
        writeProducts(products);
    }
}
