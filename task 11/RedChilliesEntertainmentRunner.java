
class RedChilliesEntertainmentRunner {
    public static void main(String[] args) {
        boolean actorAdded = RedChilliesEntertainment.addMovieActor("Shah Rukh Khan");
        actorAdded = RedChilliesEntertainment.addMovieActor("Kajol");
        actorAdded = RedChilliesEntertainment.addMovieActor("Deepika Padukone");
        actorAdded = RedChilliesEntertainment.addMovieActor("Salman Khan");
        actorAdded = RedChilliesEntertainment.addMovieActor("Amitabh Bachchan");
        actorAdded = RedChilliesEntertainment.addMovieActor("Priyanka Chopra");
        actorAdded = RedChilliesEntertainment.addMovieActor("Ranveer Singh");
        actorAdded = RedChilliesEntertainment.addMovieActor("Alia Bhatt");
        actorAdded = RedChilliesEntertainment.addMovieActor("Ranbir Kapoor");

        RedChilliesEntertainment.getMovieActors();
		System.out.println("\n\n\n");
		RedChilliesEntertainment.deletAcorsName("Salman Khan");
		
		 RedChilliesEntertainment.getMovieActors();
    }
}