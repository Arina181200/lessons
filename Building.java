import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;

public class Building {
    Logger logger= LogManager.getLogger();
    private String name;
    private ArrayList<Room> roomlist=new ArrayList<Room>();


    void addRoom(String name, int area, int numberOfWindows)
    {
        Room room=new Room(name,area,numberOfWindows);
        roomlist.add(room);
        logger.info(roomlist);

    }


    void addLight(int countOfLight, int light, int numberOfWindows)
    {
        int windowLight=700;
        int lightSum=0;
        lightSum+=countOfLight*light+windowLight*numberOfWindows;
        if(lightSum>4000&&lightSum<300) {
            logger.error("Много освещения");
            throw new illuminanceTooMuchException();
        }
        else {
            logger.info("Количество ламп "+countOfLight+" Освещение "+lightSum);
        }
        }
    void addFurniture(String nameOfFurniture ,int areaOfFurniture){
        int firstArea=0;
        firstArea+=areaOfFurniture;
        int maxOFarea=(firstArea*70)/100;
        if(firstArea>maxOFarea)
        {
            logger.error("Использовано много места "+firstArea);
            throw new SpaceUsageTooMuchException();

        }
        else
        {
            logger.info(" Мебель:"+nameOfFurniture+" размер"+firstArea);
        }
    }

    @Override
    public String toString() {
        return "Building{" +
                "logger=" + logger +
                ", name='" + name + '\'' +
                ", roomlist=" + roomlist +
                '}';
    }
}
