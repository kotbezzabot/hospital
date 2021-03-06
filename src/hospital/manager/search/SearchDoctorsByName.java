package hospital.manager.search;

import hospital.entity.Hospital;
import hospital.input.HelpInput;

/**
 *  Поиск докторов по имени
 */
public class SearchDoctorsByName {
    public static void search(Hospital hospital) {

        System.out.println("Введите имя доктора:");
        String doc = HelpInput.inputString();
        int total = 0;
        for (int i = 0; i < hospital.getDoctors().size(); i++) {
            if (doc.equalsIgnoreCase(hospital.getDoctors().get(i).getName())) {
                System.out.println("Найден доктор - " + hospital.getDoctors().get(i).toString());
                total++;
            } else if (hospital.getDoctors().get(i).getName().toLowerCase().contains(doc.toLowerCase())) {
                System.out.println("Есть совпадение - " + hospital.getDoctors().get(i).toString());
                total++;
            }

        }
        if (total == 0) {
            System.out.println("Совпадений не найдено");
        }

    }
}
