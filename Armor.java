package Hero;

    public class Armor extends Item{
        int ac;
        public static void main(String[] args) {

          Armor ClothArmour = new Armor();

          ClothArmour.name="布甲";
          ClothArmour.price=300;
            ClothArmour.ac=15;

          Armor CarapaceBeetle = new Armor();

          CarapaceBeetle.name="锁子甲";
          CarapaceBeetle.price=500;
          CarapaceBeetle.ac=40;

          System.out.println( ClothArmour.ac);

            System.out.println( CarapaceBeetle.ac);


        }

    }


