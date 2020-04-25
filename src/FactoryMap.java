public class FactoryMap<E> {
	
     public Map<E,E> tipoMap(String impl){
    	 
         Map<E,E> mapa = null;
         
         if(impl.equals("Splay")) {
        	 
         } else if(impl.equals("HashMap")){
        	 mapa = new HashMap_<E, E>();
         }
         
         return mapa;
     }
}