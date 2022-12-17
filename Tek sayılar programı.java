/******************************************************************************

Java döngüler ile negatif bir değer girilene kadar kullanıcıdan girişleri kabul eden
ve girilen değerlerden tek sayıları toplayıp ekrana basan programı yazıyoruz.
*******************************************************************************/
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
	    
	    int n;
/* Amac tek sayıları toplayan program yazmak
Bunun için bir Toplam degiskeni gerekir, her tek sayı buldugumuzda toplama eklemesi gerekir
0 atamamızın nedeni eger hiç tek sayı yoksa 0 olacağı için, 0 atamazsak hata verir*/
	    int toplam =0;
	    
		Scanner inp = new Scanner(System.in);
		
		/* burada do'yu bir kere kullanıyorz ki kullanıcı bi sayı girsin önce*/
		
		do{
		    System.out.print("Sayı giriniz: ");
		    n= inp.nextInt();
		    if(n%2 == 1){
		        /* asagıdakinin uzun yolu bu toplam=toplam+n */;
		        toplam+=n;
		    }
		}while (n>0);
		
		System.out.print("Toplam "+ toplam);
	}
}
