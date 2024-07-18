class GoldShopRunner{

public static void main(String args[]){

boolean isgoldName=GoldShop.addGoldItem("Gold Necklace");
isgoldName=GoldShop.addGoldItem("Gold Bracelet");
isgoldName=GoldShop.addGoldItem("Gold Earrings");
isgoldName=GoldShop.addGoldItem("Gold Chain");
isgoldName=GoldShop.addGoldItem("Gold Bangles");
isgoldName=GoldShop.addGoldItem("Gold Ring");
isgoldName=GoldShop.addGoldItem("Gold Pendant");

   GoldShop.getAllGoldItems();
System.out.println("\n\n\n");
boolean isUpdate=GoldShop.updateGoldItems("Gold Chain","Gold unknown");
  
       GoldShop.getAllGoldItems();
	  isgoldName= GoldShop.deleteGoldItems("Gold Necklace");
	  System.out.println("\n\n\n");
	   if(isgoldName!=false){
		   GoldShop.getAllGoldItems();
	   }

	}
}