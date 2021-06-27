package pl.jakubkrys.lambda_expressions.article;

public class ArticleMain {
    public static void main(String[] args) {

        String article = "Zastanawiam się, jak po tych wszystkich latach spędzonych w kadrze Brazylii, będzie wyglądał jego pierwszy mecz Brazylia - Francja. Pewnie dziwnie będzie mu słyszeć brazylijski hymn, kiedy broni barw innego kraju. Doprowadzenie Francji do świetnej formy podczas igrzysk w Paryżu w 2024 roku będzie dla niego wielkim wyzwaniem. Niedawno powiedział: Liczę na zdobycie medalu: srebrnego, przegrywając złoto z Brazylią.";
        String article2 = "Zastanawiam się, jak po tych wszystkich latach spędzonych w kadrze Brazylii, będzie wyglądał jego pierwszy mecz Brazylia - Francja. Pewnie dziwnie będzie mu słyszeć brazylijski hymn, kiedy broni barw innego kraju.";

        // 30 first characters
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
    }
}
