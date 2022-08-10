class Holiday{
        private String name;
        private int day;
        private String month;
        Holiday(String name,int day,String month){
            this.name=name;
            this.day=day;
            this.month=month;
        }
        public static boolean inSameMonth(Holiday holiday1,Holiday holiday2){
            return holiday1.month.equals(holiday2.month);
        }
        public static double avgDate(Holiday[] holiday_array){
            int res=0;
            for(int i=0;i<holiday_array.length;i++){
                res+=holiday_array[i].day;
            }
            return ((double)res)/holiday_array.length;
        }


    }
    public class HolidayMain {
        public static void main(String[] args) {

            Holiday holiday1=new Holiday("Independance Day",4,"July");
            Holiday holiday2=new Holiday("Republic Day",4,"July");
            System.out.println(Holiday.inSameMonth(holiday1,holiday2));
            Holiday [] holiday_array=new Holiday[2];
            holiday_array[0]=holiday1;
            holiday_array[1]=holiday2;
            System.out.println(Holiday.avgDate(holiday_array));


        }
    }
