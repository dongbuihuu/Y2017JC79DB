package JAVACORE_TRAINING.TEACHER.OOP_CONCEPT.ABSTRACTIONS.INSTANCE_OBJECT;

public class DEMO {

    public static void main(String[] args) {

        // Khai báo giao diện GUI
        VIEWS objView = null;

        // 1. View với TextBox
        objView = new ControlGUI();
        System.out.println("Info: " + objView.PrintInfo());

        // 2. View với Button
        objView = new ButtonGui();
        System.out.println("Info: " + objView.PrintInfo());  
        
        //3. View với ListView
        objView = new ListViewGUI();
        System.out.println("Info: " + objView.PrintInfo());       
        
    }
}
