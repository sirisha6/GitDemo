 class SavingAccount{
        static int Amount;
        static int time;
        static String name;

        SavingAccount(String name,int Amount,int time){
            this.name=name;
            this.Amount=Amount;
            this.time=time;
        }
        public static int ROISavingAccount(){
            return (int) (Amount*time*0.25/100);
        }
    }
    class CurrentAccount {
        String name;
        int Amount;
        int time;
        CurrentAccount(String name,int Amount,int time){
            this.name=name;
            this.Amount=Amount;
            this.time=time;
        }
        public static int ROICurrentAccount(){
            return 0;
        }

    }
    public class BankROIA3 {
        public static void main(String[] args) {
            SavingAccount Object1=new SavingAccount("Amrita",100000,3);
            CurrentAccount Object2=new CurrentAccount("Gopal",60000,3);
            System.out.println("Amrita Gets the Interest Of : "+Object1.ROISavingAccount());
            System.out.println("Gopal Gets the Interest Of : "+Object2.ROICurrentAccount());
        }
    }

