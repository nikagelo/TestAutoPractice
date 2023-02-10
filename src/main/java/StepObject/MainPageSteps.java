package StepObject;

import PageObject.MainPage;
import com.codeborne.selenide.Condition;
import org.example.Main;

import static com.codeborne.selenide.Selenide.sleep;

public class MainPageSteps extends MainPage {
    public  MainPageSteps clickSearchBtn(){
        searchBtn.click();
        return this;
    }
    public MainPageSteps searchInputVisible(){
        searchInput.shouldBe(Condition.visible);
        return this;
    }
    public MainPageSteps searchItem(String searchItemData){
        searchInput.setValue(searchItemData).pressEnter();
        return this;
    }
    public MainPageSteps checkSearchedItem(String searchItemData){
        searchResult.shouldBe(Condition.visible);
        return this;
    }
    public MainPageSteps checkSearchedTest(String searchTestData){
        nothingFound.shouldBe(Condition.visible);
        return this;
    }
    public MainPageSteps addItemToCart(){
        addToCart.scrollIntoView(false).click();
        return this;
    }
    public MainPageSteps itemAddedTxt(){
        addedItemTxt.shouldBe(Condition.visible);
        return this;
    }
    public MainPageSteps openTheCart(){
        goToCart.click();
        return this;
    }
    public MainPageSteps checkName(){
        itemTitle.shouldNotBe(Condition.empty);
        return this;
    }
    public MainPageSteps checkColor(){
        itemColor.shouldNotBe(Condition.empty);
        return this;
    }
    public MainPageSteps checkID(){
        itemID.shouldNotBe(Condition.empty);
        return this;
    }
    public MainPageSteps checkNum(){
        itemNum.shouldNotBe(Condition.empty);
        return this;
    }
    public MainPageSteps checkPrice(){
        itemPrice.shouldNotBe(Condition.empty);
        return this;
    }
    public MainPageSteps checkFullPrice(){
        itemFullPrice.shouldNotBe(Condition.empty);
        return this;
    }

}
