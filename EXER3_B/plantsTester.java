public class plantsTester{
    public static void main(String[] args){
        plants p1 = new plants(null, null);
        plants p2 = new plants(null, null);
        plants p3 = new plants(null, null);

        p1.setName("Rosemary");
        p1.setPlantType("Herbs");
        p2.setName("Acacia");
        p2.setPlantType("Tree");
        p3.setName("Rose");
        p3.setPlantType("Shrubs");

        System.out.println("Plant 1: ");
        System.out.println("Name: " + p1.getName());
        System.out.println("Plant Type: " + p1.getPlantType());
        

        System.out.println("Plant 2: ");
        System.out.println("Name: " + p2.getName());
        System.out.println("Plant Type " + p2.getPlantType());


        System.out.println("Plant 3: ");
        System.out.println("Name " + p3.getName());
        System.out.println("Plant Type" + p3.getPlantType());
    }

}