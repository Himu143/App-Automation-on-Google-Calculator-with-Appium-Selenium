import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class TestRunner extends  Setup{
    @Test(priority = 1,description = "sum of two number")
    public void doSum() throws InterruptedException {
        CalcScreen calcScreen=new CalcScreen(driver);
        String sum= calcScreen.doSum();
        System.out.println(sum);
        Assert.assertEquals(sum,"14");

    }
@Test(priority = 2,description = "sub of two number")
    public void doSub() throws InterruptedException {
        CalcScreen calcScreen=new CalcScreen(driver);
        String sub= calcScreen.doSub();
        System.out.println(sub);
        Assert.assertEquals(sub,"5");
    }
    @Test(priority = 3,description = "multiply of two number")
    public void doMul() throws InterruptedException {
        CalcScreen calcScreen=new CalcScreen(driver);
        String mul= calcScreen.doMul();
        System.out.println(mul);
        Assert.assertEquals(mul,"70");
    }
    @Test(priority = 4,description = "Divide of two number and multiply with divided result")
    public void doDivAndMul() throws InterruptedException {
        CalcScreen calcScreen=new CalcScreen(driver);
        String divAndMul = calcScreen.doDivAndMul();
        System.out.println(divAndMul);
        Assert.assertEquals(divAndMul,"70");
    }
    @Test(priority = 5,description = "Solve this series (100+200-100*2/5)")
    public void doSeries() throws InterruptedException {
        CalcScreen calcScreen=new CalcScreen(driver);
        String series = calcScreen.doSeries();
        System.out.println(series);
        Assert.assertEquals(series,"260");
    }
@AfterMethod
    public void clearScreen(){
        CalcScreen calcScreen=new CalcScreen(driver);
        calcScreen.btnClr.click();
    }
}
