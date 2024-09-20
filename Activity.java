public class Activity{
    public static void main(String[] args){

        Dog puppy = new Dog();

        puppy.setName("aso");

        System.out.println(puppy.showName());

        puppy.bark();

        puppy.listofpuppies = new String[] {"putim", "browny", "blacky", "yusop", "kaido", "avatar", "zoro"};

        int shownumber = puppy.show_numofpuppies();

        System.out.println("Number of puppies: " + shownumber);

        puppy.show_numofpuppies();

        puppy.showpuppies();
    }
}