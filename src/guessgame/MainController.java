package guessgame;

import javafx.scene.control.Spinner;
import javafx.scene.control.TableView;

public class MainController {

    private int turnNr = 0;
    public Spinner<Integer> num1;
    public Spinner<Integer> num2;
    public Spinner<Integer> num3;
    public Spinner<Integer> num4;
    public TableView<Turn> strawb;

    public void initialize(){
        System.out.println("Hello");
    }

    public void go(){
        turnNr++;
        int n1 = num1.getValue();
        int n2 = num2.getValue();
        int n3 = num3.getValue();
        int n4 = num4.getValue();
        System.out.println("" + n1 + n2 + n3 + n4);
        Turn cherry = new Turn();
        cherry.setGuess("" + n1 + n2 + n3 + n4);
        cherry.setTurnNr(turnNr);

        strawb.getItems().add(cherry);
    }
}
