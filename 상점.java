import java.util.Scanner;

class 상점 {
    int 런닝머신 = 100;
    int 프로틴 = 100;
    int 수학의정석 = 100;
    int 줄넘기 = 100;
    int 손자병법=500;
    int man=100;
    void say (){
        System.out.println("몇개를 구입하시겠습니까");
        System.out.print("개 :");
    }
    void re(){
        System.out.println("가지고있는돈이 부족합니다. 다음에 오세요^^");
    }
    void suc(int a){
        System.out.println("구입에 성공 하셨습니다");
    }

    int 런닝머신(int money, int num) {
        System.out.println("런닝머신(을)를 선택하셨습니다");
        return money - num * 런닝머신;
    }

    int 프로틴(int money, int num)
    {System.out.println("프로틴(을)를 선택하셨습니다");
        return money - num * 프로틴;
    }

    int 수학의정석(int money, int num)
    {System.out.println("수학의 정석(을)를 선택하셨습니다");
        return money - num * 수학의정석;
    }

    int 줄넘기(int money, int num)
    {System.out.println("줄넘기(을)를 선택하셨습니다");
        return money - num * 줄넘기;
    }
    int 손자병법(int money,int num){System.out.println("손자병법(을)를 선택하셨습니다");
    return money-num*손자병법;
    }
    int man(int money,int num){System.out.println("병사보충(을)를 선택하셨습니다(100금전)");
        return money-num*man;
    }
}
