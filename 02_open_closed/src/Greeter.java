import java.util.Objects;

public class Greeter {
    private Personality personality;

    public void setFormality(String formality) {
        FormalityMap formalityMap = new FormalityMap();
        this.personality = formalityMap.getInstance(formality);
    }

    public String greet() {
        if(this.personality == null)
            return new Default().greet();
        return this.personality.greet();
    }

}
