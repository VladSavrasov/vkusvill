import Steps.MainPageStep;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class VkusvilTest extends BaseTest {
    MainPageStep mainPageStep = new MainPageStep();

    @DisplayName("проверить работу попапа 'Меню'")
    @ParameterizedTest
    @CsvSource("Медиа")
    @Tags({@Tag("High"), @Tag("web")})
    void menuPopupCheck(String value) {
        mainPageStep.clickMenu();
        mainPageStep.assertionStep(value);
    }

    @DisplayName("проверить работу попапа 'Каталог'")
    @ParameterizedTest
    @CsvSource("Новинки")
    @Tags({@Tag("High"), @Tag("web")})
    void catalogPopupCheck(String value) {
        mainPageStep.clickCatalog();
        mainPageStep.clickNewProducts();
        mainPageStep.assertionStep(value);
    }

    @DisplayName("проверить переход на страницу рецептов")
    @ParameterizedTest
    @CsvSource("Рецепты")
    @Tags({@Tag("Medium"), @Tag("web")})
    void recipesPageCheck(String value) {
        mainPageStep.clickRecypes();
        mainPageStep.assertionStep(value);
    }

    @DisplayName("проверить переход на страницу вакансий")
    @ParameterizedTest
    @CsvSource("Работа")
    @Tags({@Tag("High"), @Tag("web")})
    void vacancysPageCheck(String value) {
        mainPageStep.clickVacancys();
        mainPageStep.assertionStep(value);
    }

    @DisplayName("Проверить переход в корзину")
    @ParameterizedTest
    @CsvSource("Корзина")
    @Tags({@Tag("Blocker"), @Tag("web")})
    void cartPageCheck(String value) {
        mainPageStep.clickCart();
        mainPageStep.assertionStep(value);
    }
}
