package ZohoQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class CrudeOperation {
    public static void main(String[] args) {
        int[] created_array = {};
        InnerCrudeOperation crudOperation = new InnerCrudeOperation();
        System.out.println("1.Create");
        System.out.println("2.Read");
        System.out.println("3.Update");
        System.out.println("4.Delete");
        Scanner sc = new Scanner(System.in);
        int found = 0;
        while (found == 0) {
            System.out.println("enter the choice:");
            int input = sc.nextInt();
            switch (input) {
                case 1:
                    System.out.println("creating an array");
                    crudOperation.Create();
                    break;
                case 2:
                    System.out.println("Reading an array");
                    crudOperation.Read();
                    break;
                case 3:
                    System.out.println("Updateing an array");
                    crudOperation.Update();
                    break;
                case 4:
                    System.out.println("Deleting an array");
                    crudOperation.Delete();
                    break;
                default:
                    System.out.println("invalid choice.....");
            }
            System.out.println("enter to continue :: ");
            String y = sc.next();
            if (y.equals("y")) {
                found = 0;
            } else {
                System.out.println("Thank you ! ..use for this ! CRUD ! operation ");
                found = 1;
            }
        }
    }
}

class InnerCrudeOperation {
    // ..................Create.........................//
    static int[] created_array;

    public static int[] Create() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the counts : ");
        int count = sc.nextInt();
        created_array = new int[count];
        for (int i = 0; i < count; i++) {
            System.out.println("enter the value : ");
            created_array[i] = sc.nextInt();
        }
        return created_array;
    }
    // ..................Read.........................//

    public static void Read() {
        for (int i : created_array) {
            System.out.print(i + " ");
        }
    }
    // ..................Update.........................//

    public static String Update() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the update index : ");
        int update_index = sc.nextInt();
        for (int i = 0; i < created_array.length; i++) {
            if (i == update_index) {
                System.out.println("enter the value : ");
                created_array[update_index] = sc.nextInt();
            }
        }
        return Arrays.toString(created_array);
    }
    // ..................Delete.........................//

    public static String Delete() {
        int[] newarray = new int[created_array.length - 1];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the delete index");
        int delete_index = sc.nextInt();
        for (int i = 0, j = 0; i < created_array.length; i++) {
            if (i != delete_index) {
                newarray[j++] = created_array[i];
            }
        }
        created_array = newarray;
        return Arrays.toString(created_array);
    }
}
