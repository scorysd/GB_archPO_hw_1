package ru.geekbrains.lesson1.store3D.models;

public class Scene {
    private int id;
    private PoligonalModel poligonalModel;
    private Flash flash;

    public Scene(int id, PoligonalModel poligonalModel, Flash flash) {
        this.id = id;
        this.poligonalModel = poligonalModel;
        this.flash = flash;
    }
}
