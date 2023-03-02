package kodlama.io.Devs.entities.concretes;

public class Knowledge {

    private int id;
    private String languageName;

    public Knowledge(){
    }

    public Knowledge(int id, String languageName) {
        this.id = id;
        this.languageName = languageName;
    }

    public Knowledge getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLanguageName() {
        return languageName;
    }

    public void setLanguageName(String languageName) {
        this.languageName = languageName;
    }
}