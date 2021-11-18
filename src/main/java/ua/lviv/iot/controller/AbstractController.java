package ua.lviv.iot.controller;

import java.util.List;

public interface AbstractController<Entity> {
    List<Entity> getAll();
    Entity getById(String idString);
    boolean create();
    boolean update();
    boolean delete(String idString);
}
