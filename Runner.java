import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;



public class Runner {
    @Override
    public String toString() {
        return "Runner{}";
    }

    public static void main(String[] args)
    {
        System.setProperty("log4j.configurationFile","C:\\Users\\22807\\finalproject\\src\\main\\resources\\log4j2.xml");
        Logger logger= LogManager.getLogger();
        Building building=new Building();
        building.addRoom("Комната 1",25,3);
        building.addLight(3,400,3);
        building.addFurniture("Диван",23);


    }
}