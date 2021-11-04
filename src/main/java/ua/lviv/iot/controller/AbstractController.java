package ua.lviv.iot.controller;

import java.util.List;

public interface AbstractController<Entity> {
    public List<Entity> getAll();
    public Entity get(Integer id);
    public Integer create(Entity newItem);
    public Integer update(Integer id, Entity updItem);
    public Integer delete(Integer Id);
}
