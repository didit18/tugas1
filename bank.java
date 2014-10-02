import java.util.*;

class bank{
	public static void main(String[]args){
		int saldo = 200000;
		Scanner scan = new Scanner (System.in);
		
		boolean ulang = true;
		do{
			System.out.println("\nBANK NASIONAL");
			System.out.println("\nSALDO ANDA : " + saldo);
		
			System.out.println("\n == MENU UTAMA == ");
			System.out.println("\n1. SETOR.");
			System.out.println("2. TARIK TUNAI.");
			System.out.println("0. KELUAR");
			
			System.out.print("\nMASUKKAN PILIHAN: ");
			int menu = scan.nextInt();
			
			if(menu==1){
				System.out.print("\nMASUKKAN UANG: ");
				int uang = scan.nextInt();
				saldo = saldo + uang;
				}				
			
			else if(menu==2)
			{ System.out.print("\nMASUKKAN UANG: ");
				int uang = scan.nextInt();
				saldo = saldo - uang;
			}
			
			else if(menu==0)
			{System.out.print("\nTERIMA KASIH");
			}				
			
			else
			System.out.print("\nINPUT SALAH");
			}
		while(ulang==true);		
		}
	}