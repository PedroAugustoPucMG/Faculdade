import java.util.*;

public class Sort{
	public static void swap(int i , int j, int [] array){
	       int temp = array[i];
       		array[i] = array[j];
 		array[j] = temp;
	}		
	public static void ordenar(int array[], int M){
		int tam = array.length;
		for(int i = 0; i < (n - 1); i++){
			int menor = i;
			for(int j = (i + 1); j < n; j++){
				if(array[menor % M] > array[j % M]){
				       menor = j;
			       	}else if(array[menor % M] == array[j % M]){
				       if(array[menor % 2] == 0 && array[j % 2] == 0){
				       		if(array[menor] > array[j]){
					 		menor = j;
							swap(menor, i, array);
						}
					}
		       			if(array[menor % 2] != 0 && array[menor % 2] != 0){
			 						
		 			
					
	public static void main(String[] args){
		Scanner ler = new Scanner(System.in);
		int N, M;

		N = ler.nextInt();
		M = ler.nextInt();
		int vet[N];
		for(int i = 0; i < N; i++){
			vet[i] = ler.nextInt();
		}
		while(N != 0 && M != 0){

		
