package ua.com.alevel.dao;

import ua.com.alevel.db.AdtFlatDB;
import ua.com.alevel.entity.AdtFlat;
import ua.com.alevel.mass.Mass;

public class AdtFlatDao {

    public void create(AdtFlat adtFlat) {
        AdtFlatDB.getInstance().create(adtFlat);
    }

    public void update(AdtFlat adtFlat) {
        AdtFlatDB.getInstance().update(adtFlat);
    }

    public void delete(String id) {
        AdtFlatDB.getInstance().delete(id);
    }

    public AdtFlat findById(String id) {
        return AdtFlatDB.getInstance().findById(id);
    }

    public Mass<AdtFlat> findAll() {
        return AdtFlatDB.getInstance().findAll();
    }
}
