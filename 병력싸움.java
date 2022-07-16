import java.util.*;
public class 병력싸움 extends Thread {
    Random rd = new Random();
    장수 me;
    상대 s;

    병력싸움(상대 s,장수 me) {
        this.s=s;
        this.me = me;
    }

    public void run() {
        while (true) {
            if (me.기마병.hp < 0 && me.궁수.hp < 0 && me.보병.hp < 0) {
                break;
            }
            int a = rd.nextInt(9) + 1;
            if (1 == a) {
                s.atarmtoac(me);
            } else if (2 == a) {
                s.atarmtobo(me);
            } else if (3 == a) {
                s.atarmtogi(me);
            } else if (4 == a) {
                s.giarmtoac(me);
            } else if (5 == a) {
                s.giarmtobo(me);
            } else if (6 == a) {
                s.giarmtogi(me);
            } else if (7 == a) {
                s.boarmtoac(me);
            } else if (8 == a) {
                s.boarmtogi(me);
            } else if (9 == a) {
                s.boarmtobo(me);
            }
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.err.println(e.toString());
            }
        }
    }
}
