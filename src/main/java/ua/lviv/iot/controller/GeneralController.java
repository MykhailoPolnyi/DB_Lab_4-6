package ua.lviv.iot.controller;

import ua.lviv.iot.dal.GeneralDao;

import java.util.List;


public class GeneralController<Entity> implements AbstractController<Entity> {
    private final GeneralDao<Entity> dao;

    public GeneralController (GeneralDao<Entity> dao) {
        this.dao = dao;
    }

    @Override
    public List<Entity> getAll() {
        return dao.findAll();
    }

    @Override
    public Entity get(Integer id) {
        return dao.findById(id);
    }

    @Override
    public Integer create(Entity newItem) {
        return dao.create(newItem);
    }

    @Override
    public Integer update(Integer id, Entity updItem) {
        return dao.update(id, updItem);
    }

    @Override
    public Integer delete(Integer id) {
        return dao.delete(id);
    }
}
