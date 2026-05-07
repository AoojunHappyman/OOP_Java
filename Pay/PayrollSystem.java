import java.util.Scanner;

public class PayrollSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter employee type (hourly/daily): ");
        String type = sc.nextLine().trim().toLowerCase();

        try{
            Payable employee;

            if(type.equals("hourly")){
                int hours = sc.nextInt();
                employee = new HourlyEmployee(hours);
            }else if(type.equals("daily")){
                int days = sc.nextInt();
                employee = new DailyEmployee(days);
            }else{
                System.out.println("Err");
                return;
            }
            System.out.println("Total pay: " + employee.calculatePay() + " baht");
        }catch (IllegalArgumentException e){
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}
