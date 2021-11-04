package ua.lviv.iot.dal;

import java.util.List;

public class GeneralDao<Entity> implements AbstractDao<Entity>{

    @Override
    public List<Entity> findAll() {
        return null;
    }

    @Override
    public Entity findById(Integer id) {
        return null;
    }

    @Override
    public Integer create(Entity newItem) {
        return 0;
    }

    @Override
    public Integer update(Integer id, Entity updItem) {
        return 0;
    }

    @Override
    public Integer delete(Integer id) {
        return 0;
    }
}
