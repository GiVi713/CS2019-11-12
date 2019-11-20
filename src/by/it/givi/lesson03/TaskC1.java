package by.it.givi.lesson03;

/*
Lesson 03. Конвертер температуры

Метод convertCelsiusToFahrenheit(int Celsius) принимает значение в градусах Цельсия.
Метод должен переводить температуру и возвращать значение в градусах Фаренгейта.

Температура по Цельсию TC и температура по Фаренгейту TF связаны следующим соотношением:
TC = (TF – 32) * 5/9

Пример:
В метод convertCelsiusToFahrenheit на вход подается значение 40.

Пример вывода:
104.0


Требования:
1. Метод convertCelsiusToFahrenheit(int) должен быть не приватным и статическим.
2. Метод convertCelsiusToFahrenheit должен возвращать значение типа double.
3. Метод convertCelsiusToFahrenheit не должен ничего выводить на экран.
4. Метод convertCelsiusToFahrenheit должен правильно переводить градусы Цельсия
в градусы Фаренгейта и возвращать это число.*/


class TaskC1 {
    public static class C1 {
        public static void main(String[] args) {
            System.out.println(convertCelsiusToFahrenheit(40));
        }
        public static double convertCelsiusToFahrenheit(int celsius) {
            double far = 9 / 5.0 * celsius + 32;
            return far;
        }
    }
}
//    public static void main(String[] args) {
//        System.out.println(convertCelsiusToFahrenheit(40));
//    }


