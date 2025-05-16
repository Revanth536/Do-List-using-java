
import java.util.ArrayList;
import java.util.Scanner;


class Username {
    
    static void Add(int n) {
        for (int i = 0; i <= n; i++) {
            l.add(sc.next());
        }
    }
    static  Scanner sc = new Scanner(System.in);
    static ArrayList<String> l = new ArrayList<>();
    public static void main(String[] args) {
        
        while (true) {
            System.out.println("Grocery List");
            System.out.println("**************************************");
            System.out.println("*    1.Add items                     *");
            System.out.println("*    2.View Items                    *");
            System.out.println("*    3.Remove Items                  *");
            System.out.println("*    4.Exit                          *");
            System.out.println("**************************************");

            int n = sc.nextInt();
            switch (n) {
                case 1:
                    System.out.println("Number of Items to add");
                    Add(sc.nextInt());
                    break;
                case 2:
                    System.out.println("Items in list are");
                    for (int i = 0; i < l.size(); i++) {
                        System.out.println(l.get(i));
                    }
                    break;
                case 3:
                    System.out.println("Remove Items in List");
                    System.out.println("Enter the Item number");
                    l.remove(sc.nextInt());
                    break;
                case 4:
                    System.out.println("<<<<<<<<<<<<<<<<---Exit--->>>>>>>>>>>>>>");
                    System.exit(0);
                      
            }
        }
        
    }
}