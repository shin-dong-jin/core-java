package ch11AbstractAndInterface.packagePractice;

import kr.seoul.sesac.util.libs.*;

public class ImportDemo {
    public static void main(String[] args) {
        Finance finance = new Finance();
        HumanResource humanResource = new HumanResource();
        System.out.println(finance.money);
        System.out.println(humanResource.salary);
    }
}
