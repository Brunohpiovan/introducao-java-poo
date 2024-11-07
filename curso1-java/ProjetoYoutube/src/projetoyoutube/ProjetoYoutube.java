package projetoyoutube;
public class ProjetoYoutube {
    public static void main(String[] args) {
        Video v[]= new Video[3];
        v[0]= new Video("Aula de POO");
        v[1]= new Video("Aula de Java");
        v[2]= new Video("Aula de PHP");
        Gafanhoto g[]=new Gafanhoto[2];
        g[0]= new Gafanhoto("Bruno", 22, "M", "Bruno123");
        g[1]=new Gafanhoto("Maria", 35, "F", "Mariagamer");
        
        Visualizacao vis = new Visualizacao(g[0], v[2]);
        System.out.println(vis.toString());  
        
        /*
        System.out.println("VIDEOS:");
        for(int i=0;i<3;i++){
            System.out.println(v[i].toString());
        }
        System.out.println("");
        System.out.println("GAFANHOTOS:");
        for(int i=0;i<2;i++){
            System.out.println(g[i].toString());
        }
        */
    }
    
}
