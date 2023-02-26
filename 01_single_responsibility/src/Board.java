import java.util.ArrayList;
import java.util.List;

public class Board {
    List<String> spots;

    public Board() {
        this.spots = new ArrayList<>();
        for (int i = 0; i < 9; i++) {
            this.spots.add(String.valueOf(i));
        }
    }

    public List<String> firstRow() {
        List<String> firstRow = new ArrayList<>();
        firstRow.add(this.spots.get(0));
        firstRow.add(this.spots.get(1));
        firstRow.add(this.spots.get(2));
        return firstRow;
    }

    public List<String> secondRow() {
        List<String> secondRow = new ArrayList<>();
        secondRow.add(this.spots.get(3));
        secondRow.add(this.spots.get(4));
        secondRow.add(this.spots.get(5));
        return secondRow;
    }

    public List<String> thirdRow() {
        List<String> thirdRow = new ArrayList<>();
        thirdRow.add(this.spots.get(6));
        thirdRow.add(this.spots.get(7));
        thirdRow.add(this.spots.get(8));
        return thirdRow;
    }

    // Poor code — can you improve this
}
