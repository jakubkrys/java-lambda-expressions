package pl.jakubkrys.lambda_expressions.article;

@FunctionalInterface
public interface CheckArticle {
    String check (String s) throws TooLongException;
}