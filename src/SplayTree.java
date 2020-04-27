//Se utilizaron los metodos necesarios de la implementacion propuesta en https://www.sanfoundry.com/java-program-implement-splay-tree/

public class SplayTree{
	
	private SplayNode root;
	private int count = 0;
	
	//Contrusctor
	public SplayTree()
    {
        root = null;
    }
	
	//Metodo para insertar nodos al arbol, se cambiaron las condicionales para determinar la posicion de cada nodo
	public void insert(SplayNode nodo) {
		SplayNode z = root;
        SplayNode p = null;
        while (z != null) {
        	
        	p = z;
        	if (nodo.palabra_ingles.compareTo(p.palabra_ingles) > 0)
                z = z.right;
            else
                z = z.left;

        }
        
        z = new SplayNode();
        z.palabra_ingles = nodo.palabra_ingles;
        z.palabra_espanol = nodo.palabra_espanol;
        z.parent = p;
        
        if (p == null) {
        	root = z;
        }
        else if(nodo.palabra_ingles.compareTo(p.palabra_ingles) > 0) {
        	p.right = z;
        }
        else {
        	p.left = z;
        }
        
        Splay(z);
        count++;

	}
	
	// Método necesario para realizar la insercion
	 public void makeLeftChildParent(SplayNode c, SplayNode p)
     {
         if ((c == null) || (p == null) || (p.left != c) || (c.parent != p))
             throw new RuntimeException("WRONG");
 
         if (p.parent != null)
         {
             if (p == p.parent.left)
                 p.parent.left = c;
             else 
                 p.parent.right = c;
         }
         if (c.right != null)
             c.right.parent = p;
 
         c.parent = p.parent;
         p.parent = c;
         p.left = c.right;
         c.right = p;
     }
 
     //Método necesario para realizar la insercion
     public void makeRightChildParent(SplayNode c, SplayNode p)
     {
         if ((c == null) || (p == null) || (p.right != c) || (c.parent != p))
             throw new RuntimeException("WRONG");
         if (p.parent != null)
         {
             if (p == p.parent.left)
                 p.parent.left = c;
             else
                 p.parent.right = c;
         }
         if (c.left != null)
             c.left.parent = p;
         c.parent = p.parent;
         p.parent = c;
         p.right = c.left;
         c.left = p;
     }
     
 	private void Splay(SplayNode x){

        while (x.parent != null){

            SplayNode Parent = x.parent;
            SplayNode GrandParent = Parent.parent;
            if (GrandParent == null){
                if (x == Parent.left)
                    makeLeftChildParent(x, Parent);
                else
                    makeRightChildParent(x, Parent);                 
            } 
            else{
                if (x == Parent.left){
                    if (Parent == GrandParent.left){
                        makeLeftChildParent(Parent, GrandParent);
                        makeLeftChildParent(x, Parent);
                    }
                    else{
                        makeLeftChildParent(x, x.parent);
                        makeRightChildParent(x, x.parent);
                    }
                }
                else{
                    if (Parent == GrandParent.left) {
                        makeRightChildParent(x, x.parent);
                        makeLeftChildParent(x, x.parent);
                    } 
                    else{
                        makeRightChildParent(Parent, GrandParent);
                        makeRightChildParent(x, Parent);

                    }

                }

            }

        }

        root = x;

    }
 	
 	
 	//Método para encontrar un nodo, se modifico para encontrar palabras
 	private String findNode(String palabra){
   	 SplayNode PrevNode = null;
     SplayNode z = root;
     while (z != null){
       	 PrevNode = z;
            if (palabra.compareTo(z.palabra_ingles) > 0)
                z = z.right;
            else if (palabra.compareTo(z.palabra_ingles) < 0)
                z = z.left;
            else if(palabra.compareTo(z.palabra_ingles) == 0) {
                Splay(z);
                return z.palabra_espanol;
            }

        }
        if(PrevNode != null)
        {
            Splay(PrevNode);
            return null;
        }
        return null;
    }
 	
 	public String search(String ingles)
    {
        return findNode(ingles) ;
    }
 	
 	public boolean isEmpty()
    {
        return root == null;
    }


	
     
}