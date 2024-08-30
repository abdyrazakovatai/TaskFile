public class Main {
    public static void main(String[] args) {
//        Параметирине String тибинде соз алып ал созду тескерисинен кылып кайтарган метод туз.

        String text = "Banan";
        System.out.println(reverseString(text));
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");

//        2. StringBuilder аркылуу создордун массивдерин алып, аларды бир сапка бириктирген метод түз.

        StringBuilder[] stringBuilder = {
                new StringBuilder("Apple"),
                new StringBuilder("Banan"),
                new StringBuilder("Water Melen"),
                new StringBuilder("Cucumber"),
                new StringBuilder("Potato"),
                new StringBuilder("Tomato")};

        System.out.println(lineMethod(stringBuilder));
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");


//        3. Параметирине соз алып ал создун ичинде канча ундуу тамга бар экенин эсептеген метод туз.

        String s = "sdfe";
        tamgaMethod(s);

//        4. StringBuilder жардамы менен берилген. соз палиндром экенин текшеруучу метод туз.
        String word = "ata";

        System.out.println(polindromMethod(word));

//        5. StringBuilder аркылуу сүйлөмдөгү ар бир сөздүн биринчи тамгасын баш тамга менен жазуучу  метод туз.

        uppercaseMethod("banan potato apple");

//        6. String жана StringBuilder жардамы менен сүйлөмдөгү сөздөрдүн санын эсептөөчу метод туз.
        countText("afadf afadfs sdfasdf safdasd dfddsfdsgd sdfsadgf");

//        7. StringBuilder аркылуу ар бир тамганын өзүнүн ASCII коду менен алмаштырган метод туз.

        String input = "atai";
        System.out.println(asciiMethod(input));


//        8. StringBuilder аркылуу cуйломдон бардык боштуктарды (пробелдерди) алып салуучу метод туз.

        String a = "ssdfas asdfsd sdfasd sdfasdf sdfdsfsdfasdf sdfasdfasdf sdfasdfasfs";
        trimMethod(a);

    }

    public static String reverseString(String input) {
        if (input == null) {
            return null;
        }
        return new StringBuilder(input).reverse().toString();
    }

    public static String lineMethod(StringBuilder[] text) {
        StringBuilder stringBuilder = new StringBuilder();
        for (StringBuilder builder : text) {
            stringBuilder.append(builder).append(" ");
        }
        return stringBuilder.toString().trim();
    }


    public static void tamgaMethod(String string) {
        StringBuilder memoryBuilder = new StringBuilder();
        for (char c : string.toCharArray()) {
            if ("аеёиоуыэюяАЕЁИОУЫЭЮЯaeiouAEIOU".indexOf(c) != -1) {
                memoryBuilder.append(c);
            }
        }
        System.out.println(memoryBuilder.length());
    }

    public static boolean polindromMethod(String s) {
        StringBuilder stringBuilder = new StringBuilder(s);
        String s1 = stringBuilder.toString().toLowerCase();
        String reverse = stringBuilder.reverse().toString().toLowerCase();
        return s1.equals(reverse);

    }

    public static void uppercaseMethod(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        String[] words = s.split(" ");

        for (String word : words) {
            if (word.length() > 0) {
                stringBuilder.append(Character.toUpperCase(word.charAt(0)))
                        .append(word.substring(1).toLowerCase()).append(" ");

                System.out.println(stringBuilder.toString().trim());
            }
        }
    }

    public static void countText(String s) {
        int count = 0;
        String[] words = s.split(" ");
        for (String word : words) {
            count++;
        }
        System.out.println(count);
    }

    public static String asciiMethod(String input) {
        StringBuilder sb = new StringBuilder();

        for (char c : input.toCharArray()){
            int askii = (int) c;
            sb.append(askii).append(" ");
        }
        return sb.toString().trim();
    }
    public static void trimMethod(String s){
        String[] strings = s.split(" ");
        for (String string : strings) {
            System.out.print(string.trim());
        }
    }
}
