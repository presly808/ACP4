package model;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by serhii on 22.03.15.
 */
public class UserContainer {

    private Map<Integer, User> map = new HashMap<>();

    public UserContainer() {

        map.put(1, new User(1,"Kolia",1288));
        map.put(2, new User(2,"Vasia",1288));
        map.put(3, new User(3, "Oleg", 1288));

    }


    public Map<Integer, User> getMap() {
        return map;
    }

    public void setMap(Map<Integer, User> map) {
        this.map = map;
    }
}
