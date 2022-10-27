package dersdort;

import java.util.Scanner;
//c ,a,a,d
public class Test {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
	    String birinci,ikinci,ucuncu,dorduncu;
	    String[] cevap=new String[4];
	    int point=0;
	    String[] cevanahtar= {"c","a","a","d"};
	    
System.out.println("Küresel ısınmaya karşı en savunmasız hayvan hangisidir?");
System.out.print(" a) kar leoparı \n b)kutup ayısı \n c)deniz gergedanı \n d)tukan\n");
birinci=s.nextLine();
cevap[0]=birinci;
if(birinci.equals("c")||birinci.equals("C") ){
	 System.out.println("cevap doğru");
	 point +=1;
	
	}
else { 
	System.out.println("cevap yanlış");
	point =0;
}


System.out.printf(" \nAşağıdakilerden hangisi küresel ısınmanın olumsuz bir etkisi değildir?\na)Daha büyük balık nüfusu.\r\n"
		+ "b)Yeni bulaşıcı hastalıkların ortaya çıkması.\r\n"
		+ "c)Türlerin yok olması.\r\n"
		+ "d)Kıyı alanlarının kaybı.\n");
ikinci=s.nextLine();
cevap[1]=ikinci;
if(ikinci.equals("a")||ikinci.equals("A") ){
	 System.out.println("cevap doğru");
	 point +=1;
	}


else { 
	System.out.println("cevap yanlış");
	point =0;
}


System.out.printf("\nBunlardan hangisi toksik bir sera gazıdır?\na)Nitrojen\r\n"
		+ "b)Oksijen\r\n"
		+ "c)Karbonmonoksit\r\n"
		+ "d)Metan\n");
ucuncu=s.nextLine();
cevap[2]=ucuncu;
if(ucuncu.equals("a")||ucuncu.equals("A") ){
	 System.out.println("cevap doğru");
	 point +=1;
	}


else { 
	System.out.println("cevap yanlış");
	point =0;
}




System.out.println("\nAşağıdakilerden hangisi küresel ısınmaya neden olabilir?\na)Büyüyen ağaçlar\r\n"
		+ "b)Balıkların yüzmesi\r\n"
		+ "c)Volkanlar\r\n"
		+ "d)Heyelan");
dorduncu=s.nextLine();
cevap[3]=dorduncu;
if(dorduncu.equals("d")||dorduncu.equals("D") ){
	 System.out.println("cevap doğru");
	 point +=1;
	}


else { 
	System.out.println("cevap yanlış");
	point =0;
}

if(point==4)
	System.out.println("mükemmel");
if(point==3)
	System.out.println("çok iyi");
else
	System.out.println("küresel ısınma hakkındaki bilgilerini tazeleme zamanı");

	
for(int i=0;i<4;i++) {
	System.out.println("cevapların: "+cevap[i]);
	
}

for(int i=0;i<4;i++) {
	System.out.println("cevap anahtarı "+cevanahtar[i]);
	
}





	

	}

}
