package back_end;

import java.util.ArrayList;
import java.util.List;

public class Data {

    private List<String> numbers = new ArrayList<>();
    private List<String> letters = new ArrayList<>();
    private List<String> emptyStrings = new ArrayList<>();
    private List<String> combined = new ArrayList<>();

    Servises testas = new Servises();

    public List<String> combineLists(List<String> list) {
        fillLists(list);

        combined.addAll(testas.sortNumbersLists(numbers));
        combined.addAll(emptyStrings);
        combined.addAll(testas.sortLettersLists(letters));

        return combined;

    }

    private void fillLists(List<String> list) {

        for (String s : list) {
            if (testas.isNumeric(testas.firstElement(s))) {
                numbers.add(s);
            } else if (s.equals("")) {
                emptyStrings.add(s);
            } else {
                letters.add(s);
            }
        }
    }

}
