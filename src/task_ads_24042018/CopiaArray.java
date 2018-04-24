package task_ads_24042018;

/**
 *
 * @author meirinaldojunior
 */
public class CopiaArray {
    
    public static void main(String[] args) {
        
        /*
            Inicializando as varíaveis;
        */
        int[] arrayOrigem   = new int[100];
        int[] arrayDestino  = new int[arrayOrigem.length];
        
        /*
            Inicializa os valores do arrayOrigem;
        */
        for(int i = 0; i < 100; i++){
            arrayOrigem[i] = i;
        }
        
        /*
            Copia os valores do arrayOrigem para o arrayDestino
        */
        arrayDestino = copiaArray(arrayOrigem);
        arrayOrigem = tratarImpares(arrayOrigem);
        printArray(arrayDestino);
    }
    
    /*
        Método de copia do array
        @param arrayTemp array temporário para ser utilizado na operação de cópia do array de origem.
    */
    public static int[] copiaArray(int[] arrayOrigem){
        int[] arrayTemp = new int[arrayOrigem.length];
        System.arraycopy(arrayOrigem, 0, arrayTemp, 0, arrayOrigem.length);
        return arrayTemp;
    }
    
    /*
        Método de impressão do array
    */
    public static void printArray(int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.println("Indice: "+i+"  |  Valor: "+array[i]);
        }
        System.out.println(" ------- FIM EXIBIÇÃO DO ARRAY ------  ");
    }
    
    /*
        Método de tratamento dos números Impares
            @param arrayTemp array temporário da operação; 
            @param aux valor auxiliar para fazer o push do array.
    */
    public static int[] tratarImpares(int[] array){
        int[] arrayTemp = new int[array.length];
        int aux = 0;
        for(int i = 0; i < array.length; i++){
            if((array[i] % 2) == 0){
                arrayTemp[aux] = array[i];
                aux++;
            }
        }
        return arrayTemp;
    }
    
}
