import java.util.Scanner;

//public class Buoi1 {
//    public static void main(String[] args) {
        // 1: Kiểu dữ liệu (Data type)
        // Nhóm 1: Kiểu nguyên thuỷ
        // Ví dụ: char (ký tự), int (số nguyên), float (số thực), boolean (giá trị đúng sai)
        // Nhóm 2: Kiểu object (Kiểu preference)

//        // 2: Khai báo biến
//        char gender = 'M'; // Kí tự sẽ nằm trong dấu nháy đơn, sẽ lưu biến gender vaò head map
//        String name = "Nguyễn Thị Rin Gân";
//        int age = 28;
//        float weigh = 75.1f; // double có phần thập phân lớn hơn  float, nếu không có chữ "f" phía sau thì chương trình tự hiểu là kiểu double
//        float height = 1.75f;
//        boolean isBusy = true;

//        // 3: Phương thức (method or function)
//        // Phương thức in trong hệ thống: System
//        System.out.println("Giới tính: " + gender);
//        System.out.println("Tuổi: " + age);
        //  4: Toán tử

//        int a = 5;
//        int b = 10;
//        int c = a * b;
//        System.out.println(c);

//        Toán tử ++
//        Trường hợp 1: a++
//            - Lấy giá trị của a và thế vào vị trí a++
//            - Sau khi gán xong thì sẽ chạy a = a + 1
//        Trường hợp 2: ++a
//           - Chạy a = a + 1
//            - Lấy giá trị của a và thế vào vị trí a++
//
//        int a = 5;
//        int b = a++;
//        System.out.println("B" + b);

//        int a = 10;
//        int b  = 3;
//
//        int result= a-- - --a + b-- + --b - a++ + b-- +b++ +a--;
//
//        System.out.println("result " + result);
//        System.out.println("A " + a);
//        System.out.println("B " + b);
//        //            6 - 4 + 5 - 4 + 5 -4 -4
//
//
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Mời bạn nhập  chiều cao: ");
//        float height = scanner.nextFloat();
//        System.out.print("Mời bạn nhập cân nặng: ");
//        float weight = scanner.nextFloat();
//
//        double bmi = weight/(height*height);
//        System.out.println("bmi= " + bmi);
//
//        String message = "";
//        if (bmi < 18.5){
//            message= "Gầy";
//        }
//        else if (bmi <= 24.9){
//            message = "Bình thường";
//        }
//        else if (bmi <=29.9){
//            message = "Tiền béo phì";
//        }
//        else if (bmi <= 34.9)
//            message = "Béo phì độ 1";
//        else if (bmi <=39.9){
//            message = "Béo phì độ 2";
//        }
//        else{
//            message = "Béo phì độ 3";
//        }
//        System.out.println("bmi= " + bmi);
//        System.out.println(message);
//  }}
        // Nhập một năm bất kì và tính xem năm đó có nhuận hay không?
// 5. Câu điều kiện switch case

//        int month = 5;
//        switch (month) {
//            case 1:
//                System.out.println("Quý 1");
//                break;
//            case 2:
//                System.out.println("Quý 1");
//                break;
//            default:
//                System.out.println("Quý 1");
//                break;
//
//        }
//    }
//}
//        5: Câu điều kiện switch case
//     6: Vòng lặp for
//    Dùng vòng lặp chạy 1 đến 100
//    1 - In ra số chẵn
//    2 - In ra số lẻ
//    3 - In ra số chia 3 dư 1

//        System.out.println("Day la cac so chan tu 1-100");
//        for (int k = 1; k <100; k++) {
//            if (k % 2 == 0 ) System.out.println(k);
//        }
//        System.out.println("Day la cac so le tu 1-100");
//        for (int k = 1; k <100; k++) {
//            if (k % 2 == 1 ) System.out.println(k);
//        }
//        System.out.println("Day la cac so chia 3 du 1 tu 1-100");
//        for (int k = 1; k <100; k++) {
//            if (k % 3 == 1 ) System.out.println(k);
//        }
//
//        }
//    }

//     Scanner scanner = new Scanner(System.in);
//        System.out.print("Mời bạn nhập  số: ");
//
//
//        String message = "";
//        for (int a = 1; a < 100; a++) {
//            if (a % a == 0 && a % 1 == a) System.out.println("số nguyên tố= " + a);
//            }
//
//        for (int i=1; i<10; i++){
//            for (int j=1;j<10;j++){
//                System.out.print( String.format("%d x %d = %d \t", j,i,i*j));
//            }
//        System.out.println();
//        }
//        7 : Mảng (Array)
//        a : Khởi tạo mảng theo kích thước

//                String[] arrNames = new String[10];
//                arrNames[0] = "A";
//                String valueIndex0 = arrNames[0];
//                System.out.println("Value index 0: " + valueIndex0);
//         b: Khởi tạo với các giá trị có sẵn
//                int[] arrNumbers = {4,1,5,10};
////          Kích thước của mảng
//                    System.out.println(arrNumbers.length);

//            int[] arrNumbers1 = {1, 2, 3, 4, 5};
//            int[] arrNumbers2 = {10, 20, 30};
//
//            for (int i = 0; i < arrNumbers1.length; i++) {
//                for (int j = 0; j< arrNumbers2.length; j++) {
//                    System.out.println(arrNumbers1[i] * arrNumbers2[j]);
//                }
//            }

//                String[] arrNames1 = {"Hoa", "Tuan", "Khoa", "Tu", "Dat"};
//                String[] arrNames2 = {"Nhung", "Thuy", "Lien"};
//                String[] newArrNames = new String[arrNames1.length + arrNames2.length];
//                // Gộp 2 mảng thành 1 mảng
//
//                for (int i = 0; i < newArrNames.length; i++) {
//                    if (i < arrNames1.length){
//                        newArrNames[i] = arrNames1[i];
//                    } else {
//                        newArrNames[i] = arrNames2[i-arrNames1.length];
//                    }
//                }

//                System.out.println(String[arrNames1]+ String[arrNames2]);
//
//        String[] arrNames = {"Hoa", "Tuan", "Khoa", "Tu", "Dat", "Nhung", "Thuy", "Lien"};
//        int maxCount = 0;
//        int minCount = arrNames[0].length();
//        int totalArrays = 0;
//
//        for (int i = 0, i <arrNames.length, i++){
//            if (maxCount < arrNames[i].length()) {
//                maxCount = arrNames[i].length();
//            }
//            if (minCount < arrNames[i].length()) {
//                minCount = arrNames[i].length();
//            }
//        }
//
//        totalArrays = maxCount - minCount;
//
//        String[][] result
//
//        int [] arrNumbers = {1, 3, 5, 10, 0, 20, 12, 30};
//        int max = arrNumbers[0];
//        int min = arrNumbers[0];
//        // Kiếm số lớn nhất và số nhỏ nhất
//        for (int i=0; i< arrNumbers.length; i++){
//            if (arrNumbers[i] > max) {
//                max = arrNumbers[i];
//            }
//            else if (arrNumbers[i] < min) {
//                min = arrNumbers[i];
//
//            }
//        }
//        System.out.println("Số lớn nhất là:" + max);
//        System.out.println("Số nhỏ nhất là:" + min);

//        int temp = arrNumbers[0];
//        int count = 0;
//        int increase = 0;
//        for(; count < arrNumbers.length -2; ) {
//            count = 0;
//            for (int i = 0; i< arrNumbers.length -1 ; i++){
//                if (arrNumbers[i] < arrNumbers[i+1]){
//                    temp = arrNumbers[i] ;
//                    arrNumbers[i] =arrNumbers[i+1];
//                    arrNumbers[i+1] = temp;
//                }
//                else {
//                   count += 1;
//                }
//
//            }
//            increase += 1;
//
//        }
//
//
//        System.out.println("Số  lớn nhất là:" + increase);
public class Buoi1 {
    public static void main(String[] args) {
        // Tạo object
        // Cấp phát vùng nhớ
        Animal cat1 = new Animal( weight: 1.2f, height: 0.25f);
        cat1.weight = 1.2f;
        cat1.height = 0.25f;

        // Tạo object thứ 1
        Animal dog = new Animal();
        dog.weight = 5.0f;
        dog.height = 1.1f;

        // Tạo object thứ 2
        Animal cat2 = new Animal();
        cat2.weight = 1.2f;
        cat2.height = 0.25f;

        if (cat1 == cat2) {
            System.out.println("Giống nhau");
        }
        else {
            System.out.println("Khác nhau");
        }
    }
}




