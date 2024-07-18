class SportsMania {
	static String iplTeamNames[]={"CSK","RCB","MI","KKR","SRH","RR","DC","LSG","GT","PBKS"};
	static String batsmens[]={"MSDhoni","ViratKohli","RohitSharma","RinkuSingh","ManishPande","SanjuSamson","RishabPanth","KLRahul","ShubhmanGill","ShikarDhawan"};
	static String bowlers[]={"DeepakChahar","KarnSharma","JaspritBumrha","HarshitRana","BuvaneshwarKumar","SandeepSharma","IshanthSharma","YashThakur","MohitSharma","HarshalPatel"};
	static String iccTeamNames[]={"India","Australia","England","WestIndies","Afganistan","Newzealand","SouthAfrica","Bangladesh","SriLanka","Scotland"};
	
	public static void main(String cricket[]) {
		
	
	System.out.println(" The avilable iplTeamNames  are: "  + iplTeamNames.length);
	System.out.println(" The avilable batsmen  are: "  + batsmen.length);
	System.out.println(" The avilable bowlers  are: "  + bowlers.length);
	System.out.println(" The avilable iccTeamNames  are: "  + iccTeamNames.length);
	}
	for (String iplTeamName:iplTeamNames){
		system.out.println(iplTeamName);
	}
	for(String batsmen:batsmens){
		System.out.println(batsmen);
	}
	for(String bowler:bowlers){
		System.out.println(bowler);
	}
}