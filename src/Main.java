//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;

void main() {
//* Paso 1
    RetornarNombres();
//* Fin Paso 1

//* Paso 2
    List<String> nombres2 = new ArrayList<>();
    nombres2.add("Franco");
    nombres2.add("Sebastian");
    nombres2.add("Leandro");
    System.out.println("Print del paso 2: " + RetornarBoolean(nombres2,"Sebastian"));
//* Fin Paso 2

//* Paso 3
    System.out.println("Print del paso 3: " + RetornarString(nombres2,"o"));
//* Fin Paso 3

//* Paso 4
    Map<String, Integer> Mapa = new HashMap<>();
    Mapa.put("Franco",22);
    Mapa.put("Sebastian",10);
    Mapa.put("Leandro",9);
    System.out.println("Print del paso 4(1): " + RetornarMapa(Mapa,"Franco"));
    System.out.println("Print del paso 4(2): " + RetornarClave(Mapa,"Sebastian"));
//* Fin Paso 4

}
//* Paso 4
public static Boolean RetornarMapa(Map<String,Integer> Mapa, String key){
    for(String Mapa1 : Mapa.keySet())
        if (Mapa1.equals(key)) {
            return true;
        }
    return false;
}

public static Integer RetornarClave(Map<String,Integer> Mapa, String key){
    for(String Mapa1 : Mapa.keySet())
        if (Mapa1.equals(key)){
            return Mapa.get(key);
        }
    return 0;
}
//* Fin Paso 4

//* Paso 3
public static List<String> RetornarString(List<String> nombres2, String key){
    List<String> nombres3 = new ArrayList<>();
    for(String nombre : nombres2) {
        if (nombre.contains(key)){
            nombres3.add(nombre);
        }
    }
    return nombres3;
}
//* Fin Paso 3

//* Paso 2
public static boolean RetornarBoolean(List<String> nombres2,Object key){
    for(String nombre : nombres2) {
        if (nombre.equals(key)){
            return true;
        }
    }
    return false;
}
//* Fin Paso 2

//* Paso 1
public static void RetornarNombres(){
    String[] nombres = {"Franco","Sebastian","Leandro"};
    System.out.println("Print del paso 1: " + Arrays.toString(nombres));
}
//* Fin Paso 1



