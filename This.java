package Hero;

public class This {
    String name;
    float hp;
    float armor;
    int moveSpend;

    public This(String name,float hp, float armor, int moveSpeed){
              this.name=name;
              this.hp=hp;
              this.armor=armor;
              this.moveSpend = moveSpeed;
    }

  public static void main(String[] args) {
        This  garen = new This("盖伦",600.21f,30.5f,300);
        
        System.out.println("英雄名称:"+garen.name+" "+"血量:"+garen.hp+" "+"护甲"+garen.armor+" "+"移动速度"+garen.moveSpend);
    }
}
