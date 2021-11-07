package ua.com.alevel.service;

import ua.com.alevel.dao.AdtFlatDao;
import ua.com.alevel.entity.AdtFlat;
import ua.com.alevel.mass.Mass;

public class AdtFlatService {

    private final AdtFlatDao adtFlatDao = new AdtFlatDao();

    public void create(AdtFlat adtFlat) {
        adtFlatDao.create(adtFlat);
    }

    public void update(AdtFlat adtFlat) {
        adtFlatDao.update(adtFlat);
    }

    public void delete(String id) {
        adtFlatDao.delete(id);
    }

    public AdtFlat findById(String id) {
        return adtFlatDao.findById(id);
    }

    public Mass<AdtFlat> findAll() {
        return adtFlatDao.findAll();
    }
}
