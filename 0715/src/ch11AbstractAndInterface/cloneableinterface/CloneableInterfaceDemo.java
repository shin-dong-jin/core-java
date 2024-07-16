package ch11AbstractAndInterface.cloneableinterface;

public class CloneableInterfaceDemo {
    public static void main(String[] args) {
        Product pencil = new Product("monami pencil");
        // 주소복사
        Product referenceBallpen = pencil;
        System.out.println(referenceBallpen.getName());
        System.out.println();

        // 값복사: implements Cloneable interface (flag interface)
        Product copyBallpen = pencil.copy();
        copyBallpen.setName("computer");
        System.out.println(copyBallpen.getName());
        System.out.println(pencil.getName());
    }
}
