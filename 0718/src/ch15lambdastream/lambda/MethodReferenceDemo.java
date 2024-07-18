package ch15lambdastream.lambda;

public class MethodReferenceDemo {

    public static void main(String[] args) {
        // Lambda expression
        MyPolygon myPolygon = radian -> Math.toDegrees(radian);
        System.out.println(myPolygon.radianToDegree(1.));

        // Method reference [ClassName::methodName]
        MyPolygon myPolygon1 = Math::toDegrees;
        System.out.println(myPolygon1.radianToDegree(1.));
    }
}

@FunctionalInterface
interface MyPolygon {
    double radianToDegree(double radian);
}