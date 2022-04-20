package Tests;

import java.io.*;

public class Test_2 {
    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String numberGender;
            do {
                System.out.println("Выберите свой пол:\n1 - мужской\n2 - женский");
                numberGender = reader.readLine();
            } while (!numberGender.equals("1") && !numberGender.equals("2"));

            Gender gender = null;
            switch (numberGender) {
                case "1":
                    gender = Gender.MAN;
                    break;
                case "2":
                    gender = Gender.WOMAN;
                    break;
            }

            int height = 0, age = 0;
            double weight = 0, protein = 0, fat = 0, percentFat = 0;
            try {
                System.out.println("Введите свой вес (кг):");
                weight = Double.parseDouble(reader.readLine());
                System.out.println("Введите процент подкожного жира:");
                percentFat = Double.parseDouble(reader.readLine());
                System.out.println("Введите свой рост:");
                height = Integer.parseInt(reader.readLine());
                System.out.println("Введите свой возраст:");
                age = Integer.parseInt(reader.readLine());
                System.out.println("Введите количество грамм белка на килограмм веса тела:");
                protein = Double.parseDouble(reader.readLine());
                System.out.println("Введите количество грамм жиров на килограмм веса тела:");
                fat = Double.parseDouble(reader.readLine());
            } catch (NumberFormatException e) {
                System.out.println("Ошибка.Неверный формат.");
            }
            Calories calories = new Calories(gender, weight, height, age);
            int calorie = calories.harris_benedict();
            System.out.println("Ваш минимум калорий: " + calorie);
            ProteinFatCarbohydrate proteinFatCarbohydrate = calories.getProteinFatCarbohydrate(protein, fat, calorie, percentFat);
            System.out.println(proteinFatCarbohydrate);
        }
    }

    public static class Calories {
        private final double CALORIE_PROTEIN = 4.2;
        private final double CALORIE_FAT = 9.29;
        private final double CALORIE_CARBOHYDRATE= 4.2;
        Gender sex;
        int height, age;
        double weight;

        public Calories(Gender sex, double weight, int height, int age) {
            this.sex = sex;
            this.weight = weight;
            this.height = height;
            this.age = age;
        }

        public int harris_benedict() {
            return sex.equals(Gender.MAN)? (int) ((66.5 + (13.76 * weight) + (5.003 * height) - (6.755 * age))) :
                    (int) ((655 + (9.563 * weight) + (1.850 * height) - (4.676 * age)));
        }

        public ProteinFatCarbohydrate getProteinFatCarbohydrate(double protein, double fat, int calorie, double percentFat) {
            double pureWeight = weight * (1 - (percentFat / 100));
            double fullProtein = pureWeight * protein;
            double fullFat = pureWeight * fat;
            double calorieProtein = CALORIE_PROTEIN * fullProtein;
            double calorieFat = CALORIE_FAT * fullFat;
            double calorieCarbohydrate = calorie - calorieProtein - calorieFat;
            double fullCarbohydrate = calorieCarbohydrate / CALORIE_CARBOHYDRATE;
            return new ProteinFatCarbohydrate(fullProtein, fullFat, fullCarbohydrate, calorieProtein, calorieFat, calorieCarbohydrate);
        }
    }

    public enum Gender {
        MAN,
        WOMAN
    }

    public static class ProteinFatCarbohydrate {
        private double weightProtein;
        private double weightFat;
        private double weightCarbohydrate;
        private double percentProtein;
        private double percentFat;
        private double percentCarbohydrate;

        public ProteinFatCarbohydrate(double weightProtein, double weightFat, double weightCarbohydrate, double calorieProtein, double calorieFat, double calorieCarbohydrate) {
            this.weightProtein = weightProtein;
            this.weightFat = weightFat;
            this.weightCarbohydrate = weightCarbohydrate;
            double calories = calorieProtein + calorieFat + calorieCarbohydrate;
            this.percentProtein = calorieProtein * 100 / calories;
            this.percentFat = calorieFat * 100 / calories;
            this.percentCarbohydrate = calorieCarbohydrate * 100 / calories;
        }

        @Override
        public String toString() {
            return String.format("%dг белка (%d%%)\n%dг жира (%d%%)\n%dг углеводов (%d%%) минимум\n",
                    (int) weightProtein, (int) percentProtein, (int) weightFat, (int) percentFat, (int) weightCarbohydrate, (int) percentCarbohydrate);
        }
    }
}
