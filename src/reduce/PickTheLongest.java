package reduce;

import data.DataLoader;

import java.util.List;
import java.util.Optional;

public class PickTheLongest {

    public static void main(String[] args) {
        DataLoader dataLoader = new DataLoader();
        List<String> names = dataLoader.createTwoNames();

        final Optional<String> longestName = names.stream()
                .reduce((name1, name2) ->
                                            name1.length() >= name2.length() ? name1 : name2
                );
        longestName.ifPresent((name) -> System.out.println(name));

        // TODO: 29-Jan-19 for comparison with a static value check the code below
        /*
        public static void main(String[] args) {
        DataLoader dataLoader = new DataLoader();
        List<String> names = dataLoader.createTwoNames();

        final String longestName = names.stream()
                .reduce("PermchandDeshai",(name1, name2) ->
                                            name1.length() >= name2.length() ? name1 : name2
                );
        System.out.println(longestName);
         */
    }
}
