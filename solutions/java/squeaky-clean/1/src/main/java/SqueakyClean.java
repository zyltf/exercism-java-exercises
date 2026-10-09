class SqueakyClean {
    static String clean(String identifier) {
        char[] array = identifier.toCharArray();
        StringBuilder builder = new StringBuilder();

        for (int i=0; i < array.length; i++){
            if (Character.isLetter(array[i])) builder.append(array[i]);
            else {
                switch (array[i]) {
                    case ' ' -> builder.append('_');
                    case '-' -> {
                        builder.append(Character.toUpperCase(array[i+1]));
                        i++;
                    }
                    case '4' -> builder.append('a');
                    case '3' -> builder.append('e');
                    case '0' -> builder.append('o');
                    case '1' -> builder.append('l');
                    case '7' -> builder.append('t');
                }
            }
            

        }
        return builder.toString();
    }
}
