package ClassAndObjects;

public class House {
    int rooms;
    String color;
    String address;

    void displayHouseDetails(){
        System.out.println("---------------------------");
        System.out.println("Number of Room is: "+rooms);
        System.out.println("House color: "+color);
        System.out.println("House address: "+address);
    }
}
class HouseTest{
    static void main(String[] args) {
        House house = new House();
        house.rooms = 1;
        house.color = "Violet";
        house.address = "28/3, Chetan Vihar colony, Sankri gali, Patna";
        house.displayHouseDetails();

        house.rooms = 2;
        house.color = "Gajari";
        house.address = "28/3, Chetan Vihar colony, Sankri gali, Patna";
        house.displayHouseDetails();

        house.rooms = 3;
        house.color = "Light Red";
        house.address = "28/3, Chetan Vihar colony, Sankri gali, Patna";
        house.displayHouseDetails();
    }
}
