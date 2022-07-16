public class Item {
    장수 장수=new 장수();
    String name;
    int str;
    int spe;
    int thin;
    int ex;
}
class 청룡언월도 extends Item {
    청룡언월도() {
        name = "청룡언월도";
        str = 5000;
        spe = 0;
        thin = 0;

    }
    public String toString() {//객체정보??? 문자열로 바꿔준다는 메서드
        String a = name + ":";
        a += " 근력+" + str;
        a += " 순발력+" + spe;
        a += " 지력+" + thin;
        return a;
    }
    void get(청룡언월도 청룡언월도, 장수 me){
        me.str += 청룡언월도.str;
        me.spe += 청룡언월도.spe;
        me.thin += 청룡언월도.thin;
        me.ex += 청룡언월도.ex;
    }void mget(청룡언월도 청룡언월도, 장수 me){
        me.str -= 청룡언월도.str;
        me.spe -=청룡언월도.spe;
        me.thin -=청룡언월도.thin;
        me.ex -= 청룡언월도.ex;
    }
}


class 장팔사모 extends Item {
        장팔사모() {
            name = "장팔사모";
            str = 2500;
            spe = 2500;
            thin = 0;

        }
    public String toString() {//객체정보??? 문자열로 바꿔준다는 메서드
        String a = name + ":";
        a += " 근력+" + str;
        a += " 순발력+" + spe;
        a += " 지력+" + thin;
        return a;
    }
    void get(장팔사모 장팔사모, 장수 me){
        me.str += 장팔사모.str;
        me.spe += 장팔사모.spe;
        me.thin +=장팔사모.thin;
        me.ex += 장팔사모.ex;
    }void mget(장팔사모 장팔사모, 장수 me){
        me.str -= 장팔사모.str;
        me.spe -= 장팔사모.spe;
        me.thin -=장팔사모.thin;
        me.ex -= 장팔사모.ex;
    }
}


class 헌창 extends Item {
            헌창() {
                name = "헌창";
                str = 0;
                spe = 10000;
                thin = 0;

            }
    public String toString() {//객체정보??? 문자열로 바꿔준다는 메서드
        String a = name + ":";
        a += " 근력+" + str;
        a += " 순발력+" + spe;
        a += " 지력+" + thin;
        return a;
    }
    void get(헌창 헌창, 장수 me){
        me.str += 헌창.str;
        me.spe += 헌창.spe;
        me.thin +=헌창.thin;
        me.ex += 헌창.ex;
    }void mget(헌창 헌창, 장수 me){
        me.str -= 헌창.str;
        me.spe -= 헌창.spe;
        me.thin -=헌창.thin;
        me.ex -= 헌창.ex;
    }

}


class 출사표 extends Item {
                출사표() {
                    name = "출사표";
                    str = 0;
                    spe = 0;
                    thin = 10000;

                }
    public String toString() {//객체정보??? 문자열로 바꿔준다는 메서드
        String a = name + ":";
        a += " 근력+" + str;
        a += " 순발력+" + spe;
        a += " 지력+" + thin;
        return a;
    }
    void get(출사표 출사표, 장수 me){
        me.str += 출사표.str;
        me.spe += 출사표.spe;
        me.thin +=출사표.thin;
        me.ex += 출사표.ex;
    }void mget(출사표 출사표, 장수 me){
        me.str -= 출사표.str;
        me.spe -= 출사표.spe;
        me.thin -=출사표.thin;
        me.ex -= 출사표.ex;
    }
}

