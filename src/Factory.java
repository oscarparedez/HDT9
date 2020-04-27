public class Factory<E> {
	
     public Map<E,E> tipoMap(int impl){
    	 
         Map<E,E> mapa = null;
         
         if(impl == 1) {
        	 mapa = new SplayM<E, E>();
         } 
         else if(impl == 2){
        	 mapa = new Association<E, E>();
         }
         
         return mapa;
     }
}