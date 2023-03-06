package utils;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;

public class BaseStep extends Base{

    protected void chkTxt(SelenideElement elm, String lblTxt) {
        chkVisible(elm);
        elm.shouldHave(Condition.text(lblTxt));
    }

    protected void chkVisible(SelenideElement fld) {
        chkCnd(fld, visible);
    }

    protected void chkCnd(SelenideElement fld, Condition... cnds) {
        for (Condition cnd : cnds) {
            fld.shouldBe(cnd);
        }
    }

}
