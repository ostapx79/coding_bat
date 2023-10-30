## Strings
- Создайте строку из текста, заключив ее в двойные кавычки `"вот так"`, и используйте `+` для объединения строк в более
крупные строки. В этом примере метод `withNo()` принимает строку и возвращает новую строку с добавленным в начале `"Нет:"`.
    ```java
    public class WithNo {
        public String withNo(String str) {
            return "No:" + str;
        }
    }
    ```
- Для строки `str.substring(i, j)` возвращает строку, которая начинается с индекса `i` и доходит до `j`, но не включая
его. Первый символ в строке имеет индекс `0`, поэтому `str.substring(0, 2)` возвращает строку из первых двух символов.
Метод `str.length()` возвращает длину строки. Сравните дле строки следующим образом
`str.equals(str2)`. Не сравнивайте две строки с помощью `==`, это выглядит разумно, но не во всех случаях работает
правильно. Этот пример метода `twoE()` возвращает `true`, если строка содержит равно два символа `e`. Код:
`for (int i = 0; i < str.length(); i++) {...}` - это очень стандартный код для просмотра каждой позиции в строке.
    ```java
    public class TwoE {
        public boolean twoE(String str) {
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                String sub = str.substring(i, i + 1);
                if (sub.equals("e")) {
                    count++;
                }
            }
            
            if (count == 2) return true;
            return false;
            // last 2 lines can be written simply as "return (count == 2);"
        }
    }
    ```
- Тип `char` в `Java` представляет собой один символ и записывается в одинарные кавычки, например: `e`. Вот версия
метода `twoE()`, которая использует `str.charAt(i)` для доступа к каждому символу строки. Используйте `==` для сравнение
символов.
    ```java
    public class TwoE2 {
        public boolean twoE2(String str) {
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == 'e') count++;
            }
            
            if (count == 2) return true;
            return false;
            // this last if/else can be written simply as "return (count == 2);"
        }
    }
    ```