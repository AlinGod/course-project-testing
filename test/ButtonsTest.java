
import org.junit.Test;
import static org.junit.Assert.*;
import org.netbeans.jemmy.*;
import org.netbeans.jemmy.operators.*;

/**
 *
 * @author acer
 */

public class ButtonsTest {

    public static void main(String[] argv) {
        String[] params = {"ButtonsTest"};
        org.netbeans.jemmy.Test.main(params);
    }

    @Test
    public void runIt() {
        try {

            //Запуск Swing приложения
            new ClassReference("javatest.Form1").startApplication();
            //Поиск JFrame
            JFrameOperator mainFrame = new JFrameOperator("");
            //Делаем небольшую задержку
            //new QueueTool().waitEmpty(200);
            //Ищем кнопку по имени
            JButtonOperator ExButton = new JButtonOperator(mainFrame, "Выход");
            JButtonOperator FindButton = new JButtonOperator(mainFrame, "Найти");

            JButtonOperator ClearButton = new JButtonOperator(mainFrame, "Отчистить");
            //ExButton.push();
            JTextFieldOperator InText = new JTextFieldOperator(mainFrame, "Вершина");
            JTextFieldOperator OutText = new JTextFieldOperator(mainFrame, "Вывод");
            JTextFieldOperator SystemText = new JTextFieldOperator(mainFrame, "Система");
            //Очищаем поле ввода

            InText.clearText();
            OutText.clearText();
            SystemText.clearText();
            InText.enterText("Hello");
            FindButton.push();
            String a;
            a = SystemText.getText();
            if (a.compareTo("Неверный формат данных. Повторите ввод") != 0) {
                fail("AAAA!!!!!!!1");
            }

            ClearButton.push();
            InText.enterText("3");
            FindButton.push();
            a = OutText.getText();
            if (a.compareTo("341") != 0) {
                fail("AAAA!!!!!!!2");
            }
            // два одинаковых подряд 
            ClearButton.push();
            InText.enterText("3");
            FindButton.push();
            a = OutText.getText();
            if (a.compareTo("341") != 0) {
                fail("AAAA!!!!!!!5");
            }
            
            ClearButton.push();
            InText.enterText("3ggr4");
            FindButton.push();
             a = SystemText.getText();
            if (a.compareTo("Неверный формат данных. Повторите ввод") != 0) {
                fail("AAAA!!!!!!!6");
            }

            
            ClearButton.push();
            a = SystemText.getText();
            if (a.compareTo("Очищено") != 0) {
                fail("AAAA!!!!!!!3");
            }

        } catch (Exception e) {
            e.printStackTrace();
            fail("AAAA!!!!!!!4");
        }
        return;

    }

}
