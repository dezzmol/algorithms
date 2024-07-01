package coderun.season_2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class T423_NearestStop_Test {

    @Test
    @DisplayName("Базовый тест")
    void testBase() {
        String test = "2\n1\n";
        String result = NearestStop423.lengthFromBusToStop(3, 2, new long[]{1, 3, 5}, new long[]{4, 1});
        Assertions.assertEquals(test, result);
    }

    @Test
    @DisplayName("big data")
    void testBigData() {
        String test = "32\n1\n63\n";

        long[] coordsOfStops = Arrays.stream(new long[]{
                -2000000000, -1000000000, -500000000, -250000000, -125000000, -62500000, -31250000, -15625000, -7812500,
                -3906250, -1953125, -976562, -488281, -244140, -122070, -61035, -30517, -15258, -7629, -3814, -1907,
                -953, -476, -238, -119, -59, -29, -14, -7, -3, -1, 0, 1, 3, 7, 14, 29,
                2000000000, 1000000000, 500000000, 250000000, 125000000, 62500000, 31250000, 15625000, 7812500, 3906250,
                1953125, 976562, 488281, 244140, 122070, 61035, 30517, 15258, 7629, 3814, 1907, 953, 476, 238, 119, 59
        }).sorted().toArray();

        long[] coordsOfBus = new long[]{0, -1999999999, 1999999999};

        String result = NearestStop423.lengthFromBusToStop(coordsOfStops.length, coordsOfBus.length, coordsOfStops, coordsOfBus);
        Assertions.assertEquals(test, result);
    }

    @Test
    @DisplayName("До начала")
    void testBeforeList() {
        String test = "1\n";
        String result = NearestStop423.lengthFromBusToStop(3, 1, new long[]{3, 5, 7}, new long[]{1});
        Assertions.assertEquals(test, result);
    }

    @Test
    @DisplayName("После конца")
    void testAfterList() {
        String test = "3\n";
        String result = NearestStop423.lengthFromBusToStop(3, 1, new long[]{3, 5, 7}, new long[]{9});
        Assertions.assertEquals(test, result);
    }

    @Test
    @DisplayName("Первый элемент")
    void testFirstElem() {
        String test = "1\n";
        String result = NearestStop423.lengthFromBusToStop(3, 1, new long[]{3, 5, 7}, new long[]{3});
        Assertions.assertEquals(test, result);
    }

    @Test
    @DisplayName("Последний элемент")
    void testLastElem() {
        String test = "3\n";
        String result = NearestStop423.lengthFromBusToStop(3, 1, new long[]{3, 5, 7}, new long[]{7});
        Assertions.assertEquals(test, result);
    }

    @Test
    @DisplayName("Std массив. Первая половина. Совпадает с элементом")
    void test3Method() {
        String test = "2\n";
        String result = NearestStop423.lengthFromBusToStop(7, 1, new long[]{1, 3, 5, 7, 9, 11, 13}, new long[]{3});
        Assertions.assertEquals(test, result);
    }

    @Test
    @DisplayName("Std массив. Середина. Совпадает с элементом")
    void test4Method() {
        String test = "4\n";
        String result = NearestStop423.lengthFromBusToStop(7, 1, new long[]{1, 3, 5, 7, 9, 11, 13}, new long[]{7});
        Assertions.assertEquals(test, result);
    }

    @Test
    @DisplayName("Std массив. Вторая половина. Совпадает с элементом")
    void test5Method() {
        String test = "6\n";
        String result = NearestStop423.lengthFromBusToStop(7, 1, new long[]{1, 3, 5, 7, 9, 11, 13}, new long[]{11});
        Assertions.assertEquals(test, result);
    }

    @Test
    @DisplayName("Std массив. Первая половина. Не совпадает с элементами. Ближе к меньшему индексу")
    void test6Method() {
        String test = "2\n";
        String result = NearestStop423.lengthFromBusToStop(7, 1, new long[]{1, 3, 6, 7, 9, 11, 13}, new long[]{4});
        Assertions.assertEquals(test, result);
    }

    @Test
    @DisplayName("Std массив. Первая половина. Не совпадает с элементами. Ближе к большему индексу")
    void test7Method() {
        String test = "3\n";
        String result = NearestStop423.lengthFromBusToStop(7, 1, new long[]{1, 3, 6, 7, 9, 11, 13}, new long[]{5});
        Assertions.assertEquals(test, result);
    }

    @Test
    @DisplayName("Std массив. Первая половина. Не совпадает с элементами. Расстояние до элементов равно")
    void test8Method() {
        String test = "2\n";
        String result = NearestStop423.lengthFromBusToStop(7, 1, new long[]{1, 3, 5, 7, 9, 11, 13}, new long[]{4});
        Assertions.assertEquals(test, result);
    }

    @Test
    @DisplayName("Std массив. Середина. Не совпадает с элементами. Ближе к меньшему индексу")
    void test9Method() {
        String test = "3\n";
        String result = NearestStop423.lengthFromBusToStop(6, 1, new long[]{1, 3, 5, 9, 11, 13}, new long[]{6});
        Assertions.assertEquals(test, result);
    }

    @Test
    @DisplayName("Std массив. Середина. Не совпадает с элементами. Ближе к большему индексу")
    void test10Method() {
        String test = "4\n";
        String result = NearestStop423.lengthFromBusToStop(6, 1, new long[]{1, 3, 5, 9, 11, 13}, new long[]{8});
        Assertions.assertEquals(test, result);
    }

    @Test
    @DisplayName("Std массив. Середина. Не совпадает с элементами. Расстояние до элементов равно")
    void test11Method() {
        String test = "3\n";
        String result = NearestStop423.lengthFromBusToStop(6, 1, new long[]{1, 3, 5, 9, 11, 13}, new long[]{7});
        Assertions.assertEquals(test, result);
    }

    @Test
    @DisplayName("Std массив. Вторая половина. Не совпадает с элементами. Ближе к меньшему индексу")
    void test12Method() {
        String test = "5\n";
        String result = NearestStop423.lengthFromBusToStop(6, 1, new long[]{1, 3, 6, 7, 9, 13}, new long[]{10});
        Assertions.assertEquals(test, result);
    }

    @Test
    @DisplayName("Std массив. Вторая половина. Не совпадает с элементами. Ближе к большему индексу")
    void test13Method() {
        String test = "6\n";
        String result = NearestStop423.lengthFromBusToStop(6, 1, new long[]{1, 3, 6, 7, 9, 13}, new long[]{12});
        Assertions.assertEquals(test, result);
    }

    @Test
    @DisplayName("Std массив. Вторая половина. Не совпадает с элементами. Расстояние до элементов равно")
    void test14Method() {
        String test = "5\n";
        String result = NearestStop423.lengthFromBusToStop(6, 1, new long[]{1, 3, 5, 7, 9, 13}, new long[]{11});
        Assertions.assertEquals(test, result);
    }

    @Test
    @DisplayName("Массив с одинаковыми элементами. Совпадает с повторяющимся элементом. Из нескольких одинаковых выбирается наименьший индекс")
    void test1Method() {
        String test = "2\n";
        String result = NearestStop423.lengthFromBusToStop(4, 1, new long[]{1, 3, 3, 3}, new long[]{3});
        Assertions.assertEquals(test, result);
    }

    @Test
    @DisplayName("Массив с одинаковыми элементами. Середина. Не совпадает с элементом. Расстояние до элементов равно.")
    void test2Method() {
        String test = "3\n";
        String result = NearestStop423.lengthFromBusToStop(6, 1, new long[]{3, 3, 3, 5, 5, 5}, new long[]{4});
        Assertions.assertEquals(test, result);
    }

    @Test
    @DisplayName("Массив из одного элемента. Проверяется одна координата. Совпадает с элементом.")
    void test15Method() {
        String test = "1\n";
        String result = NearestStop423.lengthFromBusToStop(1, 1, new long[]{3}, new long[]{3});
        Assertions.assertEquals(test, result);
    }

    @Test
    @DisplayName("Массив из одного элемента. Проверяется одна координата. Не совпадает с элементом. Меньше элемента массива")
    void test16Method() {
        String test = "1\n";
        String result = NearestStop423.lengthFromBusToStop(1, 1, new long[]{3}, new long[]{1});
        Assertions.assertEquals(test, result);
    }

    @Test
    @DisplayName("Массив из одного элемента. Проверяется одна координата. Не совпадает с элементом. Больше элемента массива")
    void test17Method() {
        String test = "1\n";
        String result = NearestStop423.lengthFromBusToStop(1, 1, new long[]{3}, new long[]{5});
        Assertions.assertEquals(test, result);
    }

    @Test
    @DisplayName("Массив из одного элемента. Проверяется несколько координат. Меньше, равно, больше элемента массива")
    void test18Method() {
        String test = "1\n1\n1\n";
        String result = NearestStop423.lengthFromBusToStop(1, 3, new long[]{3}, new long[]{1, 3, 5});
        Assertions.assertEquals(test, result);
    }

    @Test
    @DisplayName("Массив из одинаковых элементов. Проверяется несколько координат. Меньше, равно, больше элементов массива")
    void test19Method() {
        String test = "1\n1\n3\n";
        String result = NearestStop423.lengthFromBusToStop(3, 3, new long[]{3, 3, 3}, new long[]{1, 3, 5});
        Assertions.assertEquals(test, result);
    }

    //                                         ОТРИЦАТЕЛЬНЫЕ ЭЛЕМЕНТЫ-остановки
    //------------------------------------------------------------------------------------------------------------------

    @Test
    @DisplayName("Отриц числа. До начала")
    void testBeforeListM() {
        String test = "1\n";
        String result = NearestStop423.lengthFromBusToStop(3, 1, new long[]{-7, -5, -3}, new long[]{-9});
        Assertions.assertEquals(test, result);
    }


    @Test
    @DisplayName("Отриц числа. После конца")
    void testAfterListM() {
        String test = "3\n";
        String result = NearestStop423.lengthFromBusToStop(3, 1, new long[]{-7, -5, -3}, new long[]{-1});
        Assertions.assertEquals(test, result);
    }

    @Test
    @DisplayName("Отриц числа. Первый элемент")
    void testFirstElemM() {
        String test = "1\n";
        String result = NearestStop423.lengthFromBusToStop(3, 1, new long[]{-7, -5, -3}, new long[]{-7});
        Assertions.assertEquals(test, result);
    }

    @Test
    @DisplayName("Отриц числа. Последний элемент")
    void testLastElemM() {
        String test = "3\n";
        String result = NearestStop423.lengthFromBusToStop(3, 1, new long[]{-7, -5, -3}, new long[]{-3});
        Assertions.assertEquals(test, result);
    }

    @Test
    @DisplayName("Отриц числа. Std массив. Первая половина. Совпадает с элементом")
    void test3MethodM() {
        String test = "2\n";
        String result = NearestStop423.lengthFromBusToStop(7, 1, new long[]{-13, -11, -9, -7, -5, -3, -1}, new long[]{-11});
        Assertions.assertEquals(test, result);
    }

    @Test
    @DisplayName("Отриц числа. Std массив. Середина. Совпадает с элементом")
    void test4MethodM() {
        String test = "4\n";
        String result = NearestStop423.lengthFromBusToStop(7, 1, new long[]{-13, -11, -9, -7, -5, -3, -1}, new long[]{-7});
        Assertions.assertEquals(test, result);
    }

    @Test
    @DisplayName("Отриц числа. Std массив. Вторая половина. Совпадает с элементом")
    void test5MethodM() {
        String test = "6\n";
        String result = NearestStop423.lengthFromBusToStop(7, 1, new long[]{-13, -11, -9, -7, -5, -3, -1}, new long[]{-3});
        Assertions.assertEquals(test, result);
    }


    @Test
    @DisplayName("Отриц числа. Std массив. Первая половина. Не совпадает с элементами. Ближе к меньшему индексу")
    void test6MethodM() {
        String test = "2\n";
        String result = NearestStop423.lengthFromBusToStop(7, 1, new long[]{-13, -11, -8, -7, -5, -3, -1}, new long[]{-10});
        Assertions.assertEquals(test, result);
    }


    @Test
    @DisplayName("Отриц числа. Std массив. Первая половина. Не совпадает с элементами. Ближе к большему индексу")
    void test7MethodM() {
        String test = "3\n";
        String result = NearestStop423.lengthFromBusToStop(7, 1, new long[]{-13, -11, -8, -7, -5, -3, -1}, new long[]{-9});
        Assertions.assertEquals(test, result);
    }

    @Test
    @DisplayName("Отриц числа. Std массив. Первая половина. Не совпадает с элементами. Расстояние до элементов равно")
    void test8MethodM() {
        String test = "2\n";
        String result = NearestStop423.lengthFromBusToStop(7, 1, new long[]{-13, -11, -9, -7, -5, -3, -1}, new long[]{-10});
        Assertions.assertEquals(test, result);
    }

    @Test
    @DisplayName("Отриц числа. Std массив. Середина. Не совпадает с элементами. Ближе к меньшему индексу")
    void test9MethodM() {
        String test = "3\n";
        String result = NearestStop423.lengthFromBusToStop(6, 1, new long[]{-13, -11, -9, -5, -3, -1}, new long[]{-8});
        Assertions.assertEquals(test, result);
    }

    @Test
    @DisplayName("Отриц числа. Std массив. Середина. Не совпадает с элементами. Ближе к большему индексу")
    void test10MethodM() {
        String test = "4\n";
        String result = NearestStop423.lengthFromBusToStop(6, 1, new long[]{-13, -11, -9, -5, -3, -1}, new long[]{-6});
        Assertions.assertEquals(test, result);
    }

    @Test
    @DisplayName("Отриц числа. Std массив. Середина. Не совпадает с элементами. Расстояние до элементов равно")
    void test11MethodM() {
        String test = "3\n";
        String result = NearestStop423.lengthFromBusToStop(6, 1, new long[]{-13, -11, -9, -5, -3, -1}, new long[]{-7});
        Assertions.assertEquals(test, result);
    }

    @Test
    @DisplayName("Отриц числа. Std массив. Вторая половина. Не совпадает с элементами. Ближе к меньшему индексу")
    void test12MethodM() {
        String test = "5\n";
        String result = NearestStop423.lengthFromBusToStop(6, 1, new long[]{-13, -11, -9, -5, -4, -1}, new long[]{-3});
        Assertions.assertEquals(test, result);
    }

    @Test
    @DisplayName("Отриц числа. Std массив. Вторая половина. Не совпадает с элементами. Ближе к большему индексу")
    void test13MethodM() {
        String test = "6\n";
        String result = NearestStop423.lengthFromBusToStop(6, 1, new long[]{-13, -11, -9, -5, -4, -1}, new long[]{-2});
        Assertions.assertEquals(test, result);
    }

    @Test
    @DisplayName("Отриц числа. Std массив. Вторая половина. Не совпадает с элементами. Расстояние до элементов равно")
    void test14MethodM() {
        String test = "5\n";
        String result = NearestStop423.lengthFromBusToStop(6, 1, new long[]{-13, -11, -9, -7, -5, -3}, new long[]{-4});
        Assertions.assertEquals(test, result);
    }

    @Test
    @DisplayName("Отриц числа. Массив с одинаковыми элементами. Совпадает с повторяющимся элементом. Из нескольких одинаковых выбирается наименьший индекс")
    void test1MethodM() {
        String test = "2\n";
        String result = NearestStop423.lengthFromBusToStop(4, 1, new long[]{-5, -3, -3, -3}, new long[]{-3});
        Assertions.assertEquals(test, result);
    }

    @Test
    @DisplayName("Отриц числа. Массив с одинаковыми элементами. Середина. Не совпадает с элементом. Расстояние до элементов равно.")
    void test2MethodM() {
        String test = "3\n";
        String result = NearestStop423.lengthFromBusToStop(6, 1, new long[]{-5, -5, -5, -3, -3, -3}, new long[]{-4});
        Assertions.assertEquals(test, result);
    }

    @Test
    @DisplayName("Отриц числа. Массив из одного элемента. Проверяется одна координата. Совпадает с элементом.")
    void test15MethodM() {
        String test = "1\n";
        String result = NearestStop423.lengthFromBusToStop(1, 1, new long[]{-3}, new long[]{-3});
        Assertions.assertEquals(test, result);
    }

    @Test
    @DisplayName("Отриц числа. Массив из одного элемента. Проверяется одна координата. Не совпадает с элементом. Меньше элемента массива")
    void test16MethodM() {
        String test = "1\n";
        String result = NearestStop423.lengthFromBusToStop(1, 1, new long[]{-3}, new long[]{-5});
        Assertions.assertEquals(test, result);
    }

    @Test
    @DisplayName("Отриц числа. Массив из одного элемента. Проверяется одна координата. Не совпадает с элементом. Больше элемента массива")
    void test17MethodM() {
        String test = "1\n";
        String result = NearestStop423.lengthFromBusToStop(1, 1, new long[]{-3}, new long[]{-1});
        Assertions.assertEquals(test, result);
    }

    @Test
    @DisplayName("Отриц числа. Массив из одного элемента. Проверяется несколько координат. Меньше, равно, больше элемента массива")
    void test18MethodM() {
        String test = "1\n1\n1\n";
        String result = NearestStop423.lengthFromBusToStop(1, 3, new long[]{-3}, new long[]{-5, -3, -1});
        Assertions.assertEquals(test, result);
    }

    @Test
    @DisplayName("Отриц числа. Массив из одинаковых элементов. Проверяется несколько координат. Меньше, равно, больше элементов массива")
    void test19MethodM() {
        String test = "1\n1\n3\n";
        String result = NearestStop423.lengthFromBusToStop(3, 3, new long[]{-3, -3, -3}, new long[]{-5, -3, -1});
        Assertions.assertEquals(test, result);
    }

}
