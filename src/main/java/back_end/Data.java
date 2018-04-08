package back_end;

import java.util.ArrayList;
import java.util.List;

public class Data {

    private List<String> numbers = new ArrayList<>();
    private List<String> letters = new ArrayList<>();
    private List<String> emptyStrings = new ArrayList<>();
    private List<String> combined = new ArrayList<>();

    Servises servises = new Servises();

    // gražina sugntą ir išsortiruotą list`ą
    public List<String> combineLists(List<String> list) {
        fillLists(list);

        combined.addAll(servises.sortNumbersLists(numbers));
        combined.addAll(emptyStrings);
        combined.addAll(servises.sortLettersLists(letters));

        return combined;

    }

    // atskiria ir užpildo naujus ArrayList
    private void fillLists(List<String> list) {

        for (String s : list) {
            if (servises.isNumeric(servises.firstElement(s))) {
                numbers.add(s);
            } else if (s.equals("")) {
                emptyStrings.add(s);
            } else {
                letters.add(s);
            }
        }
    }

}
