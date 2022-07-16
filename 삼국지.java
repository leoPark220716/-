import java.util.*;

public class 삼국지 {
    public static void main(String[] args) {
        Bgm1 bg = new Bgm1();
        Thread cc=new Thread(bg);
        s1 s1 = new s1();
        s2 s2 = new s2();
        loding l = new loding();
        s1.start();
        try {
            s1.join();
        } catch (Exception e) {

        }
        s2.start();
        try {
            s2.join();
        } catch (Exception e) {

        }
        l.start();
        try {
            l.join();
        } catch (Exception e) {

        }cc.start();
        Item[] items;
        장수 me = new 장수();
        items = new Item[10];
        items[0] = new 청룡언월도();
        items[1] = new 장팔사모();
        items[2] = new 헌창();
        items[3] = new 출사표();

        gametext gm = new gametext();
        Scanner sc = new Scanner(System.in);
        gm.장수선택();
        int c = sc.nextInt();
        loding1 l1 = new loding1();
        l1.start();
        try {
            l1.join();
        } catch (Exception e) {
        }
        if (c == 1) {
            me = new 제갈량();
            me.name();
        } else if (c == 2) {
            me = new 관우();
            me.name();
        } else if (c == 3) {
            me = new 장비();
            me.name();
        } else if (c == 4) {
            me = new 조운();
            me.name();
        }
        while (true) {
            gm.선택();
            int a = sc.nextInt();
            if (a == 1) {
                me.stat();
            } else if (a == 2) {//전투
                System.out.println(me.name + "(는)은 전투를 하러 나선다................");//전투선택시 대사
                상대 s = new 상대();
                s.선택();
                int en = sc.nextInt();
                if (en == 1) {
                    상대장수대사 l2 = new 상대장수대사("우금");
                    l2.start();
                    try {
                        l2.join();
                    } catch (Exception e) {
                    }
                    s.우금();
                    gm.fs(s);
                } else if (en == 2) {
                    상대장수대사 l2 = new 상대장수대사("방덕");
                    l2.start();
                    try {
                        l2.join();
                    } catch (Exception e) {
                    }
                    s.방덕();
                    gm.fs(s);
                } else if (en == 3) {
                    상대장수대사 l2 = new 상대장수대사("하후연");
                    l2.start();
                    try {
                        l2.join();
                    } catch (Exception e) {
                    }
                    s.하후연();
                    gm.fs(s);
                } else if (en == 4) {
                    상대장수대사 l2 = new 상대장수대사("서황");
                    l2.start();
                    try {
                        l2.join();
                    } catch (Exception e) {
                    }
                    s.서황(new Item[]{items[0]});
                    gm.fs(s);
                } else if (en == 5) {
                    상대장수대사 l2 = new 상대장수대사("허저");
                    l2.start();
                    try {
                        l2.join();
                    } catch (Exception e) {
                    }
                    s.허저(new Item[]{items[1]});
                    gm.fs(s);
                } else if (en == 6) {
                    상대장수대사 l2 = new 상대장수대사("하후돈");
                    l2.start();
                    try {
                        l2.join();
                    } catch (Exception e) {
                    }
                    s.하후돈(new Item[]{items[2]});
                    gm.fs(s);
                } else if (en == 7) {
                    상대장수대사 l2 = new 상대장수대사("전위");
                    l2.start();
                    try {
                        l2.join();
                    } catch (Exception e) {
                    }
                    s.전위(new Item[]{items[3]});
                    gm.fs(s);
                }
                if (en <= 3) {
                    //전투내용
                    int fc = sc.nextInt();
                    if (fc == 1) {
                        Test t = new Test(s, me);
                        t.start();
                        while (true) {
                            me.attack(s);
                            if (s.hp <= 0) {
                                System.out.println("===========================================================");
                                System.out.println(s.name + "이(가) 도망쳤다.");
                                System.out.println("전투가 종료 되었습니다.");
                                System.out.println(s.money + "금전 획득");
                                me.money += s.money;
                                break;
                            }
                        }
                    } else if (fc == 2) {
                        병력싸움 zzz = new 병력싸움(s, me);
                        zzz.start();
                        while (true) {
                            System.out.println("공격하실 군대를 선택하십시요.");
                            System.out.println("내궁수  >> 상대궁수 : 1     내궁수 >> 상대보병 : 2     내궁수 >> 상대기병 : 3");
                            System.out.println("내기마병 >> 상대궁수 : 4   내기마병 >> 상대보병 : 5    내기마병 >> 상대기병 : 6");
                            System.out.println("내보병   >> 상대궁수 : 7   내보병 >> 상대보병 : 8     내보병 >> 상대기병 : 9");
                            int m = sc.nextInt();
                            if (1 == m) {
                                me.atarmtoac(s);
                            } else if (2 == m) {
                                me.atarmtobo(s);
                            } else if (3 == m) {
                                me.atarmtogi(s);
                            } else if (4 == m) {
                                me.giarmtoac(s);
                            } else if (5 == m) {
                                me.giarmtobo(s);
                            } else if (6 == m) {
                                me.giarmtogi(s);
                            } else if (7 == m) {
                                me.boarmtoac(s);
                            } else if (8 == m) {
                                me.boarmtobo(s);
                            } else if (9 == m) {
                                me.boarmtogi(s);
                            }
                            if (s.기마병.hp < 0 && s.궁수.hp < 0 && s.보병.hp < 0) {
                                System.out.println("===========================================================");
                                System.out.println(s.name + "이(가) 도망쳤다.");
                                System.out.println("전투가 종료 되었습니다.");
                                System.out.println(s.money + "금전 획득");
                                me.money += s.money;
                                break;
                            } else if (me.기마병.hp < 0 && me.궁수.hp < 0 && me.보병.hp < 0) {
                                System.out.println("패배");
                                break;
                            }
                        }
                    }
                } else if (en >= 4) {
                    int fc = sc.nextInt();
                    if (fc == 1) {
                        Test t = new Test(s, me);
                        t.start();
                        while (true) {
                            me.attack1(s);
                            if (s.hp <= 0) {
                                System.out.println("===========================================================");
                                System.out.println(s.name + "이(가) 도망쳤다.");
                                System.out.println("전투가 종료 되었습니다.");
                                System.out.println(s.money + "금전 획득");
                                me.getItem(s.itemDrop());
                                me.money += s.money;
                                break;
                            }
                        }
                    } else if (fc == 2) {
                        병력싸움 zzz = new 병력싸움(s, me);
                        zzz.start();
                        while (true) {
                            System.out.println("공격하실 군대를 선택하십시요.");
                            System.out.println("내궁수  >> 상대궁수 : 1     내궁수 >> 상대보병 : 2     내궁수 >> 상대기병 : 3");
                            System.out.println("내기마병 >> 상대궁수 : 4   내기마병 >> 상대보병 : 5    내기마병 >> 상대기병 : 6");
                            System.out.println("내보병   >> 상대궁수 : 7   내보병 >> 상대보병 : 8     내보병 >> 상대기병 : 9");
                            int m = sc.nextInt();
                            if (1 == m) {
                                me.atarmtoac(s);
                            } else if (2 == m) {
                                me.atarmtobo(s);
                            } else if (3 == m) {
                                me.atarmtogi(s);
                            } else if (4 == m) {
                                me.giarmtoac(s);
                            } else if (5 == m) {
                                me.giarmtobo(s);
                            } else if (6 == m) {
                                me.giarmtogi(s);
                            } else if (7 == m) {
                                me.boarmtoac(s);
                            } else if (8 == m) {
                                me.boarmtobo(s);
                            } else if (9 == m) {
                                me.boarmtogi(s);
                            }
                            if (s.기마병.hp < 0 && s.궁수.hp < 0 && s.보병.hp < 0) {
                                System.out.println("===========================================================");
                                System.out.println(s.name + "이(가) 도망쳤다.");
                                System.out.println("전투가 종료 되었습니다.");
                                System.out.println(s.money + "금전 획득");
                                me.money += s.money;
                                break;
                            } else if (me.기마병.hp < 0 && me.궁수.hp < 0 && me.보병.hp < 0) {
                                System.out.println("패배");
                                break;
                            }
                        }
                    }

                }
            } else if (a == 3) {
                System.out.println("다이소에 도착하였습니다.");
                if (me.money < 100) {
                    gm.nomoney();
                }
                while (me.money >= 100) {
                    상점 shop = new 상점();
                    System.out.println("보유중인 금전은" + me.money + " 입니다");
                    gm.상점목록();//물품
                    int shc = sc.nextInt();
                    if (shc == 1) {
                        shop.say();
                        int cr = sc.nextInt();
                        if (me.money < cr * shop.런닝머신) {
                            shop.re();
                            break;
                        }
                        me.money = shop.런닝머신(me.money, cr);//계산
                        me.hp += cr * 1000;
                        shop.suc(me.money);
                    } else if (shc == 2) {
                        shop.say();
                        int cr = sc.nextInt();
                        if (me.money < cr * shop.프로틴) {
                            shop.re();
                            break;
                        }
                        me.money = shop.프로틴(me.money, cr);
                        me.str += cr * 100;
                    } else if (shc == 3) {
                        shop.say();
                        int cr = sc.nextInt();
                        if (me.money < cr * shop.수학의정석) {
                            shop.re();
                            break;
                        }
                        me.money = shop.수학의정석(me.money, cr);
                        me.thin += cr * 100;
                    } else if (shc == 4) {
                        shop.say();
                        int cr = sc.nextInt();
                        if (me.money < cr * shop.줄넘기) {
                            shop.re();
                            break;
                        }
                        me.money += shop.줄넘기(me.money, cr);
                        me.spe += cr * 100;
                    } else if (shc == 5) {
                        shop.say();
                        int cr = sc.nextInt();
                        if (me.money < cr * shop.손자병법) {
                            shop.re();
                            break;
                        }
                        me.money = shop.손자병법(me.money, cr);
                        me.통솔 += cr * 1;
                    } else if (shc == 6) {
                        shop.say();
                        int cr = sc.nextInt();
                        if (me.money < cr * shop.man) {
                            shop.re();
                            break;
                        }
                        me.money = shop.man(me.money, cr);
                        me.기마병.hp += cr * 100;
                        me.보병.hp += cr * 100;
                        me.궁수.hp += cr * 100;
                    } else if (shc == 7) {
                        break;
                    }
                }
            } else if (a == 4) {//보스
                Bgm bgm = new Bgm();
                Thread t = new Thread(bgm);
                t.start();
                조조 s = new 조조();
                s.조조();
                int z = sc.nextInt();
                if (z == 1) {
                    Test d = new Test(s, me);
                    d.start();
                    while (true) {
                        me.bossattck(s);
                        if (s.hp <= 0) {
                            break;
                        }
                    }
                    if (s.hp <= 0) {
                        조조1 wh = new 조조1();
                        wh.조조1();
                        상대 q = new 상대();
                        상대 w = new 상대();
                        상대 e = new 상대();
                        조대 조대 = new 조대();
                        조대.start();
                        try {
                            조대.join();
                        } catch (Exception ce) {
                        }
                        while (true) {
                            me.bossattck1(wh);
                            wh.attack1(me);
                            if (wh.hp <= 8000) {
                                break;
                            }
                        }
                        if (wh.hp < 8000) {
                            System.out.println("■■■■■■■■■■■■■■■■■■장료가 참전했습니다.■■■■■■■■■■■■■■■■■");
                            q.장료();
                            Test2 y = new Test2(q, me, wh);
                            y.start();
                            while (true) {
                                System.out.println("공격하실 장수를 선택하세요");
                                System.out.println("조조 : 1     장료 : 2");
                                System.out.println("선택 :");
                                int h = sc.nextInt();
                                if (h == 1) {
                                    me.bossattck1(wh);
                                    wh.attack1(me);
                                } else if (h == 2) {
                                    me.attack1(q);
                                }
                                if (wh.hp <= 6000) {
                                    break;
                                }
                            }
                        }
                        if (wh.hp < 6000) {
                            System.out.println("■■■■■■■■■■■■■■■■■■순욱이 참전했습니다.■■■■■■■■■■■■■■■■■");
                            w.순욱();
                            Test2 y = new Test2(w, me, wh);
                            y.start();
                            while (true) {
                                System.out.println("공격하실 장수를 선택하세요");
                                System.out.println("조조 : 1     장료 : 2     순욱 : 3");
                                System.out.println("선택 :");
                                int h = sc.nextInt();
                                if (h == 1) {
                                    me.bossattck1(wh);
                                    wh.attack1(me);
                                } else if (h == 2) {
                                    me.attack1(q);
                                } else if (h == 3) {
                                    me.attack1(w);
                                }
                                if (wh.hp <= 5000) {
                                    break;
                                }
                            }
                        }
                        if (wh.hp < 5000) {
                            System.out.println("■■■■■■■■■■■■■■■■■■사마의가 참전했습니다.■■■■■■■■■■■■■■■■■");
                            e.사마의();
                            Test2 y = new Test2(e, me, wh);
                            y.start();
                            while (true) {
                                System.out.println("공격하실 장수를 선택하세요");
                                System.out.println("조조 : 1     장료 : 2     순욱 : 3     사마의 : 4");
                                System.out.println("선택 :");
                                int h = sc.nextInt();
                                if (h == 1) {
                                    me.bossattck1(wh);
                                    wh.attack1(me);
                                } else if (h == 2) {
                                    me.attack1(q);
                                } else if (h == 3) {
                                    me.attack1(w);
                                } else if (h == 4) {
                                    me.attack1(e);
                                }
                                if (wh.hp <= 0) {
                                    System.out.println("승리하였습니다.");
                                    승리 승리 = new 승리();
                                    승리1 승리1 = new 승리1();
                                    승리.start();
                                    try {
                                        승리.join();
                                    } catch (Exception cve) {

                                    }
                                    승리1.start();
                                    System.exit(0);
                                    break;
                                }
                            }
                        }
                    }

                } else if (z == 2) {
                    병력싸움 zzz = new 병력싸움(s, me);
                    zzz.start();
                    while (true) {
                        System.out.println("공격하실 군대를 선택하십시요.");
                        System.out.println("내궁수  >> 상대궁수 : 1     내궁수 >> 상대보병 : 2     내궁수 >> 상대기병 : 3");
                        System.out.println("내기마병 >> 상대궁수 : 4   내기마병 >> 상대보병 : 5    내기마병 >> 상대기병 : 6");
                        System.out.println("내보병   >> 상대궁수 : 7   내보병 >> 상대보병 : 8     내보병 >> 상대기병 : 9");
                        int m = sc.nextInt();
                        if (1 == m) {
                            me.atarmtoac(s);
                        } else if (2 == m) {
                            me.atarmtobo(s);
                        } else if (3 == m) {
                            me.atarmtogi(s);
                        } else if (4 == m) {
                            me.giarmtoac(s);
                        } else if (5 == m) {
                            me.giarmtobo(s);
                        } else if (6 == m) {
                            me.giarmtogi(s);
                        } else if (7 == m) {
                            me.boarmtoac(s);
                        } else if (8 == m) {
                            me.boarmtobo(s);
                        } else if (9 == m) {
                            me.boarmtogi(s);
                        }

                        if (s.기마병.hp < 0 && s.궁수.hp < 0 && s.보병.hp < 0) {
                            System.out.println("조조가 사망하였습니다.");
                            System.out.println("★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆승리★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆");
                            System.exit(0);
                        } else if (me.기마병.hp < 0 && me.궁수.hp < 0 && me.보병.hp < 0) {
                            System.out.println("패배");
                            break;
                        }
                    }
                }

            }
            else if (a == 5) {
                청룡언월도 aa=new 청룡언월도();
                장팔사모 dd=new 장팔사모();
                헌창 ff=new 헌창();
                출사표 gg=new 출사표();
                me.iv();
                System.out.println("장착하실 장비를 선택해주세요");
                System.out.println("청롱언월도 : 1     장팔사모 : 2     헌창 : 3     출사표 : 4");
                int kk=sc.nextInt();
                if(kk==1){
                        me.cr(aa,me);
                }else if(kk==2){
                             me.jp(dd,me);
                 }else if(kk==3){
                    me.hc(ff,me);
                }else if(kk==4){
                    me.chul(gg,me);
                }
            }
        }
    }
}





