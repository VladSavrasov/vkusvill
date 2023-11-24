package Steps;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import pages.MainPage;

import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;

public class MainPageStep extends MainPage  {

    @Step("Открыть попап Меню")
    public void clickMenu() {
        menu.hover().parent();
    }
    @Step("Открыть попап Каталог")
    public MainPage clickCatalog() {
        catalog.hover().ancestor("div");
        return this;
    }
    @Step("Перейти во вкладку Новинки")
    public void clickNewProducts() {newProducts.click();}
    @Step("Перейти на страницу рецептов")
    public void clickRecypes() {recypes.click();}
    @Step("Перейти на страницу вокансий")
    public void clickVacancys() {
        vacancys.click();
    }
    @Step("Перейти в корзину")
    public void clickCart() {
        cart.click();
    }
    @Step("Проверить наличие Текста {value}")
    public void assertionStep(String value){
        $(withText(value)).should(Condition.exist);
    }
}

