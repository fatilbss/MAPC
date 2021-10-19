package DesignPatternComposite.api;

public abstract class ComposantImpl implements Composant {
    private final String name;
    private Owner owner;

    public ComposantImpl(String name, Owner owner){
        this.name=name;
        this.owner=owner;
    }


    public boolean equals( Object o){
        return true; //a faire
    }

    public int hashCode(){
        return 0; // a faire
    }

    @Override
    public String getName(){
        return this.name;
    }

    @Override
    public Owner getOwner(){
        return this.owner;
    }

    @Override
    public void setOwner(Owner owner, boolean recursive){
        if (recursive==true) {
            this.owner = owner;
        }
    }

}
