package JAVACORE_TRAINING.TEACHER.JAVA_BASIC.STRUCTURE_PROGRAMMING.BAITOANBOXUNG.BAITOANSO04;

import java.util.Scanner;

public class MainApp02 {
	public static void main(String[] args) {
		//1. Khai báo biến và các tham số cấu hình cho hàm
		double dTotalKm;        
        System.out.println("- Nhập vào số Km đã đi?");
        Scanner dt = new Scanner(System.in);
        dTotalKm = dt.nextDouble();
        
        //2. Gọi hàm và nhận về kết quả
        double dCost = TinhCuocTaxi(dTotalKm, 5000, 30, 4000, 3000);
        System.out.println(String.format
									("- Số tiền phải trả là: %s", dCost));
	}
	
	private static double TinhCuocTaxi(double dKm, 
													int iGiaKmDauTien, 
															int iSoKmTiepTheoBiApGia,
																int iGiaKmTiepTheo,
																		int iGiaKmThem){
		double dCost = 0;
		if(dKm <= 1)      
      	  dCost = dKm * iGiaKmDauTien;        
        else if(dKm <= iSoKmTiepTheoBiApGia && dKm > 1)      
      	  dCost = (dKm - 1)*iGiaKmTiepTheo + 1*iGiaKmDauTien;       
        else     
      	  dCost = 1*iGiaKmDauTien + 
      			  			(iSoKmTiepTheoBiApGia-1)*iGiaKmTiepTheo 
      			  					+ (dKm - iSoKmTiepTheoBiApGia)*iGiaKmThem;      
		return dCost;
	}
}
