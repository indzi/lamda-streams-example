package introduction;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class Iteration {

    public static List<BigDecimal> insertPrices() {
        final List<BigDecimal> prices = Arrays.asList(
                new BigDecimal("10"), new BigDecimal("30"), new BigDecimal("17"),
                new BigDecimal("20"), new BigDecimal("15"), new BigDecimal("18"),
                new BigDecimal("45"), new BigDecimal("12"));
        return prices;
    }

    //other than using normal iterator use for each
    public static void main(String[] args) {
        List<BigDecimal> prices = insertPrices();
//        prices.forEach((price) -> System.out.println(price));
       /* prices.forEach((price) -> {
            if(price.compareTo(BigDecimal.valueOf(20)) > 0 ) {
                System.out.println(price);
            }
        });*/

       prices.stream()
               .filter((price) -> price.compareTo(BigDecimal.valueOf(30))> 0)
               .forEach((price) -> System.out.println(price));

        }

}
