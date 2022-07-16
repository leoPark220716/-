import java.util.Random;
import java.util.Scanner;

class 상대 extends 캐릭터 {

    Random rd = new Random();
    Scanner sc = new Scanner(System.in);

    void 선택() {
        System.out.println("누구와 대결 하시겠습니까?");
        System.out.println("우금 : 1      방덕 : 2     하후연 : 3");
        System.out.println("서황 : 4      허저 : 5     하후돈 : 6");
        System.out.println("전위 : 7");
        System.out.println("===========================================================");
    }

    int 공격력;
    int money;
    int man;
    int 통솔;
    Item[]items;
    병사 보병=new 병사();
    병사 궁수=new 병사();
    병사 기마병=new 병사();


    Item itemDrop(){
        return items[(int)(Math.random() * items.length)];

    }

   synchronized void attack(장수 me) {
        if(hp<=0){
            System.out.println("                                                                                 "+name+" : 크윽,,,두고보자,,,,");
                return;
        }
        System.out.println();
        System.out.println();
        System.out.println("                                                                                 "+name + "(은)는 " + me.name + "(을)를 공격한다.");
        System.out.println("                                                                                 "+name + "(이)가 " + me.name + "에게" + 공격력 + "피해를 입혔다.");
        me.hp = me.hp - 공격력;

        System.out.println();
        System.out.println();
        if (me.hp < 1) {
            System.out.println(me.name + " : 으악!!!!");
            System.out.println("------------------(game over)------------------");
            System.exit(0);
        }
        System.out.println("                                                                                 현제 " + me.name + "의 채력은" + me.hp + "입니다.");
    }
    void army(장수 me) {
        System.out.println();
        System.out.println(name + "의 군대가 " + me.name + "의 군대를 공격합니다.");
        System.out.println(me.name + "의 군대를" + 통솔 + "만큼 소멸 시켰습니다");
        me.man = me.man/통솔;
        if (me.man < 1) {
            System.out.println(me.name + " : 으악!!!!");
            System.out.println("------------------(game over)------------------");
            System.exit(0);
        }
        System.out.println("현제 " + me.name + "의 병력은" + me.man + "입니다.");
        System.out.println("===========================================================");
    }
    void giarmtogi(장수 s) {
        기마병.fighit1(s.기마병);
    }

    void giarmtobo(장수 s) {
        기마병.fighit1(s.보병);
    }

    void giarmtoac(장수 s) {
        기마병.fighit1(s.궁수);
    }

    void boarmtogi(장수 s) {
        보병.fighit1(s.기마병);
    }

    void boarmtobo(장수 s) {
        보병.fighit1(s.보병);

    }

    void boarmtoac(장수 s) {
        보병.fighit1(s.궁수);
    }

    void atarmtogi(장수 s) {
        궁수.fighit1(s.기마병);
    }

    void atarmtobo(장수 s) {
        궁수.fighit1(s.보병);
    }

    void atarmtoac(장수 s) {
        궁수.fighit1(s.궁수);
    }
    public void 우금() {
        name = "우금";
        공격력 = 100;
        hp = 8000;
        money = 300;
        man=500;
        통솔=1;
        보병.setStat("보병",100+통솔,5+통솔,2+통솔);
        궁수.setStat("궁수",100+통솔,8+통솔,0+통솔);
        기마병.setStat("기마병",100+통솔,10+통솔,4+통솔);


    }

    public void 방덕() {
        name = "방덕";
        hp = 10000;
        공격력 = 400;
        money = 500;
        man=1000;
        통솔=10;
        보병.setStat("보병",100+통솔,5+통솔,2+통솔);
        궁수.setStat("궁수",20+통솔,8+통솔,0+통솔);
        기마병.setStat("기마병",40+통솔,10+통솔,4+통솔);

    }

    public void 하후연() {
        name = "하후연";
        hp = 15000;
        공격력 = 700;
        money = 800;
        man=2000;
        통솔=15;
        보병.setStat("보병",100+통솔,5+통솔,2+통솔);
        궁수.setStat("궁수",50+통솔,8+통솔,0+통솔);
        기마병.setStat("기마병",50+통솔,10+통솔,4+통솔);

    }

    public void 서황(Item[] items) {
        name = "서황";
        hp = 18000;
        공격력 = 900;
        money = 1000;
        man=3000;
        통솔=30;
        보병.setStat("보병",100+통솔,5+통솔,2+통솔);
        궁수.setStat("궁수",50+통솔,8+통솔,0+통솔);
        기마병.setStat("기마병",50+통솔,10+통솔,4+통솔);
        this.items=items;

    }

    public void 허저(Item[] items) {
        name = "허저";
        hp = 20000;
        공격력 = 1200;
        money = 2000;
        man=5000;
        통솔=40;
        보병.setStat("보병",100+통솔,5+통솔,2+통솔);
        궁수.setStat("궁수",50+통솔,8+통솔,0+통솔);
        기마병.setStat("기마병",50+통솔,10+통솔,4+통솔);
        this.items=items;

    }

    public void 하후돈(Item[] items) {
        name = "하후돈";
        hp = 80000;
        공격력 = 2000;
        money = 3000;
        man=10500;
        통솔=50;
        보병.setStat("보병",1000+통솔,5+통솔,2+통솔);
        궁수.setStat("궁수",700+통솔,8+통솔,0+통솔);
        기마병.setStat("기마병",500+통솔,10+통솔,4+통솔);
        this.items=items;
    }

    public void 전위(Item[] items) {
        name = "전위";
        hp = 100000;
        공격력 = 10000;
        money = 13000;
        man=15000;
        통솔=100;
        보병.setStat("보병",2000+통솔,5+통솔,2+통솔);
        궁수.setStat("궁수",1000+통솔,8+통솔,0+통솔);
        기마병.setStat("기마병",1000+통솔,10+통솔,4+통솔);
        this.items=items;

    }
    public void 장료() {
        name = "장료";
        공격력 = 100;
        hp = 80;



    }
    public void 순욱() {
        name = "순욱";
        공격력 = 100;
        hp = 80;


    }
    public void 사마의() {
        name = "사마의";
        공격력 = 100;
        hp = 80;
    }
}

class 조조 extends 상대 {
    public void 조조() {
        System.out.println("_____________________조조와의 전투를 시작합니다________________________");
        System.out.println("전투 방식을 선택하세요.");
        System.out.println("일기토 : 1     전쟁 : 2");
        name = "조조";
        hp = 1;
        공격력 = 1;
        통솔=1;
        보병.setStat("보병",10000+통솔,5+통솔,2+통솔);
        궁수.setStat("궁수",5000+통솔,8+통솔,0+통솔);
        기마병.setStat("기마병",2000+통솔,10+통솔,4+통솔);
    }

    public void attack1(장수 me) {
        System.out.println("----------------------------------------");
        System.out.println("조조(은)는 " + me.name + "(을)를 공격한다.");
        System.out.println("방어하실 부위를 선택하세요");
        System.out.println("상단 : 1     하단 : 2     오른쪽 : 3     왼쪽 : 4");
        System.out.print("선택 :");
        int a = sc.nextInt();
        int shild = rd.nextInt(4) + 1;
        if (a == shild) {
            System.out.println("챙!!!");
            System.out.println("방어에 성공하셨습니다.");
            System.out.println("현제 " + me.name + "의 채력은" + me.hp + "입니다.");
            System.out.println("----------------------------------------");
        } else if(a!=shild){
            System.out.println("조조(이)가 " + me.name + "에게" + 공격력 + "피해를 입혔다.");

            me.hp = me.hp - 공격력;
            System.out.println("현제 " + me.name + "의 채력은" + me.hp + "입니다.");
            System.out.println("----------------------------------------");
          }
        else if (me.hp < 1) {
            System.out.println(me.name + " : 으악!!!!");
            System.out.println("------------------(game over)------------------");
            System.exit(0);
        }
    }
}
class 조조1 extends 상대 {
    public void 조조1() {
        name = "조조";
        hp = 10000;
        공격력 = 1;
        통솔=1;
    }

    public void attack1(장수 me) {
        System.out.println("----------------------------------------");
        System.out.println("조조(은)는 " + me.name + "(을)를 공격한다.");
        System.out.println("방어하실 부위를 선택하세요");
        System.out.println("상단 : 1     하단 : 2     오른쪽 : 3     왼쪽 : 4");
        System.out.print("선택 :");
        int a = sc.nextInt();
        int shild = rd.nextInt(4) + 1;
        if (a == shild) {
            System.out.println("챙!!!");
            System.out.println("방어에 성공하셨습니다.");
            System.out.println("현제 " + me.name + "의 채력은" + me.hp + "입니다.");
            System.out.println("----------------------------------------");
        } else if(a!=shild){
            System.out.println("조조(이)가 " + me.name + "에게" + 공격력 + "피해를 입혔다.");

            me.hp = me.hp - 공격력;
            System.out.println("현제 " + me.name + "의 채력은" + me.hp + "입니다.");
            System.out.println("----------------------------------------");
        }
        else if (me.hp < 1) {
            System.out.println(me.name + " : 으악!!!!");
            System.out.println("------------------(game over)------------------");
            System.exit(0);
        }
    }
}



