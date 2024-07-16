package ch11AbstractAndInterface.interfacemulti;

public class GrandSon implements Son {
    public static void main(String[] args) {
        // GrandFather는 본인 메소드만 접근 가능
        GrandFather grandFatherImplemented = new GrandSon();
        grandFatherImplemented.grandFather();
        System.out.println();

        // Father는 GrandFather와 본인 메소드만 접근 가능
        Father fatherImplemented = new GrandSon();
        fatherImplemented.grandFather();
        fatherImplemented.father();
        System.out.println();

        // Mother는 본인 메소드만 접근 가능
        Mother motherImplemented = new GrandSon();
        motherImplemented.mother();
        System.out.println();

        // Son은 GrandFather, Father, Mother, 본인 메소드만 접근 가능
        Son sonImplemented = new GrandSon();
        sonImplemented.grandFather();
        sonImplemented.father();
        sonImplemented.mother();
        sonImplemented.son();
        System.out.println();

        // GrandSon은 GrandFather, Father, Mother, Son, 본인 메소드만 접근 가능
        GrandSon allImplemented = new GrandSon();
        allImplemented.grandFather();
        allImplemented.father();
        allImplemented.mother();
        allImplemented.son();
        allImplemented.grandSon();
        System.out.println();

        // heterogeneous collection
        GrandFather[] grandFathers = {new GrandSon(), new GrandSon()};
        Father[] fathers = {new GrandSon(), new GrandSon()};
        Mother[] mothers = {new GrandSon(), new GrandSon()};
        Son[] sons = {new GrandSon(), new GrandSon()};
        GrandSon[] grandSons = {new GrandSon(), new GrandSon()};

        System.out.println(Father.NAME + ", " + Mother.NAME);
    }

    @Override
    public void grandFather() {
        System.out.println("Called by grandFather()");
    }

    @Override
    public void father() {
        System.out.println("Called by father()");
    }

    @Override
    public void mother() {
        System.out.println("Called by mother()");
    }

    @Override
    public void son() {
        System.out.println("Called by son()");
    }

    public void grandSon() {
        System.out.println("Called by grandSon()");
    }
}
