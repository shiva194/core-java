import java.util.*;

class RedChilliesEntertainment {
    static String[] movieActors = {null,null,null,null,null,null,null,null,null};
    static int index = 0;

    public static boolean addMovieActor(String actorName) {
        boolean isActorAdded = false;
        if (actorName != null ) {
            movieActors[index] = actorName;
            index++;
            isActorAdded = true;
        } else {
            if (actorName == null) {
                System.out.println("Actor name cannot be null");
            } else {
                System.out.println("Array is full. Cannot add more actors.");
            }
        }
        return isActorAdded;
    }

    public static void getMovieActors() {
        for (String actor : movieActors) {
            if (actor != null) {
                System.out.println(actor);
            }
        }
    }
	
	
	
	public static boolean deletAcorsName(String oldActorsName){
		boolean isdeletAcorsName=false;
		int newIndex,oldIndex;
		for(newIndex=0,oldIndex=0;oldIndex<movieActors.length;oldIndex++){
			if(oldActorsName!=movieActors[oldIndex]){
				movieActors[newIndex]=movieActors[oldIndex];
				newIndex++;
			}
		}
		movieActors=Arrays.copyOf(movieActors,newIndex);
		if(movieActors!=null){
			isdeletAcorsName=true;
		}
	return isdeletAcorsName;
	}
}

