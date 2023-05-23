package Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Month {
    String name;

    public Month(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public static void main(String[] args) {

                ArrayList<Month> monthList = new ArrayList<>();

                // Crear els objectes Month
                Month gener = new Month("Gener");
                Month febrer = new Month("Febrer");
                Month març = new Month("Març");
                Month abril = new Month("Abril");
                Month maig = new Month("Maig");
                Month juny = new Month("Juny");
                Month juliol = new Month("Juliol");
                Month setembre = new Month("Setembre");
                Month octubre = new Month("Octubre");
                Month novembre = new Month("Novembre");
                Month desembre = new Month("Desembre");

                // Afegir els objectes a l'ArrayList
                monthList.add(gener);
                monthList.add(febrer);
                monthList.add(març);
                monthList.add(abril);
                monthList.add(maig);
                monthList.add(juny);
                monthList.add(juliol);
                monthList.add(setembre);
                monthList.add(octubre);
                monthList.add(novembre);
                monthList.add(desembre);

                // Trobar l'índex on s'ha d'inserir l'objecte "Agost"
                int index = 0;
                for (int i = 0; i < monthList.size(); i++) {
                    if (monthList.get(i).getName().equals("Agost")) {
                        index = i;
                        break;
                    }
                }

                // Inserir l'objecte "Agost" en el lloc corresponent
                Month agost = new Month("Agost");
                monthList.add(index, agost);

                // Mostrar l'ArrayList per comprovar l'ordre
                System.out.println("ArrayList amb l'ordre correcte: ");
                for (Month month : monthList) {
                    System.out.println(month.getName());
                }

                // Convertir l'ArrayList en un HashSet
                HashSet<Month> monthSet = new HashSet<>(monthList);

                // Mostrar el HashSet per assegurar-se que no hi ha duplicats
                System.out.println("\nHashSet sense duplicats: ");
                for (Month month : monthSet) {
                    System.out.println(month.getName());
                }

                // Recórrer l'ArrayList amb un for
                System.out.println("\nRecorregut amb for: " );
                for (Month month : monthList) {
                    System.out.println(month.getName());
                }

                // Recórrer l'ArrayList amb un iterator
                System.out.println("\nRecorregut amb iterator:");
                Iterator<Month> iterator = monthList.iterator();
                while (iterator.hasNext()) {
                    Month month = iterator.next();
                    System.out.println(month.getName());
                }
            }
        }