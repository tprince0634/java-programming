public class PrivateAccessfier {

    private int rollnumber;


    public void setRollnumber(int rollnumber) {
       if(rollnumber > 0 && rollnumber < 60){
           this.rollnumber=rollnumber;
       }else {
           System.out.println("Invalid");
       }
    }

    public int getRollnumber() {
        return  rollnumber;
    }

    public static void main(String[] args) {
        PrivateAccessfier a = new PrivateAccessfier();
        a.setRollnumber(0);
        System.out.println(a.getRollnumber());

    }
}
