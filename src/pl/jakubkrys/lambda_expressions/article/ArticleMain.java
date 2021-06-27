package pl.jakubkrys.lambda_expressions.article;

public class ArticleMain {
    public static void main(String[] args) {

        String article = "Zastanawiam się, jak po tych wszystkich latach spędzonych w kadrze Brazylii, będzie wyglądał jego pierwszy mecz Brazylia - Francja. Pewnie dziwnie będzie mu słyszeć brazylijski hymn, kiedy broni barw innego kraju. Doprowadzenie Francji do świetnej formy podczas igrzysk w Paryżu w 2024 roku będzie dla niego wielkim wyzwaniem. Niedawno powiedział: Liczę na zdobycie medalu: srebrnego, przegrywając złoto z Brazylią.";
        String article2 = "Zastanawiam się, jak po tych wszystkich latach spędzonych w kadrze Brazylii, będzie wyglądał jego pierwszy mecz Brazylia - Francja. Pewnie dziwnie będzie mu słyszeć brazylijski hymn, kiedy broni barw innego kraju.";

        // 30 first characters
        System.out.println("----- Length check -----");
        CheckArticle first30Characters = text -> {

            if (article.length() > 255){
                throw new TooLongException();
            } else {
                return article.substring(0,30);
            }
        };

        try {
            System.out.println(first30Characters.check(article));
        } catch (TooLongException e) {
            System.out.println("Text is too long.");
        }

        CheckArticle first30Characters2 = text -> {

            if (article2.length() > 255){
                throw new TooLongException();
            } else {
                return article2.substring(0,30);
            }
        };

        try {
            System.out.println(first30Characters2.check(article2));
        } catch (TooLongException e) {
            System.out.println("Text is too long.");
        }

        System.out.println();

        // Upper first letter and dot at the end
        System.out.println("----- First letter and dot at the end check -----");
        String title = "Brazylijczycy pod wrażeniem gry Polaka. Już drżą przed finałem. Zachwycił mnie";
        String title2 = "polska osłabiona w wielkim finale z Brazylią? Nowe informacje z kadry.";
        String title3 = "drzyzga apelował do Heynena. Powinien zostać zdjęty. Ogromny problem";

        CheckArticle upperFirstDotAtTheEnd = text -> {
          String result = "";

          if (!title.endsWith(".")) {
              result += title+".";
          } else {
              result = title;
          }
          return result.substring(0,1).toUpperCase()+result.substring(1);
        };

        try {
            System.out.println(upperFirstDotAtTheEnd.check(title));
        } catch (TooLongException ignored) {
        }

        CheckArticle upperFirstDotAtTheEnd2 = text -> {
            String result2 = "";

            if (!title2.endsWith(".")) {
                result2 += title2+".";
            } else {
                result2 = title2;
            }
            return result2.substring(0,1).toUpperCase()+result2.substring(1);
        };

        try {
            System.out.println(upperFirstDotAtTheEnd2.check(title2));
        } catch (TooLongException ignored) {
        }

        CheckArticle upperFirstDotAtTheEnd3 = text -> {
            String result3 = "";

            if (!title3.endsWith(".")) {
                result3 += title3+".";
            } else {
                result3 = title3;
            }
            return result3.substring(0,1).toUpperCase()+result3.substring(1);
        };

        try {
            System.out.println(upperFirstDotAtTheEnd3.check(title3));
        } catch (TooLongException ignored) {
        }

    }
}