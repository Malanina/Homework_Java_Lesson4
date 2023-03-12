/*
*1. Реализовать телефонный справочник:
*HashMap<Login, Список телефонов>
*- добавлять телефон
*- удалять телефон
*- находить по логину телефон/список телефонов
*/


import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;


public class task1 {
public static void main(String[] args) { 
    Map<String, List<String>> phonesBook = new HashMap<>();
    List<String> phonesKirkorov = new ArrayList<String>() {{
    add("123456");
    add("234567");
   }};
   List<String> phonesBaskov = new ArrayList<String>() {{
    add("987654");
    add("876543");
   }};
   List<String> phonesGalkin = new ArrayList<String>() {{
    add("567891");
    add("678912");
    add("300211");
   }};

phonesBook.put("Kirkorov", phonesKirkorov);
phonesBook.put("Baskov", phonesBaskov);
phonesBook.put("Galkin", phonesGalkin);
System.out.println(phonesBook);

List<String> result1 = phonesBook.get("Kirkorov"); //добавить телефон
result1.add("100200");
phonesBook.put("Kirkorov", result1);
System.out.println(phonesBook);

List<String> result2 = phonesBook.get("Galkin"); //удалить телефон
result2.remove("300211");
phonesBook.put("Galkin", result2);
System.out.println(phonesBook);


for (HashMap.Entry<String, List<String>> me : phonesBook.entrySet()) {
    System.out.print(me.getKey() + ": ");
    System.out.println(me.getValue());
}
    System.out.println(phonesBook.get("Baskov")); //находить по логину телефон/список телефонов
    /*System.out.println(phonesBook.containsKey("Baskov"));*/
}
}
