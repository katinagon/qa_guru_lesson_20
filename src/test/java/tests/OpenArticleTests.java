package tests;

import org.junit.jupiter.api.Test;
import pages.MainPage;
import pages.SearchPage;

import static io.qameta.allure.Allure.step;

public class OpenArticleTests extends TestBase {
    MainPage mainPage = new MainPage();
    SearchPage searchPage = new SearchPage();

    @Test
    void openArticleTest() {
        step("Нажимаем на поисковую строку", () -> {
            mainPage.clickSearchWikipediaIcon();
        });

        step("Вводим 'Selenide' в поисковую строку", () -> {
            searchPage.searchPageSetValue("Selenide");
        });

        step("Открываем первую статью из результатов", () -> {
            searchPage.clickTheFirstResult();
        });

        step("Проверяем наличие контента", () -> {
            searchPage.checkArticleContent();
        });
    }
}
