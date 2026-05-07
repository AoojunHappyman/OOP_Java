public class HourlyEmployee implements Payable {
        private int hours;

        public HourlyEmployee(int hours){
            if(hours <= 0){
                throw new IllegalArgumentException("จำนวนต้องมากกว่าศูนย์");
            }
            this.hours = hours;
        };

        public double calculatePay(){
            return this.hours * 120;
        }
}
