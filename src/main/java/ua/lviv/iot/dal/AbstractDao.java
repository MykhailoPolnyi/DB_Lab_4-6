package ua.lviv.iot.dal;

import java.util.List;

public interface AbstractDao<Entity> {
    public List<Entity> findAll();
    public Entity findById(Integer id);
    public Integer create(Entity newItem);
    public Integer update(Integer id, Entity updItem);
    public Integer delete(Integer id);
}
