package com.javarush.task.task29.task2908;

import java.util.Objects;

public class Copyright implements Computable<Copyright.Period, String> {
    @Override
    public String compute(Copyright.Period period) throws InterruptedException {
        return "All rights reserved (c) " + period.firstYear + "-" + period.secondYear;
    }

    public static class Period {
        int firstYear;
        int secondYear;

        public Period(int firstYear, int secondYear) {
            this.firstYear = firstYear;
            this.secondYear = secondYear;
        }

        @Override
        public String toString() {
            return "Period{" +
                    "firstYear=" + firstYear +
                    ", secondYear=" + secondYear +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Period period = (Period) o;
            return firstYear == period.firstYear && secondYear == period.secondYear;
        }

        @Override
        public int hashCode() {
            int result = firstYear;
            result = 31 * result + secondYear;
            return result;
        }
    }
}
