import java.util.Random;
import java.util.Scanner;

public class 캐릭터 {
    Scanner sc = new Scanner(System.in);
    Random rd = new Random();
    String name;
    int hp;
}

class 장수 extends 캐릭터 {
    int ex;
    int 통솔;
    int str;
    int thin;
    int spe;
    int money = 0;
    int man;
    int 공격력;
    Item[] items;
    int it = 0;
    병사 보병 = new 병사();
    병사 궁수 = new 병사();
    병사 기마병 = new 병사();

    int cr(청룡언월도 s, 장수 me) {
        System.out.println("장착 : 1      해제 : 2");
        int a = sc.nextInt();
        for (int i = 0; i < me.items.length; i++){
            if(!me.items[i].name.equals("청룡언월도")){
                        System.out.println("청룡언월도를 보유하지 않았습니다.");
            }
                    if(me.items[i].name.equals("청룡언월도")){
                        if (a == 1) {
                            it += 1;
                            if (it == 1) {
                                s.get(s, me);
                            } else if (it > 1) {
                                System.out.println("장착중인 아이템을 해제해주세요.");
                                return it--;
                            }
                        } else if (a == 2) {
                            it -= 1;
                            if (it == 0) {
                                System.out.println("장착 해제 성공");
                            } else if (it != 0) {
                                System.out.println("장착중인 아이템이 없습니다.");
                                return it++;
                            }
                        }
                    }
        }
        return it;
    }

    int jp(장팔사모 s, 장수 me) {
        System.out.println("장착 : 1      해제 : 2");
        int a = sc.nextInt();
        for (int i = 0; i < items.length; i++) {
            if(!me.items[i].name.equals("장팔사모")){
                System.out.println("장팔사모를 보유하지 않았습니다.");
            }
            else if (me.items[i].name.equals("장팔사모")) {
                if (a == 1) {
                    it += 1;
                    if (it == 1) {
                        s.get(s, me);
                    } else if (it > 1) {
                        System.out.println("장착중인 아이템을 해제해주세요.");
                        return it--;
                    }
                } else if (a == 2) {
                    it -= 1;
                    if (it == 0) {
                        System.out.println("장착 해제 성공");
                    } else if (it != 0) {
                        System.out.println("장착중인 아이템이 없습니다.");
                        return it++;
                    }
                }
            }
        }

        return it;
    }

    int hc(헌창 s, 장수 me) {
        System.out.println("장착 : 1      해제 : 2");
        int a = sc.nextInt();
        if (a == 1) {
            it += 1;
            if (it == 1) {
                s.get(s, me);
            } else if (it > 1) {
                System.out.println("장착중인 아이템을 해제해주세요.");
                return it--;
            }
        } else if (a == 2) {
            it -= 1;
            if (it == 0) {
                System.out.println("장착 해제 성공");
                s.mget(s,me);
            } else if (it != 0) {
                System.out.println("장착중인 아이템이 없습니다.");
                return it++;
            }
        }
        return it;
    }

    int chul(출사표 s, 장수 me) {
        System.out.println("장착 : 1      해제 : 2");
        int a = sc.nextInt();
        if (a == 1) {
            it += 1;
            if (it == 1) {
                s.get(s, me);
            } else if (it > 1) {
                System.out.println("장착중인 아이템을 해제해주세요.");
                return it--;
            }
        } else if (a == 2) {
            it -= 1;
            if (it == 0) {
                System.out.println("장착 해제 성공");
                s.mget(s,me);

            } else if (it != 0) {
                System.out.println("장착중인 아이템이 없습니다.");
                return it++;
            }
        }
        return it;
    }

    void iv() {
        for (int i = 0; i < 4; i++) {
            if (items[i] != null) {
                System.out.println(items[i]);
            }
        }
    }

    void 공격력() {
        if (name.equals("제갈량")) {
            공격력 = (str / 4 + spe / 4 + thin * 2);
        } else if (name.equals("관우")) {
            공격력 = thin / 4 + str * (3 / 2) + spe;
        } else if (name.equals("장비")) {
            공격력 = thin / 5 + str * (5 / 3) + spe;
        } else if (name.equals("조운")) {
            공격력 = thin / 4 + str + spe * 2;
        }
    }

    void name() {
        System.out.println(name + "(을)를 선택했습니다.");
    }

    public void stat() {
        공격력();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("당신의 장수 " + name + "의 채력은" + hp + " 입니다.");
        System.out.println("당신의 장수 " + name + "의 근력은" + str + " 입니다.");
        System.out.println("당신의 장수 " + name + "의 지력은" + thin + " 입니다.");
        System.out.println("당신의 장수 " + name + "의 순발력은" + spe + " 입니다.");
        System.out.println("당신의 장수 " + name + "의 금전은" + money + " 입니다.");
        System.out.println("당신의 장수 " + name + "의 공격력은" + 공격력 + " 입니다.");
        System.out.println("당신의 장수 " + name + "의 병력은");
        System.out.println("기마병 :" + 기마병.hp + " 궁수 :" + 궁수.hp + " 보병 :" + 보병.hp + " 입니다.");
        System.out.println("당신의 장수 " + name + "의 통솔력은" + 통솔 + " 입니다.");
        System.out.println("=======================보유중인 장비=========================");
        for (int i = 0; i < 4; i++) {
            if (items[i] != null) {
                System.out.println(items[i]);
            }
        }
    }

    void getItem(Item item) {
        System.out.println(item.name + "(을)를 획득......!!");
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                items[i] = item;
                break;
            }
        }
//        str += item.str;
//        spe += item.spe;
//        ex += item.ex;
//        thin += item.thin;
    }
//    void seting(){//아이탬 장착 해제 실패.
//        장수 me=new 장수();
//        if (me.items != null) {
//            System.out.println("보유중인 장비가 없습니다.");
//            return;
//        }
//        System.out.println("장비 장착 또는 해제");
//        System.out.println("장착 : 1     해제 : 2");
//        int z = sc.nextInt();
//        if (z == 1) {
//            청룡언월도 청룡언월도 = new 청룡언월도();
//            장팔사모 장팔사모 = new 장팔사모();
//            헌창 헌창 = new 헌창();
//            출사표 출사표 = new 출사표();
//            System.out.println("장비 선택");
//            System.out.println(items[0].name + ": 1     " + items[1].name + " : 2     " + items[2].name + " : 3     " + items[3].name + ": 4");
//            System.out.println("선택 : ");
//            int b = sc.nextInt();
//            if(b==1){
//                if(!me.items[0].name.equals("청룡언월도")&&!me.items[1].name.equals("청룡언월도")&&!me.items[2].name.equals("청룡언월도")&&!me.items[3].name.equals("청룡언월도")){
//                    System.out.println("청룡언월도가 없습니다.");
//                    return;
//                }
//                청룡언월도.get(청룡언월도,me);
//            }if(b==2){
//                if(!me.items[0].name.equals("장팔사모")&&!me.items[1].name.equals("장팔사모")&&!me.items[2].name.equals("장팔사모")&&!me.items[3].name.equals("장팔사모")){
//                            System.out.println("장팔사모가 없습니다.");
//                            return;
//                }
//                장팔사모.get(장팔사모,me);
//            }if(b==3){
//                for (int i = 0; i < 4; i++){
//                    if(!me.items[i].name.equals("헌창")){
//                        System.out.println("헌창은 없습니다.");
//                        return;
//                    }
//                    헌창.get(헌창,me);
//                }
//                헌창.get(헌창,me);
//            }if(b==4){
//                for (int i = 0; i < 4; i++){
//                    if(!me.items[i].name.equals("출사표")){
//                        System.out.println("출사표는 없습니다.");
//                        return;
//                    }
//                }
//                출사표.get(출사표,me);
//            }
//
//        }
//    }

    void attack(상대 s) {
        공격력();
        System.out.println();
        System.out.println();
        System.out.println(name + "(은)는" + s.name + "(을)를 공격한다.");
        System.out.println(name + "(이)가 " + s.name + "에게" + 공격력 + "피해를 입혔다.");
        s.hp = s.hp - 공격력;
        System.out.println("현제 " + s.name + "의 채력은" + s.hp + "입니다.");
        System.out.println();
        System.out.println();
    }

    void attack1(상대 s) {
        공격력();
        if (s.hp <= 0) {
            System.out.println(s.name + "(은)는 이미 사망하였습니다.");
            return;
        }
        System.out.println();
        System.out.println();
        System.out.println(name + "(은)는 공격을 시도한다.");
        System.out.println("상단 : 1      하단 : 2");
        System.out.print("공격할 부위 선택 :");
        int aa = sc.nextInt();
        int bb = rd.nextInt(2) + 1;
        if (aa == bb) {
            System.out.println();
            System.out.println();
            System.out.println(name + "(이)가 " + s.name + "에게" + 공격력 + "피해를 입혔다.");
            System.out.println();
            System.out.println();
            s.hp = s.hp - 공격력;
        } else if (aa != bb) {
            System.out.println();
            System.out.println();
            System.out.println(s.name + "(은)는 " + name + "의 공격을 회피했다.");
            System.out.println();
            System.out.println();
        }

        System.out.println("현제 " + s.name + "의 채력은" + s.hp + "입니다.");
        System.out.println();
        System.out.println();
    }

    void bossattck(조조 s) {
        공격력();
        System.out.println(name + "(은)는 공격을 시도한다.");
        System.out.println("상단 : 1      하단 : 2     복부 : 3     왼쪽 : 4     오른쪽 : 5");
        System.out.print("공격할 부위 선택 :");
        int boss = sc.nextInt();
        int 조조at = rd.nextInt(5) + 1;
        if (boss == 조조at) {
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println(name + "(은)는" + s.name + "(을)를 공격한다.");
            System.out.println(name + "(이)가 " + s.name + "에게" + 공격력 + "피해를 입혔다.");
            s.hp = s.hp - 공격력;
            if (s.hp <= 0) {
                System.out.println("조조가 쓰려졌습니다.");
                System.out.println("★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆승리★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆");
            }
            System.out.println("현제 " + s.name + "의 채력은" + s.hp + "입니다.");
            System.out.println();
            System.out.println();
            System.out.println();
        } else if (boss != 조조at) {
            System.out.println("조조가 당신의 공격을 회피했습니다.");
            System.out.println("현제 " + s.name + "의 채력은" + s.hp + "입니다.");
            System.out.println();
            System.out.println();
            System.out.println();
        }
    }

    void bossattck1(조조1 s) {
        공격력();
        System.out.println(name + "(은)는 공격을 시도한다.");
        System.out.println("상단 : 1      하단 : 2     복부 : 3     왼쪽 : 4     오른쪽 : 5");
        System.out.print("공격할 부위 선택 :");
        int boss = sc.nextInt();
        int 조조at = rd.nextInt(5) + 1;
        if (boss == 조조at) {
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println(name + "(은)는" + s.name + "(을)를 공격한다.");
            System.out.println(name + "(이)가 " + s.name + "에게" + 공격력 + "피해를 입혔다.");
            s.hp = s.hp - 공격력;
            if (s.hp <= 0) {
                System.out.println("조조가 쓰려졌습니다.");
                System.out.println("★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆승리★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆");
            }
            System.out.println("현제 " + s.name + "의 채력은" + s.hp + "입니다.");
            System.out.println();
            System.out.println();
            System.out.println();
        } else if (boss != 조조at) {
            System.out.println("조조가 당신의 공격을 회피했습니다.");
            System.out.println("현제 " + s.name + "의 채력은" + s.hp + "입니다.");
            System.out.println("----------------------------------------");
        }
    }


    void giarmtogi(상대 s) {
        기마병.fighit(s.기마병);
    }

    void giarmtobo(상대 s) {
        기마병.fighit(s.보병);
    }

    void giarmtoac(상대 s) {
        기마병.fighit(s.궁수);
    }

    void boarmtogi(상대 s) {
        보병.fighit(s.기마병);
    }

    void boarmtobo(상대 s) {
        보병.fighit(s.보병);
    }

    void boarmtoac(상대 s) {
        보병.fighit(s.궁수);
    }

    void atarmtogi(상대 s) {
        궁수.fighit(s.기마병);
    }

    void atarmtobo(상대 s) {
        궁수.fighit(s.보병);
    }

    void atarmtoac(상대 s) {
        궁수.fighit(s.궁수);
    }
}

class 제갈량 extends 장수 {
    제갈량() {

        name = "제갈량";
        hp = 10000000;
        str = 100;
        thin = 1000;
        spe = 100;
        통솔 = 500;
        this.items = new Item[10];
        공격력 = (str / 4 + spe / 4 + thin * 2);
        보병.setStat("보병", 100000 + 통솔, 1000 + 통솔, 1 + 통솔);
        궁수.setStat("궁수", 100000 + 통솔, 1000 + 통솔, 0 + 통솔);
        기마병.setStat("기마병", 100000 + 통솔, 5000 + 통솔, 2 + 통솔);

    }
}

class 관우 extends 장수 {
    관우() {
        name = "관우";
        hp = 2000;
        str = 4500;
        thin = 800;
        spe = 1500;
        통솔 = 1;
        this.items = new Item[10];
        보병.setStat("보병", 100 + 통솔, 10 + 통솔, 2 + 통솔);
        궁수.setStat("궁수", 100 + 통솔, 20 + 통솔, 0 + 통솔);
        기마병.setStat("기마병", 100 + 통솔, 30 + 통솔, 4 + 통솔);
        공격력 = thin / 4 + str * (4 / 2) + spe;
    }
}

class 장비 extends 장수 {
    장비() {
        name = "장비";
        hp = 2000;
        str = 5500;
        thin = 400;
        spe = 2000;
        통솔 = 2;
        보병.setStat("보병", 100 + 통솔, 10 + 통솔, 2 + 통솔);
        궁수.setStat("궁수", 100 + 통솔, 20 + 통솔, 0 + 통솔);
        기마병.setStat("기마병", 100 + 통솔, 30 + 통솔, 4 + 통솔);
        this.items = new Item[10];
        //  통솔 = man / 9 * ex / 8;
        공격력 = thin / 5 + str * (3 / 2) + spe * (3 / 2);
    }
}

class 조운 extends 장수 {
    조운() {
        name = "조운";
        hp = 1500;
        str = 3500;
        thin = 700;
        spe = 3500;
        통솔 = 3;
        보병.setStat("보병", 100 + 통솔, 10 + 통솔, 2 + 통솔);
        궁수.setStat("궁수", 100 + 통솔, 20 + 통솔, 0 + 통솔);
        기마병.setStat("기마병", 100 + 통솔, 30 + 통솔, 4 + 통솔);
        this.items = new Item[10];
        공격력 = thin / 4 + str + spe * 2;
    }
}

