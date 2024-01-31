import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args)  {
        ArrayList<Object> miarray = new ArrayList<>();

        miarray.add("Hola");
        Map<Object, Object> miDic = new HashMap<>();

        miDic.put("Saludo", "Buen dia" + 3);
        miarray.add(miDic);

        miarray.add("Buenos dias");
        miDic.put(3,6);

        int indice = 0;

        for (Object dato: miarray){
            System.out.println(dato);
            contar(indice);
            indice++;
        }
    }

    public static void contar(int indice)  {
        for (int i = 0; i <= indice; i++){
            System.out.println("Numero: "+(i+1));
        }
    }
}
