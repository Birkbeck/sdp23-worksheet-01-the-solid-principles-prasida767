import javax.script.Bindings;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class FormalityMap {


    enum Formalities {
        CASUAL("casual", new Casual()),
        DEFAULT("default", new Default()),
        FORMAL("formal", new Formal()),
        INTIMATE("intimate", new Intimate());

        private final String formalityString;
        private final Personality classObject;

        Formalities(String formalityString, Personality classObject) {
            this.formalityString = formalityString;
            this.classObject = classObject;
        }

    }

    Personality getInstance(String formalityString) {
        for (Formalities formalities : Formalities.values()) {
            if (formalities.formalityString.equalsIgnoreCase(formalityString))
                return formalities.classObject;
        }
        return Formalities.DEFAULT.classObject;
    }


}
