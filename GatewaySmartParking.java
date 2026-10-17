import java.util.Scanner;
public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in); 
		
		if(!scanner.hasNextInt()) { 
			System.out.println("Invalid Input"); 
			return;
			
		}
		
		int vehicleType = scanner.nextInt(); 
		
		if (!scanner.hasNextDouble()) { 
			System.out.println("Invalid Input"); 
			return;
			
		} 
		
		double duration = scanner.nextDouble(); 
		
		if (vehicleType < 1 || vehicleType > 3 || duration <= 0) { 
			System.out.println("Invalid Input"); 
			return; 
			
		}
		
		String vehicleName = "";
		double baseFee = 0.0; 
		double additionalFeeRate = 0.0; 
		
		switch (vehicleType) { 
		case 1:
			vehicleName = "Motorcycle";
			baseFee = 2.00;
			additionalFeeRate = 1.00;
			
			break; 
			
		case 2: 
			vehicleName = "Car"; 
			baseFee = 5.00;
			additionalFeeRate = 2.00; 
			
			break; 
			
		case 3: 
			vehicleName = "Van";
			baseFee = 8.00;
			additionalFeeRate = 3.00;
			
			break; 
			
		} 
		
		double totalFee = baseFee;
		if(duration > 2.0) { 
			
			double extraHours = Math.ceil(duration - 2.0);
			totalFee += extraHours * additionalFeeRate; 
			
		}
		
		
		System.out.println("++++++++++++++++++++"); 
		System.out.println("Gateway Smart Parking"); 
		System.out.println("++++++++++++++++++++"); 
		System.out.println(vehicleName); 
		System.out.println(duration); 
		System.out.printf("RM %.2f\n", totalFee); 
		
		
	}

}
