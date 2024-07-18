class WatchShopRunner{


public static void main(String watches[]){

boolean watch=WatchShop.addWatchBrandNames("Rolex");
watch=WatchShop.addWatchBrandNames("Omega");
watch=WatchShop.addWatchBrandNames("Tag Heuer");
watch=WatchShop.addWatchBrandNames("Patek Philippe");
watch=WatchShop.addWatchBrandNames("Audemars Piguet");
watch=WatchShop.addWatchBrandNames("Breitling");
watch=WatchShop.addWatchBrandNames("Casio");
watch=WatchShop.addWatchBrandNames("Seiko");
watch=WatchShop.addWatchBrandNames("Tissot");
watch=WatchShop.addWatchBrandNames("Cartier");

if(watch==true){
 WatchShop.getAllWatchBrands();
}
else{
	System.out.println("invalid brand names");
	}
	watch=WatchShop.updateWatchBrands("Cartier","unKnown");
	
	if(watch==true){
		System.out.println("\n\n\n");
 WatchShop.getAllWatchBrands();
}
else{
	System.out.println("invalid brand names");
	}
	watch=WatchShop.deleteWatchName("Rolex");
	if(watch==true){
		System.out.println("\n\n\n");
 WatchShop.getAllWatchBrands();
}
else{
	System.out.println("invalid name");
	}
}	
	}