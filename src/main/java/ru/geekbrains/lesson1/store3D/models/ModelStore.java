package ru.geekbrains.lesson1.store3D.models;

public class ModelStore {
    private PoligonalModel poligonalModel;
    private Scene scene;
    private Flash flash;
    private Camera camera;
//    private

    public ModelStore(PoligonalModel poligonalModel, Scene scene, Flash flash, Camera camera) {
        this.poligonalModel = poligonalModel;
        this.scene = scene;
        this.flash = flash;
        this.camera = camera;
    }
}
