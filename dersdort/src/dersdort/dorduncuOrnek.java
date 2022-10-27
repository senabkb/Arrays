package dersdort;

public class dorduncuOrnek {
//for(parametre:array) dixilede elemanları atmak için u for u kullanabilirsin
	//int[][] b={[a,b},{c,d}};
	//java satır satır işlem yapar arrayde boş yer bırakabilirsin
	//... sayısı belli değil demek istediğin kadar sayı alabilirsin demek
	//fonksiyonların içinde gönderilen değişkenlerin sayısı belli değilse ... kullanılır
	//
	public static void main(String[] args) {
		final int ARRAY_LENGTH=20;
		int[] array=new int[ARRAY_LENGTH];
		for(int counter=0;counter<array.length;counter++) {
			array[counter]=2+2*counter;
			
		}
		System.out.printf("%s%8s%n","index","Value");
		for(int counter=0;counter<array.length;counter++) {
			System.out.printf("%5d%8d%n",counter,array[counter]);
		}
	}

}
