class Netflix {
	static String topMovies[]={"Avatar","Avengers","TheGodFather","SpiderMan","TheDarkNight","ScarFace","Johnwick","TheMatrix","MadMax","Titanic"};
	static String englishMovies[]={"ShutterIsland","Inception","InterSteller","Tangle","PiratesOfCarabbien","PulpFiction","SherLockHolmes","Extraction","HarryPoter","DoctorStrange"};
	static String kannadaMovies[]={"KGF","Katera","VikrantRona","KirikParty","Karva","Mayura","Googly","Yajamana","Yuvaratna","James"};
	static String hindiMovies[]={"Dilwale","HappyNewYear","MaiHuNa","Don","Baby","StudentOfTheYear","Jawan","Pathan","Zero","Dishoom"};
	static String koreanSeries[]={"MyGirlFriendIsAnAlien","DoctorStranger","TheDoctors","MyDemon","Blood","Tomorrow","TrueBeauty","DoctorJohn","SquidGame","Vincenzo"};

	public static void main(String movies[]) {
	System.out.println(" The avilable topMovies  are: "  + topMovies.length);
	System.out.println(" The avilable englishMovies  are: "  + englishMovies.length);
	System.out.println(" The avilable kannadaMovies  are: "  + kannadaMovies.length);
	System.out.println(" The avilable hindiMovies  are: "  + hindiMovies.length);
	System.out.println(" The avilable koreanSeries  are: "  + koreanSeries.length);
	
	}
	for(String topMovie:topMovies){
		System.out.println(topMovie);
	}
	for(String englishMovie:englishMovies){
		System.out.println(englishMovie);
	}
	for(String kannadaMovie:kannadaMovies){
		System.out.println(kannadaMovie);
	}
	for(String hindiMovie:hindiMovies){
		System.out.println(hindiMovie);
	}
	for(String koreanSerie:koreanSeries){
		System.out.println(koreanSerie);
	}
}

