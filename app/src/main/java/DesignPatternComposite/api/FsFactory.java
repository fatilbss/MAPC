package DesignPatternComposite.api;

public class FsFactory {
    private FsFactory(){}
    public FsFactory INSTANCE = new FsFactory();
    public FsFactory getInstance(){return INSTANCE;}

    public Composant createComposant (ComposantType type, String name, Owner owner){
        return null;
    }



}
