package InMemoryModel;

public class ModelStore extends IModelChangedObserver implements IModelChanger{
    public list<PoligonalModel> models;
    public List<Scene> scenes;
    public List<Flash> flashes;
    public List<Camera> cameras;
    private list<IModelChangeObserver> changeObservers;
}
   