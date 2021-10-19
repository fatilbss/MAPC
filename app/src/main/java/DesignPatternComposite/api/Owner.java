package DesignPatternComposite.api;

public class Owner extends ComposantImpl {
    private final String name;

    public Owner (String name){
        super();
        this.name=name;
    }

    @Override
    public int getSize() {
        return 0;
    }

    @Override
    public String getContent() {
        return null;
    }

    @Override
    public void appendContent(String name) {

    }

    @Override
    public boolean isComposite() {
        return false;
    }
}
