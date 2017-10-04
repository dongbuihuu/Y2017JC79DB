package JAVACORE_TRAINING.TEACHER.JAVA_BASIC.STRUCTURE_PROGRAMMING.BAITOANBOXUNG.BAITOANSO05;

public class MainApps {
	public static void main(String[] args) {
		float a, b, c,d, e, f;
        float Dx, Dy, D;
        //Gán giá trị vào cho biến
        a = 1;
        b = 2;
        c = 9;
        d = 8;
        e = 2;
        f = -5;
        
        D = a*e - b*d;
        Dx = c*e - b*f;
        Dy = a*f - c*d;
       
        if(D == 0 && Dx == 0)
        	System.out.println("- Hệ pt vô số nghiệm!!!");           
        if(D == 0 && Dx != 0)
        	System.out.println("- Hệ pt vô nghiệm!!!");           
        if(D != 0)
        {
        	System.out.println("- Hệ pt có nghiệm!!!");
        	System.out.println(String.format("x = %s", Dx/D));
        	System.out.println(String.format("y = %s", Dy/D));
        }
	}
}
