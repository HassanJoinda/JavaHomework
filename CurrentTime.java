
package current.time;
public class CurrentTime {
    public static void main(String[] args) {
      long time=System.currentTimeMillis();   
        long second=time/1000; 
        long currentsecond=second%60;  
        long minute=second/60;
        long currentminute=minute%60;
        long hours=minute/60;  
        long currenthour=hours%24;
        System.out.println("current time is:"+currenthour+":"+currentminute+":"+currentsecond);
    }
    
}
