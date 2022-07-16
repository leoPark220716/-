public class 병사 {
    String name;
    int hp;
    int dam;
    int shil;

    public void setStat(String name, int hp, int dam, int shil) {
        this.name = name;
        this.hp = hp;
        this.dam = dam;
        this.shil = shil;
    }

    void fighit(병사 s) {
        if (hp <= 0) {
            return;
        }
        if(s.hp<=0){
                  return;
        }
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("나의 " + name +" 병력 :"+hp+ "(이)가 상대 " + s.name + "(을)를 공격합니다.");
        if (dam < s.shil) {
            s.hp = s.hp - 0;
        } else {
            s.hp = s.hp - (dam - shil);
        }
        System.out.println("나의 "+name+" 공격력 ↗" + dam + " 상대의 "+s.name+"의 방어력 ◎" + s.shil);
        System.out.println("상대의 " + s.name + "의 현재 병력은 " + s.hp);
        System.out.println();
        System.out.println();
        System.out.println();
        if (s.hp <= 0) {
            System.out.println("상대의 " + s.name + "(은)는 괴멸되었습니다.");
            System.out.println();
            System.out.println();
            return;
        }
    }

    void fighit1(병사 s) {
        if (hp <= 0) {
            return;
        }if(s.hp<=0){
            return;
        }
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("                                                                                    상대의 "+ name +" 병력 :"+hp+ "(이)가 나의 " + s.name + "(을)를 공격합니다.");
        if (dam < s.shil) {
            s.hp = s.hp - 0;
        } else {
            s.hp = s.hp - (dam - shil);
        }
        System.out.println("                                                                                    상대의 "+name+" 공격력↗" + dam + "    나의 "+s.name+" 방어력 ◎" + s.shil);
        System.out.println("                                                                                    나의 " + s.name + "의 현재 병력은 " + s.hp);
        System.out.println();
        System.out.println();
        System.out.println();
        if (s.hp <= 0) {
            System.out.println("                                                                                    나의 " + s.name + "(은)는 괴멸되었습니다.");
            System.out.println();
            System.out.println();
            return;
        }
    }

}
