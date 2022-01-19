package Object_oriented_Programming2;

class SutdaDeck2{
    final int CARD_NUM = 20;
    SutdaCard2[] cards = new SutdaCard2[CARD_NUM];

    SutdaDeck2(){
        for(int i=0; i<CARD_NUM; i++){
            if(i==0 || i ==2 || i==7){
                cards[i] = new SutdaCard2(i + 1, true);
            } else{
                cards[i] = new SutdaCard2(1%10 + 1, false);
            }
        }
    }

    void shuffle(){
        int idx = 0;
        SutdaCard2 tmp;
        for(int i=0; i<CARD_NUM; i++){
            idx = (int)Math.random()%CARD_NUM;
            tmp = cards[idx];
            cards[idx] = cards[i];
            cards[i] = tmp;
        }
    }

    public SutdaCard2 pick(int index){
        if(index < 0 || index >=CARD_NUM)
            return null;
        return cards[index];
}

    SutdaCard2 pick(){
        int idx = (int)Math.random()%CARD_NUM;
        return cards[idx];
    }
}

class SutdaCard2{
    int num;
    boolean isKwang;

    SutdaCard2(){
        this(1, true);
    }

    SutdaCard2(int num, boolean isKwang){
        this.num = num;
        this.isKwang = isKwang;
    }
    public String toString() {
        return num + (isKwang ? "K" : "");
    }
}

public class practice7_2 {
    public static void main(String[] args) {
        SutdaDeck2 deck = new SutdaDeck2();

        System.out.println(deck.pick(0));
        System.out.println(deck.pick());
        deck.shuffle();

        for(int i=0; i<deck.cards.length; i++)
            System.out.print(deck.cards[i]+",");

        System.out.println();
        System.out.println(deck.pick(0));
    }
}
