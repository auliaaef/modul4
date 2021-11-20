public class Kelipatan_Tiga{
    private int Bil;
    
    public void kelipatan(){
        for(Bil = 1; Bil <= 1000; Bil++){
            if(Bil % 3 == 0){
                System.out.print(Bil+", ");
                
                if (Bil%20 == 0){
                    System.out.println("");
                }
            }
        }
    }
}
