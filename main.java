import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


public class main extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        GridPane pane = new GridPane();
        pane.setPadding(new Insets(10, 10, 10, 10));
        pane.setVgap(10);
        pane.setHgap(10);
        pane.add(new Label("Investment Amount"), 0, 0);
        pane.add(new Label("Years"), 0, 1);
        pane.add(new Label("Annual interest rate"), 0, 2);
        pane.add(new Label("Future value"), 0, 3);
        TextField box1 = new TextField();
        //int box01value=0;
        //int box02value=0;
        //int box03value=0;

        //Integer.parseInt(box1.getText().trim());
        pane.add(box1, 1, 0);
        TextField box2 = new TextField();
        //int box02=0;

        // int box02=Integer.parseInt(box2.getText().trim());
        pane.add(box2, 1, 1);
        TextField box3 = new TextField();
        pane.add(box3, 1, 2);
        TextField box4 = new TextField();
        pane.add(box4, 1, 3);
        Button calculate = new Button("calculate");
        calculate.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                Integer value1 = Integer.valueOf(box1.getText());
                Integer value2 = Integer.valueOf(box2.getText());
                Float value3 = Float.valueOf(box3.getText());
                value3=1+value3/1200;
                value2=value2*12;
                float finalvalue = (float) (value1 * Math.pow(value3,value2));
                System.out.println(finalvalue);
                box4.setText(String.valueOf(finalvalue));

            }
        });
        pane.add(calculate, 1, 4);
        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.show();
    }
}
    //int box03=Integer.parseInt(box3.getText().trim());
    //int  box03=0;
    //try {
    // int box03 = Integer.parseInt(box3.getText().trim());
    //  box03value=box03;
    // } catch (NumberFormatException nfe) {
    //    nfe.printStackTrace();



  /*  public float futurevalue(int investment,float rate,int years ){
        float futurevalue= (float) ((float) investment*Math.pow((1+rate),(years*12)));
        return futurevalue;
    }
*/
