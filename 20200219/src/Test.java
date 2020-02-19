//牌的结构

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Card{
    private String suit;
    private int rank;

    public Card(String suit,int rank){
        this.suit=suit;
        this.rank=rank;
    }

    @Override
    public String toString() {
        String strNum=String.format("%d",rank);
        switch(rank){
            case 11:
                strNum="J";
                break;
            case 12:
                strNum="Q";
                break;
            case 13:
                strNum="K";
                break;
        }
        return suit+strNum;
    }
}

class CardOperation{
    private String[] color={"♥","♦","♣","♠"};

    //构造扑克牌
    public List<Card> buyDeck(){
        List<Card> card=new ArrayList<>();

        for(int i=0;i<4;i++){
            for(int j=1;j<14;j++){
                card.add(new Card(color[i],j));
            }
        }
        return card;
    }


    //洗牌算法
    public void ShuffleCard(List<Card> cards){
        //1.从后向前依此取牌
        for(int i=cards.size()-1;i>0;i--){
            //2.从[0，i)随机选取一张扑克牌
            Random r=new Random();
            int j=r.nextInt(i);
            //3.将i和j上的位置互换
            Swap(cards,i,j);
        }
    }

    private void Swap(List<Card> cards,int i,int j){
        Card temp=cards.get(i);
        cards.set(i,cards.get(j));
        cards.set(j,temp);
    }
}

public class Test{
    public static void main(String[] args) {
        CardOperation card=new CardOperation();
        List<Card> card1=card.buyDeck();
        System.out.println(card1);
        card.ShuffleCard(card1);
        System.out.println(card1);
    }
}