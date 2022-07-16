class Test extends Thread {
    상대 s;
    장수 me;

    Test(상대 s, 장수 me) {
        this.s = s;
        this.me = me;
    }

    public void run() {
        while (true) {
            if (s.hp <= 0) {
                break;
            }
            s.attack(me);

            try {
                Thread.sleep(2000);
            } catch (Exception e) {
                System.err.println(e.toString());
            }
        }
    }
}
class test1 extends Thread{
    조조 s;
    장수 me;

    test1(조조 s, 장수 me) {
        this.s = s;
        this.me = me;
    }

    public void run() {
        while (true) {
            if (s.hp <= 0) {
                break;
            }
            s.attack(me);

            try {
                Thread.sleep(2000);
            } catch (Exception e) {
                System.err.println(e.toString());
            }
        }
    }
}
class Test2 extends Thread {
    상대 s;
    장수 me;
    조조1 z;

    Test2(상대 s, 장수 me,조조1 z) {
        this.s = s;
        this.me = me;
        this.z = z;
    }

    public void run() {
        while (true) {
            if (s.hp <= 0) {
                break;
            }
            if(z.hp<=0){
                      break;
            }
            s.attack(me);

            try {
                Thread.sleep(2000);
            } catch (Exception e) {
                System.err.println(e.toString());
            }
        }
    }
}