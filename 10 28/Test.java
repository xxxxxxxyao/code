import java.util.Scanner;

//8.	要求输入一个代表年月日的8位整数，计算出其上一天和下一天是什么日期
public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入年月日(8位数)：");
        double num=scanner.nextDouble();
        int year=(int)num/10000;
        int month = (int) num/ 100 % 100;
        int day=(int) num%100;
        if (month == 1) {
            if (day == 1) {
                System.out.println("上一天:" + (year - 1) + "年12月31日");
                System.out.println("下一天:" + year + "年" + month + "月" + (day + 1) + "日");
            } else if (day == 31) {
                System.out.println("上一天:" + year + "年" + month + "月" + (day - 1) + "日");
                System.out.println("下一天:" + year + "年" + (month + 1) + "月" + 1 + "日");
            } else {
                System.out.println("上一天:" + year + "年" + month + "月" + (day - 1) + "日");
                System.out.println("下一天:" + year + "年" + month + "月" + (day + 1) + "日");
            }
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            if (day == 1) {
                System.out.println("上一天: " + year + "年" + (month - 1) + "月" + 31 + "日");
                System.out.println("下一天:" + year + "年" + month + "月" + (day + 1) + "日");
            } else if (day == 30) {
                System.out.println("上一天:" + year + "年" + month + "月" + (day - 1) + "日");
                System.out.println("下一天:" + year + "年" + (month + 1) + "月" + 1 + "日");
            } else {
                System.out.println("上一天:" + year + "年" + month + "月" + (day - 1) + "日");
                System.out.println("下一天:" + year + "年" + month + "月" + (day + 1) + "日");
            }
        } else if (month == 2) {
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                if (day == 1) {
                    System.out.println("上一天:"+ year + "年" + (month - 1) + "月" + 31 + "日");
                    System.out.println("下一天:" + year + "年" + month + "月" + (day + 1) + "日");
                } else if (day == 29) {
                    System.out.println("上一天:" + year + "年" + month + "月" + (day - 1) + "日");
                    System.out.println("下一天:" + year + "年" + (month + 1) + "月" + 1 + "日");
                } else {
                    System.out.println("上一天:" + year + "年" + month + "月" + (day - 1) + "日");
                    System.out.println("下一天:" + year + "年" + month +"月" + (day + 1) + "日");
                }
            } else {
                if (day == 1) {
                    System.out.println("上一天:" + year + "年" + (month - 1) + "月" + 31 + "日");
                    System.out.println("下一天:" + year + "年" + month + "月" + (day + 1) + "日");
                } else if (day == 28) {
                    System.out.println("上一天:" + year + "年" + month + "月" + (day - 1) + "日");
                    System.out.println("下一天:" + year + "年" + (month + 1) + "月" + 1 + "日");
                } else {
                    System.out.println("上一天:" + year + "年" + month + "月" + (day - 1) + "日");
                    System.out.println("下一天:" + year + "年" + month + "月" + (day + 1) + "日");
                }
            }
        } else if (month == 3) {
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {// 判断是否是闰年
                if (day == 1) {
                    System.out.println("上一天:" + year + "年" + (month - 1) + "月" + 29 + "日");
                    System.out.println("下一天:" + year + "年" + month + "月" + (day + 1) +"日");
                } else if (day == 31) {
                    System.out.println("上一天:" + year + "年" + month + "月" + (day - 1) +"日");
                    System.out.println("下一天:" + year + "年" + (month + 1) + "月" + 1 + "日");
                } else {
                    System.out.println("上一天:" + year + "年" + month + "月" + (day - 1) + "日");
                    System.out.println("下一天:" + year + "年" + month + "月" + (day + 1) + "日");
                }
            } else {
                if (day == 1) {
                    System.out.println("上一天:" + year + "年" + (month - 1) + "月" + 28 + "日");
                    System.out.println("下一天:" + year +"年" + month + "月" + (day + 1) + "日");
                } else if (day == 31) {
                    System.out.println("上一天:" + year + "年" + month + "月" + (day - 1) + "日");
                    System.out.println("下一天:" + year + "年" + (month + 1) + "月" + 1 + "日");
                } else {
                    System.out.println("上一天:" + year + "年" + month + "月" + (day - 1) + "日");
                    System.out.println("下一天:" + year + "年" + month + "月" + (day + 1) + "日");
                }
            }

        }
    }

}

