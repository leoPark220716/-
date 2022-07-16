import java.util.Random;

public class gametext {
    Random rd=new Random();


    void 선택(){
        System.out.println("===========================================================");
        System.out.println("무엇을 하시겠습니까?");
        System.out.println("상태확인 : 1     전투 : 2     다이소 : 3     조조(boss) : 4");
        System.out.println("===========================================================");
        System.out.print("선택 : ");
    }
    void 장수선택(){
        System.out.println("당신의 장수를 선택하십시요");
        System.out.println("===========================================================");
        System.out.println("제갈량 : 1     관우 : 2     장비 : 3     조운 : 4");
        System.out.println("===========================================================");
        System.out.print("선택 : ");
    }
    void goal(){
        System.out.println("=======================조조 물리치기=========================");
        System.out.println("조조가 어쩌구저쩌구 유비가 어쩌구저쩌구 그래서 어쩌구저쩌구");
        System.out.println("조조를 이겨라");
    }void 상점목록(){
        System.out.println("구입목록");
        System.out.println("런닝머신 : 1 (100)     프로틴 : 2 (100)     수학의 정석 : 3 (100)     줄넘기 : 4 (100)     손자병법 : 5 (100)");
        System.out.println("손자병법 : 5 (500)     병사보충 : 6 (100)     나가기 : 7");
        System.out.print("선택 :");
    }void nomoney(){
        System.out.println("살수있는 물건이 없습니다.");
        System.out.println("다시 돌아갑니다.");
    }void fs(상대 s){
        System.out.println(s.name + "(와)과 전투를 시작합니다.");
        System.out.println("전투 방식을 선택하세요.");
        System.out.println("일기토 : 1     전쟁 : 2");
    }
}