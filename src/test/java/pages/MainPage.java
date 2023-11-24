package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byTagAndText;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class MainPage {
    public SelenideElement menu = $(byText("Меню"));
    public SelenideElement catalog = $(byText("Каталог"));
    public SelenideElement newProducts = $(byText("Новинки"));
    public SelenideElement recypes = $(byTagAndText("div", "Рецепты"));
    public SelenideElement vacancys = $(byText("Вакансии"));
    public SelenideElement cart = $(byText("Корзина"));

}

