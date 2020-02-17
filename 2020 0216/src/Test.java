//对二维数组的使用，扑克牌,洗牌游戏


import java.util.*;


//牌的结构
class Card{
    private String suit;     //代表花色
    private int rank;         //牌的大小

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
        return suit+";"+strNum;
    }
}

class CardDeam{
    //1.构造一副扑克牌

    String Color[]={"♥","♦","♣","♠"};

    public List<Card> BuyDeck(){
        List<Card> cards=new ArrayList<>();
        for(int i=0;i<4;i++){
            for(int j=1;j<=13;j++){
                //牌的信息，牌面值和花色
                Card c=new Card(Color[i],j);
                cards.add(c);
            }
        }
        return cards;
    }

    private void Swap(List<Card> cards,int i,int j){
        Card temp=cards.get(i);
        cards.set(i,cards.get(j));
        cards.set(j,temp);
    }

    //2.洗牌算法,打乱扑克牌
    public void ShuffleCard(List<Card> cards){
        //①从后往前依此取牌i
        for(int i=cards.size()-1;i>0;i--){
            //②从[0，i)随机取一张扑克牌j   ---Random
            Random r=new Random();   //设置种子的方式一般是获取当前系统时间，每一次保证都不同
            int j=r.nextInt(i);
            //③将i和j位置上进行交换
            Swap(cards,i,j);
        }
    }



}

public class Test{
    public static void main(String[] args) {
        CardDeam cd=new CardDeam();

        //构造一副扑克牌
        List<Card> L=cd.BuyDeck();
        cd.ShuffleCard(L);
        System.out.println(L);


        //3个玩家，每人摸5张牌
        List<List<Card>> hands=new ArrayList<>();
        for(int i=0;i<3;i++){
            hands.add(new ArrayList<>());
        }

        for(int i=0;i<5;i++){
            for(int j=0;j<3;j++){
                //从L中依此获取一张牌
                Card card=L.remove(0);
                //将该牌放置到对应人手里
                hands.get(j).add(card);
            }
        }

        //依次打印每个人手中的牌
        for(int i=0;i<hands.size();i++){
            System.out.println(hands.get(i));
        }
        //牌堆中还剩下什么牌
        System.out.println(L.size());
        System.out.println(L);
    }
}