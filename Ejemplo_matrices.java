public class Ejemplo_matrices {

    public static void main(String[] args) {
        //Matriz con dos filas y 3 Columnas
        int[][] matriz=new int[2][3];
        //1|2|3
        //4|5|6        
        //rellenamos la primera fila de la Matriz
        matriz[0][0]=1;
        matriz[0][1]=2;
        matriz[0][2]=3;
        //rellenamos la segunda fila de la Matriz
        matriz[1][0]=4;
        matriz[1][1]=5;
        matriz[1][2]=6; 
        
        //el primer for recorre las filas
        for(int i=0; i<matriz.length; i++){
            //el segundo for recorre las columnas
            for(int j=0; j<matriz[0].length; j++){
                System.out.println("Fila: "+i+" Columna: "+j+" Valor: "+matriz[i][j]);
            }
        }
    }
}
