public class Animal {
    private String animalName;

    public Animal(String animalName) {
        this.animalName= animalName;
    }

    public void animalSound(){
        System.out.println("Roarr!");}

        public static void animalSound(String intensity){


            if (intensity.equals("high")){
                System.out.println(" Roarrrrrrrr!");
            } else if (intensity.equals("low")) {
                System.out.println("Roar");
            }
        }


}
