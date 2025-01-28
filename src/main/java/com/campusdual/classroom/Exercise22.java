package com.campusdual.classroom;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class
Exercise22 {

    public static List<String> createArrayList() {

        //Crear una colección de tipo List e inicializarla como ArrayList en el metodo createArrayList()

        List<String> arrayList = new ArrayList<>();

        // Luego poblar la lista con diferentes valores y devolver la lista construída.
        arrayList.add("GKFFD");
        arrayList.add("TNANA");
        arrayList.add("MPMSL");
        arrayList.add("PSWME");
        arrayList.add("LZMLF");
        arrayList.add("JYEBV");
        arrayList.add("YELNT");
        arrayList.add("JSNKR");
        arrayList.add("JFESF");
        arrayList.add("TMJLL");
        return arrayList;
    }

    public static void printElementsAndIndex(List<String> customList) {

        //Forma más eficiente de recorrer una lista
        //for (String s : customList) {
        //  System.out.println(s + " = " + customList.indexOf(s));
        //}


        //Recorrer la lista en el metodo printElementsAndIndex() elemento a elemento,(Este for tradicional es más eficiente para recorrer un array)

        for (int i = 0; i < customList.size(); i++) {
            // mostrando por pantalla el valor de cada elemento y su índice correspondiente en la lista
            System.out.println("Indice: " + i + " Valor: " + customList.get(i));
        }
    }

    public static boolean addElementToList(List<String> customList, String element) {
//Añadir un elemento más a la lista en el metodo addElementToList() y devolver el booleano resultante de la operación.
        return customList.add(element);
    }

    public static void main(String[] args) {
//Crear e poblar o ArrayList
        List<String> arrayList = createArrayList();

        //Añadir un novo elemento a lista
        boolean newElement = addElementToList(arrayList, "AAAAA");
        boolean newElement2 = addElementToList(arrayList, "SSSSS");
        boolean newElement3 = addElementToList(arrayList, "DDDDD");

        //Mostrar os elementos de ArrayList cos seus indices
        System.out.println("Elementos da lista cos seus indices: ");
        printElementsAndIndex(arrayList);
    }


}
