package edu.ostrov;

public class SwitchDemo {

	public static void main(String[] args) {
		
		int mesiac = 133;
		System.out.print(mesiac + ". mesiac je ");
		switch(mesiac){
		case 1:
			System.out.println("Januar");
			break;
		case 2:
			System.out.println("Februar");
			break;
		case 3:
			System.out.println("Marec");
			break;
		case 4:
			System.out.println("April");
			break;
		case 5:
			System.out.println("Maj");
			break;
		case 6:
			System.out.println("Jun");
			break;
		case 7:
			System.out.println("Jul");
			break;
		case 8:
			System.out.println("August");
			break;
		case 9:
			System.out.println("September");
			break;
		case 10:
			System.out.println("Oktober");
			break;
		case 11:
			System.out.println("November");
			break;
		case 12:
			System.out.println("December");
			break;
		default:
			System.out.println("nespravny");
		}
		
		int denVTyzdni = 6;
		
		switch(denVTyzdni){
		case 1:
		case 2:
		case 3: 
		case 4:
		case 5:
			System.out.print(denVTyzdni + ". den je pracovny");
			break;
		case 6:
		case 7:
			System.out.print(denVTyzdni + ". den je vikend");
			
		case 8:
			System.out.println(" hurraaaaa");
			break;
		default:
			System.out.println("zly den v tyzdni");
		}
	}
}
