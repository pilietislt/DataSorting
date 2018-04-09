package back_end;

import java.util.ArrayList;
import java.util.List;

public class Servises {

    //tikrina ar paduotas String tipo kintamasis yra numeris
    public boolean isNumeric(String str) {
        return str.matches("-?\\d+(\\.\\d+)?");
    }
    //iš paduoto String tipo kintamojo iškria pirmąjį elementą
    public String firstElement(String str) {
        String[] s = str.split("\\s+");
        try {
            return s[0];
        } catch (ArrayIndexOutOfBoundsException e) {
            return null;
        }

    }
    //iš paduoto List`o grąžina mažiausio numerio index`ą
    int minNumbersIndex(List<String> list) {

        int size = list.size();
        int index = 0;

        float f = Float.parseFloat(jElementOfString(list, 0, 0));

        for (int i = 1; i < size; i++) {
            float f1 = Float.parseFloat(jElementOfString(list, i, 0));

            if (f > f1) {
                f = f1;
                index = i;
            } else if (f == f1) {
                index = compareNext(list, index, i, 1);
            }
        }
        return index;
    }
    //iš paduoto List`o grąžina  alfabetine tvarka pirmos raidės index`ą
    int alphabetIndex(List<String> list) {

        int size = list.size();
        int index = 0;

        String s = jElementOfString(list, 0, 0);

        for (int i = 1; i < size; i++) {
            String s1 = jElementOfString(list, i, 0);
            if (s.compareToIgnoreCase(s1) > 0) {
                s = s1;
                index = i;
            } else if (s.equals(s1)) {
                index = compareNext(list, index, i, 1);
            }

        }
        return index;

    }
    //iš paduoto List`o tipo kintamojo iškria i-osios eilutes ir j-jo stulpelio elementą
    static String jElementOfString(List<String> list, int i, int j) {
        String[] s = list.get(i).split("\\s+");
        try {
            return s[j];
        } catch (ArrayIndexOutOfBoundsException e) {
            return null;
        }

    }
    //patikrina du vienodus kitamuosius ir grąžina mažesniojo indexą
    private static int compareNext(List<String> list, int index, int i, int j) {

        if (jElementOfString(list, index, j) != null && jElementOfString(list, i, j) != null) {
            try {
                float s1 = Float.parseFloat(jElementOfString(list, index, j));
                float s2 = Float.parseFloat(jElementOfString(list, i, j));
                if (s1 > s2) {
                    return i;
                } else if (s1 == s2) {
                    return compareNext(list, index, i, (j + 1));
                }
            } catch (NumberFormatException e) {
                String str1 = jElementOfString(list, index, 1);
                String str2 = jElementOfString(list, i, 1);

                if (str1.compareToIgnoreCase(str2) > 0) {
                    return i;
                } else if (str1.compareToIgnoreCase(str2) == 0) {
                    return compareNext(list, index, i, (j + 1));
                }
            }
        }
        return index;

    }
    //išsortiruoja NumbersLists didėjimo tvarka
    public List<String> sortNumbersLists(List<String> numbers) {

        int size = numbers.size();

        List<String> newList = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            newList.add(numbers.get(minNumbersIndex(numbers)));
            numbers.remove(minNumbersIndex(numbers));
        }
        return newList;


    }
    //išsortiruoja LettersLists alfabetine tvarka
    public List<String> sortLettersLists(List<String> letters) {

        int size = letters.size();

        List<String> newList = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            newList.add(letters.get(alphabetIndex(letters)));
            letters.remove(alphabetIndex(letters));
        }
        return newList;


    }
}
