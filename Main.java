//package labbbb5;

import java.util.Scanner;
public class Main{
	
	public static void main(String[] args) {
		
		Scanner k = new Scanner(System.in);
		BinarySearchTree tree = new BinarySearchTree(); 
		
		
		System.out.println("Girilecek adet sayisi:");
		int adet=k.nextInt();
		
		for(int i=0;i<adet;i++){
			
			tree.insert(k.nextInt());// teker teker alip binary search bir sekilde insert ediyor.
			
		}
		
		
		System.out.println("K sayisini giriniz:");
		
		int kSayisi=k.nextInt();
		
		
		tree.lowestCommonAncestor(tree.root,kSayisi);
		
		
		
		
      
        
        
		
		
	}
	
	
	
	

}
