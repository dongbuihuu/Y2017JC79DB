package JAVACORE_TRAINING.TEACHER.OOP_CONCEPT.ABSTRACTIONS.INSTANCE_OBJECT_WITH_INTERFACE;

public class DEMO {

    public static void main(String[] args) {

        // Khai báo giao diện GUI
        IVIEWS objView = null;

        // 1. View với TextBox
        objView = new TextBoxGui();
        System.out.println("Info: " + objView.PrintInfo());

        // 2. View với Button
        objView = new ButtonGui();
        System.out.println("Info: " + objView.PrintInfo());  
        
        //3. View với ListView 
        objView = new ListViewGUI();
        System.out.println("Info: " + objView.PrintInfo());
    }
}
