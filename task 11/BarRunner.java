class BarRunner{

public static void main(String bar[]){
	boolean iswines=Bar.addWineBrandsName("grapes wine");
	iswines=Bar.addWineBrandsName("orange wine");
	iswines=Bar.addWineBrandsName("apple wine");
	iswines=Bar.addWineBrandsName("mango wine");
	iswines=Bar.addWineBrandsName("charosa wine");
	iswines=Bar.addWineBrandsName("bigbanyan wine");
	iswines=Bar.addWineBrandsName("yorkarrows wine");
	iswines=Bar.addWineBrandsName("fratellisette wine");
	iswines=Bar.addWineBrandsName("sula wine");
	iswines=Bar.addWineBrandsName("grenche wine");
	iswines=Bar.addWineBrandsName("vallone wine");
	iswines=Bar.addWineBrandsName("riseling wine");
	iswines=Bar.addWineBrandsName("grover wine");
	iswines=Bar.addWineBrandsName("merlot wine");
	iswines=Bar.addWineBrandsName("fratelli wine");
	
	if(iswines==true){
		Bar.getAllBrands();
		}
		
		
		iswines=Bar.updateWineBrands("charosa wine","unknown wine");
		
		if(iswines==true){
	    System.out.println("\n\n");
		System.out.println("updated brands name list \n\n");
		Bar.getAllBrands();
		}
		
		
		iswines=Bar.deletBrandName("grapes wine");
		if(iswines==true){
	    System.out.println("\n\n");
		System.out.println("updated brands name list \n\n");
		Bar.getAllBrands();
		}
	}
}