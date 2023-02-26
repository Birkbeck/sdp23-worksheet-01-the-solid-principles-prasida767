public class BoardPosition implements DisplayBoardDetails{
    @Override
    public void displayBoardPosition(Board board) {
        String formattedFirstRow = board.spots.get(0) + " | " + board.spots.get(1) + " | " + board.spots.get(2) + "\n"
                + board.spots.get(3) + " | " + board.spots.get(4) + " | " + board.spots.get(5) + "\n"
                + board.spots.get(6) + " | " + board.spots.get(7) + " | " + board.spots.get(8);
        System.out.print(formattedFirstRow);
    }
}
