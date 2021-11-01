package ua.com.alevel.db;

import ua.com.alevel.entity.AdtFlat;
import ua.com.alevel.mass.Mass;

import java.util.UUID;

public class AdtFlatDB {

    private Mass<AdtFlat> adtFlats;
    private static AdtFlatDB instance;

    private AdtFlatDB() {
        adtFlats = new Mass<>();
    }

    public static AdtFlatDB getInstance() {
        if (instance == null)
            instance = new AdtFlatDB();
        return instance;
    }

    public void create(AdtFlat adtFlat) {
        adtFlat.setId(generateId());
        adtFlats.add(adtFlat);
    }

    public void update(AdtFlat adtFlat) {
        for (int i = 0; i < adtFlats.size(); i++)
            if (adtFlats.get(i).getId().equals(adtFlat.getId())) {
                adtFlats.get(i).setRoom(adtFlat.getRoom());
                adtFlats.get(i).setName(adtFlat.getName());
                adtFlats.get(i).setPrice(adtFlat.getPrice());
                adtFlats.get(i).setCity(adtFlat.getCity());
            }
    }

    public void delete(String id) {
        for (int i = 0; i < adtFlats.size(); i++)
            if (adtFlats.get(i).getId().equals(id)) {
                adtFlats.remove(i);
                break;
            }
    }

    public AdtFlat findById(String id) {
        for (int i = 0; i < adtFlats.size(); i++)
            if (adtFlats.get(i).getId().equals(id))
                return adtFlats.get(i);
        return null;
    }

    public Mass<AdtFlat> findAll() {
        return adtFlats;
    }

    private String generateId() {
        String id = UUID.randomUUID().toString();
        for (int i = 0; i < adtFlats.size(); i++)
            if (adtFlats.get(i).getId().equals(id))
                return generateId();
        return id;
    }
}
